package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.CapturescreenshotforfailedTestCases;

public class Baseclass {
	public static Properties prop; // prop is the reference variable for property variable

	public static void readFromPropertiesFile() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//Properties//Config.properties");
		prop.load(ip);
	}

	public WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException {
		readFromPropertiesFile();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("baseURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult itestResult) throws IOException {
		if (itestResult.getStatus() == ITestResult.FAILURE) {
			CapturescreenshotforfailedTestCases sc = new CapturescreenshotforfailedTestCases();
			sc.captureScreenShotForFailedTestcase(driver, itestResult.getName());
		}
		driver.close();
	}

}
