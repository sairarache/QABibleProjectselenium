package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generalutilities;

public class Clientpage {

	Generalutilities gu = new Generalutilities();

	public Clientpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	WebDriver driver;

	@FindBy(linkText = "Clients")
	WebElement clientPage;

	@FindBy(linkText = "Create Client")
	WebElement createClient;

	@FindBy(id = "client-require_po")
	WebElement requirepro;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchbutton;

	@FindBy(xpath = "//a[@href='/payrollapp/client/update?id=20']")
	WebElement tooltp;

	public void navigatetoClientpage() {
		clientPage.click();
	}

	public void navigatetoCreateClientpage() {
		createClient.click();
	}
    public void clickrequiroprocheckbox()
    {
    	requirepro.click();
    }
	public boolean checkboxRequirepoinCreateClientsubpage() {
	 
		return gu.isCheckboxRadiobuttonselected(requirepro);
		

	}

	public String backgroundcolourofSearchbuttoninclientpage() {
		String text = gu.getstylePropertyValue(searchbutton, "background-color");
		return text;
	}

	public String tooltipvalueofEditiconinClientspage() {
		String tooltipValue = gu.getAttributevalue(tooltp, "title");
		return tooltipValue;
	}

	

}
