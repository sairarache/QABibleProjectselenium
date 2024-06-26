package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait 
{
  public void waitforpresenceofElementlocated(WebDriver driver, String locator)
  {
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("locator")));
  }
  public void waitforattributetobe(WebDriver driver,WebElement element,String tooltiptitle,String tooltipvalue)
  {   	 
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));
      wait.until(ExpectedConditions.attributeToBe(element,"tooltiptitle","tooltipvalue"));

  }
  public void waittillAlertisPresent(WebDriver driver)
  {   	 
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));
      wait.until(ExpectedConditions.alertIsPresent());
  }
  public void waitfortextToBePresentInElement(WebDriver driver, WebElement element,String textname)
  {   	 
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));
	  wait.until(ExpectedConditions.textToBePresentInElement(element,"textname"));

  }

}
