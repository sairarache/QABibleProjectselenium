package elementRepository;


import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generalutilities;

public class Timesheetpage {

	Generalutilities gu = new Generalutilities();

	WebDriver driver;

	public Timesheetpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "TimeSheet")
	WebElement timesheetpage;

	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/view?id=9632']")
	WebElement tooltipvalue;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody//tr[23]//td[2]")
	WebElement tablevalue;

	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/update?id=9725']")
	WebElement updatepage;

	@FindBy(linkText = "Create Timesheet")
	WebElement createTimesheet;

	@FindBy(id = "file-logo")
	WebElement browserButton;

	@FindBy(xpath = "//button[@title='Upload selected files']")
	WebElement uploadButton;

	@FindBy(id="timesheet-employment_type")
	WebElement employmenttype;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement username;

	public void navigatetoTimesheetpage() {
		timesheetpage.click();
	}

	public String verifytheTooltipValue() {
		return gu.getAttributevalue(tooltipvalue, "title");

	}

	public String verifytheUserNameofHtmlTable() {

		return gu.getElementText(tablevalue);
	}

	public String verifytheDynamictableValue() {
		String locator = null;
		List<WebElement> column = driver
				.findElements(By.xpath("//table[@class='table table-striped table-bordered']//tbody//tr//td[2]"));
		for (int i = 0; i < column.size(); i++)

		{
			if (column.get(i).getText().equals("Sarah Mathew")) {
				locator = "//table[@class='table table-striped table-bordered']//tbody//tr[" + (i + 1) + "]//td[2]";
				System.out.println(locator);
				break;
			}
		}
		return locator;

	}

	public void navigatetoEditPage() {
		updatepage.click();
	}

	public void navigatetoCreatetimesheetPage() {
		createTimesheet.click();
	}

	public void uploadimageinCreateBrowserPage() throws AWTException  {
		
		gu.fileuploadaction(browserButton, driver);
		uploadButton.click();
		 

	}

	public String enterDropdownvalueforemployeeinTimesheetpage()
	{
		return gu.isDropdownvalueselected(employmenttype,"Paye");
	}

}
