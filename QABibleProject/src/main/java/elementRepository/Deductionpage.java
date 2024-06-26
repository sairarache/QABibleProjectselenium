package elementRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generalutilities;

public class Deductionpage
{
	Generalutilities gu = new Generalutilities();
    public Deductionpage(WebDriver driver)
    {
    	this.driver=driver;
		PageFactory.initElements(driver, this);

    }
    WebDriver driver;
    
    @FindBy(linkText="Deduction")
    WebElement Deductionpage;
    
    @FindBy(linkText="Add Deduction")
    WebElement AddDeduction;
    
    @FindBy(id="select2-deduction-worker_id-container")
    WebElement worker;
    
    @FindBy(id="deduction-amount")
    WebElement amount;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement savebutton;
    
    @FindBy(xpath="//select[@id='deduction-type']")
    WebElement Type;
    
    @FindBy(xpath="//table[@class='table table-striped table-bordered detail-view']//tbody/tr//td[1]")
    WebElement table;
    
    @FindBy(xpath="//a[@href='/payrollapp/deduction/update?id=5980']")
    WebElement tooltip;
    
    public void navigatetoDeductionpage()
    {
    	Deductionpage.click();
    }
    
    public void navigatetoaddDeductionpage()
    {
    	AddDeduction.click();
    }
    
    public String entervaluetoDropdownType()
    {
    	return gu.isDropdownvalueselected(Type,"Locker Keys");
    }
    public void entervaluetoAmountField()
    {
    	amount.click();
    }
    
    public void amountfieldValue()
    {   
    	gu.enterText(amount,"1000");
    }
     public void clickonSavebutton()
     {
    	 savebutton.click();
     }
     
     public String gettext()
     {
    	 return gu.getElementText(table);
     }
     
     public String tooltipvalue()
     {
    	 
    	 return gu.getAttributevalue(tooltip,"title");
    	 
     }

	public void scrolldown()
	{
	    	 gu.pageScrolldownaction(AddDeduction, driver);
	}
	

    
}
