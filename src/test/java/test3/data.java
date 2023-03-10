
package test3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data
{
  @Test(dataProvider="logintestdata")
  public void f(String un,String pwd) throws InterruptedException
  {
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 driver.findElement(By.xpath("//input[@placeholder=\"Nom d'utilisateur\"]") ).sendKeys(un);
 driver.findElement(By.xpath("//input[@placeholder='Mot de passe']") ).sendKeys(pwd);
 driver.findElement(By.xpath("//button[@type='submit']") ).click();
 Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
 
 //driver.quit();
  }
  @DataProvider(name="logintestdata",parallel=true)
  public Object[][] login()
  {
 Object[][] data=new Object[2][2];
 data[0][0]="Admin";
 data[0][1]="admin123";
 data[0][0]="Admin";3
 3
 data[0][1]="admin1234";
 return data;
  }
}

