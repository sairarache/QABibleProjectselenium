package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import constant.Constant;
import elementRepository.Loginpage;
import elementRepository.Workerpage;
import utilities.ExcelRead;

public class Workerpagetestcase extends Baseclass 
{
  @Test
  public void verifyvalueoftitledropdowninCreateWorkerpage() throws IOException
  {
	  Loginpage lp=new Loginpage(driver);
	  lp.enterUsername(ExcelRead.readStringDatafromExcel(2, 0));
	  lp.enterPassword(ExcelRead.readStringDatafromExcel(2, 1));
	  lp.clickLogin();
	  Workerpage wp=new Workerpage(driver);
	  wp.navigateWorker();
	  wp.createworkerpage();
	  wp.dropdownvalueofCreateWorkerpage();
	  String expected="Ms";
	  String actual=wp.dropdownvalueofCreateWorkerpage();
	  System.out.println(actual);
	  Assert.assertEquals(actual, expected,Constant.errorMessage);

  }
}
