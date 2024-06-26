package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import constant.Constant;
import elementRepository.Deductionpage;
import elementRepository.Loginpage;
import utilities.ExcelRead;

public class Deductionpagetestcase extends Baseclass {
	@Test
	public void verifywhetheradddeductionpageTypefieldworksproperly() throws IOException {
		Loginpage lp = new Loginpage(driver);
		lp.enterUsername(ExcelRead.readStringDatafromExcel(2, 0));
		lp.enterPassword(ExcelRead.readStringPasswordData(2, 1));
		lp.clickLogin();
		Deductionpage dp = new Deductionpage(driver);
		dp.navigatetoDeductionpage();
		dp.navigatetoaddDeductionpage();
		dp.entervaluetoDropdownType();
		String actual = dp.entervaluetoDropdownType();
		String expected = "Locker Keys";
		Assert.assertEquals(actual, expected, Constant.dropDown);
	}
	@Test
	public void verifythescrollactionworksfine() throws IOException
	{
		Loginpage lp = new Loginpage(driver);
		lp.enterUsername(ExcelRead.readStringDatafromExcel(2, 0));
		lp.enterPassword(ExcelRead.readStringPasswordData(2, 1));
		lp.clickLogin();
		Deductionpage dp = new Deductionpage(driver);
		dp.navigatetoDeductionpage();
		dp.scrolldown();
		dp.tooltipvalue();
		String actual=dp.tooltipvalue();
		String expected="Update";
		Assert.assertEquals(actual,expected, Constant.tooltipMessage);
		

		
	}

	
}
