package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelRead;
import utilities.Generalutilities;

public class Loginpage 
{
	ExcelRead ex=new ExcelRead();
	Generalutilities gu = new Generalutilities();

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	WebDriver driver;
	@FindBy(id = "loginform-username")
	WebElement username;

	@FindBy(id = "loginform-password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;

	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	WebElement username1;

	@FindBy(xpath = "//a[@class='logout-btn']")
	WebElement logout;
    
	public void enterUsername(String uname) throws IOException {
		// TODO Auto-generated method stub
		username.sendKeys(uname);
		
	}

	public void enterPassword(String pwd) throws IOException {
		 password.sendKeys(pwd);
		
		
	}

	public void clickLogin() 
	{
		login.click();
	}

	public void navigatetoUserProfile() {
		username1.click();
	}

	public void clickOnLogoutbutton() {
		logout.click();

	}
	
	public String navigatetologoutpage() {
		// TODO Auto-generated method stub
		return gu.getElementText(login);

	}
	public boolean isUsernamepresent()
	{
		return gu.ispresenceofelement(username);
	}
	
	

}
