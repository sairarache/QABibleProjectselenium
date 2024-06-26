package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generalutilities;

public class Dashboardpage
{
	Generalutilities gu=new Generalutilities();

 
 public Dashboardpage(WebDriver driver)
 {
	// TODO Auto-generated constructor stub
	 
		     this.driver=driver;
			PageFactory.initElements(driver, this);

}
 WebDriver driver;
 @FindBy(xpath="//a[@class='dropdown-toggle']")
 WebElement dashboardname;
 
 public String verifydashboardUsername()
 {   
	 gu.getElementText(dashboardname);
	 String username1=dashboardname.getText();
	 return username1;
 }
}
