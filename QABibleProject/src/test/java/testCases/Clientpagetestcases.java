package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import elementRepository.Clientpage;
import elementRepository.Loginpage;
import utilities.ExcelRead;

public class Clientpagetestcases extends Baseclass {
	@Test
	public void verifythecheckboxRequirepoinCreateClientsubpage() throws IOException {
		Loginpage lp = new Loginpage(driver);
		lp.enterUsername(ExcelRead.readStringDatafromExcel(2, 0));
		lp.enterPassword(ExcelRead.readStringDatafromExcel(2, 1));
		lp.clickLogin();
		Clientpage cp = new Clientpage(driver);
		cp.navigatetoClientpage();
		cp.navigatetoCreateClientpage();
		cp.clickrequiroprocheckbox();
		cp.checkboxRequirepoinCreateClientsubpage();
		boolean expected =true;
        boolean actual = cp.checkboxRequirepoinCreateClientsubpage();
		System.out.println(actual);
		Assert.assertEquals(actual, expected, "Radiobutton is not selected");

	}

	@Test
	public void verifybackgroundcolourofSearchbuttoninclientpage() throws IOException {
		Loginpage lp = new Loginpage(driver);
		lp.enterUsername(ExcelRead.readStringDatafromExcel(2, 0));
		lp.enterPassword(ExcelRead.readStringDatafromExcel(2, 1));
		lp.clickLogin();
		Clientpage cp = new Clientpage(driver);
		cp.navigatetoClientpage();
		cp.backgroundcolourofSearchbuttoninclientpage();
		String actual = cp.backgroundcolourofSearchbuttoninclientpage();
		String expected = "rgba(51, 122, 183, 1)";
		System.out.println(actual);
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void verifythetooltipvalueofEditiconinClientspage() throws IOException {
		Loginpage lp = new Loginpage(driver);
		lp.enterUsername(ExcelRead.readStringDatafromExcel(2, 0));
		lp.enterPassword(ExcelRead.readStringDatafromExcel(2, 1));
		lp.clickLogin();
		Clientpage cp = new Clientpage(driver);
		cp.navigatetoClientpage();
		cp.tooltipvalueofEditiconinClientspage();
		String actual = cp.tooltipvalueofEditiconinClientspage();
		String expected = "Update";
		System.out.println(actual);
		Assert.assertEquals(actual, expected, "tooltip value is not as expected");
	}
}
