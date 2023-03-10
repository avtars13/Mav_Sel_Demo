package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class CrossDemo 
{
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	  {
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
  @Test(priority=1)
  public void testlogo() 
  {
	  try
	  {
	  boolean status =driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  Assert.assertEquals(status,true);
	  }
	  catch(Exception e)
	  {
	  Assert.fail();
	  }  
	  
  }
  @Test(priority=2)
  void testHomepageTitle()
  {
	  Assert.assertEquals(driver.getTitle(),"orange title are not matched");
  }
  @Afterclass
  
}
