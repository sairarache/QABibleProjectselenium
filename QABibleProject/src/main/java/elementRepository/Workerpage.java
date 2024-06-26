package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generalutilities;

public class Workerpage {
	Generalutilities gu = new Generalutilities();

	public Workerpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	WebDriver driver;

	@FindBy(linkText = "Workers")
	WebElement workerPage;

	@FindBy(xpath = "//a[@href='/payrollapp/worker/create']")
	WebElement createWorker;

	@FindBy(xpath = "//select[@id='worker-title']")
	WebElement title;

	public void navigateWorker() {
		workerPage.click();
	}

	public void createworkerpage() {
		createWorker.click();

	}

	public String dropdownvalueofCreateWorkerpage() 
	{
		// TODO Auto-generated method stub

		return gu.isDropdownvalueselected(title, "Ms");

	}

}
