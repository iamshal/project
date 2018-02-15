package automation;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Tk {

	public static void main(String[] args) {

		
		
		 
		 private WebDriver driver;
		 
		 private String baseUrl;

		  private boolean acceptNextAlert = true;
		 
		 private StringBuffer verificationErrors = new StringBuffer();
	
	
		  @BeforeGroups(alwaysRun = true)
		 
		 public void setUp() throws Exception {
		 
		   driver = new FirefoxDriver();
		  
		  baseUrl = "https://demo-dss.tookitaki.com/#/app/pipeline?fn=create";
		 
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 }
	
		  
		@Test
		  public void testTt() throws Exception 
		{
		  
		  driver.get(baseUrl + "/#/login");
		  
		  driver.findElement(By.id("ttaipuser")).clear();
		   
		 driver.findElement(By.id("ttaipuser")).sendKeys("tookitakiuser");
		 
		   driver.findElement(By.id("ttaippass")).clear();
		 
		   driver.findElement(By.id("ttaippass")).sendKeys("Tookitaki123!");
		 
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		   driver.findElement(By.linkText("DS panel")).click();
		  
		  driver.findElement(By.xpath("//input[@type='text']")).clear();
		   
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("income");
		  
		  driver.findElement(By.xpath("(//a[contains(text(),'Summary')])[2]")).click();
		  
		  assertTrue(isElementPresent(By.xpath("//div/label")));
		  
		  driver.findElement(By.xpath("//label[2]")).click();
		   
		 assertTrue(isElementPresent(By.xpath("//label[2]")));
		   
		 driver.findElement(By.xpath("//label[3]")).click();
		 
		   driver.findElement(By.linkText("Calculate Distribution")).click();
		   
		 try
		 {
		     
		 assertTrue(isElementPresent(By.cssSelector("span.data-type")));
		   
		 }
		 catch (Error e)
		 {
		      verificationErrors.append(e.toString());
		   
		 }
		   
		 driver.findElement(By.cssSelector("a.pull-right.modal-cross")).click();
		  
		  driver.findElement(By.xpath("//div[@id='page-wrapper']/div[2]/div/nav/ul/li[4]/div/p")).click();
		   
		 driver.findElement(By.cssSelector("i.fa.fa-external-link")).click();
		  
		  assertTrue(isElementPresent(By.linkText("Confusion Matrix")));
		   
		 assertTrue(isElementPresent(By.linkText("Performance Metrics")));
		 
		   driver.findElement(By.linkText("Regression Output")).click();
		  
		  assertTrue(isElementPresent(By.xpath("//div[@id='page-wrapper']/div[4]/div[2]/div/div/div/div/div/div[5]/div/div[2]/table/tbody/tr[5]/td")));
		
		 }


		  @AfterClass(alwaysRun = true)
		 
		 public void tearDown() throws Exception {
		 
		   driver.quit();
		  
		  String verificationErrorString = verificationErrors.toString();
		   
		 if (!"".equals(verificationErrorString)) {
		 
		     fail(verificationErrorString);
		    }
		  }

		  
		private boolean isElementPresent(By by) {
		 
		   try {
		  
		    driver.findElement(by);
		   
		   return true;
		    } 
		catch (NoSuchElementException e) {

		      return false;
		    }
		  }

		 
		 private boolean isAlertPresent() {
		 
		   try {
		   
		   driver.switchTo().alert();
		 
		     return true;

		    } catch (NoAlertPresentException e) {
		    
		  return false;
		    }

		  }

		 
		 private String closeAlertAndGetItsText() 
		{
		  
		  try {
		 
		     Alert alert = driver.switchTo().alert();
		     
		 String alertText = alert.getText();

		      if (acceptNextAlert) {
		    
		    alert.accept();
		      } 
		else {
		    
		    alert.dismiss();
		     
		 }
		      return alertText;

		    } finally {
		  
		    acceptNextAlert = true;
		    }

		  }
	
	}
		

	
	

