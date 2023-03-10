package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1
{
	 WebDriver driver =new ChromeDriver();
  @Test(priority=1)
  public void openapp() throws InterruptedException 
  {
	  driver.get("opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
  }
  @Test(priority=2)
  public void login() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
  @Test(priority=3)
  public void closeapp()
  {
	 // driver.close();
	  
  }
}
