package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.Generalutilities;

public class Edittimesheetpage
{
	Generalutilities gu = new Generalutilities();

	WebDriver driver;

	public Edittimesheetpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

		
	}
	@FindBy(xpath="//select[@id='timesheet-description']")
	WebElement jobdescription;
	
	@FindBy(xpath="//input[@id='timesheet-direct_client']")
	WebElement directclientcheckbox;
	
	public String DropdownValueofeditpage()
	{
	 return gu.isDropdownvalueselected(jobdescription,"Senior Carer");
	}
	public void clickdirectclientcheckbox()
	{
		directclientcheckbox.click();
	}
	public boolean DirectClientcheckboxisSelected()
	{
		return gu.isCheckboxRadiobuttonselected(directclientcheckbox);
	    
	}
}