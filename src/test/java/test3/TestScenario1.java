package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestScenario1 
{
	WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl,"https://www.facebook.com/","No redirection happened");
	}
	
	
  @Test(priority=1)
  public void fbsignup() 
  {
		
	    WebElement cah=driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]"));
	    if(cah.isDisplayed())
	    	System.out.println("Create Account method is available");
	    else
	    	System.out.println("Create Account is not visible");
	    cah.click();
	    driver.findElement(By.xpath("//input[@id='u_8_b_mv']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='u_8_d_nD']")).sendKeys("User");
     	driver.findElement(By.xpath("//input[@id='u_8_g_ol']")).sendKeys("testuser@test.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("testPassword");
		
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByVisibleText("21");
		selMonth.selectByVisibleText("Jun");
		selYear.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		
		driver.findElement(By.xpath("//button[@id='u_8_s_L3']")).click();
  }
  @Test(priority=2)
  void AccountVerify() {
	  String Act_acc_url=driver.getCurrentUrl();
	  Assert.assertEquals(Act_acc_url, "https://www.facebook.com/getting_started/","Account not created successfully.");
  }
  @AfterClass
  void closebrowser()
  {
	  driver.quit();
  }
}
