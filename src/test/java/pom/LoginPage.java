package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage 
{
  public WebDriver driver;
  //constructor
  LoginPage(WebDriver driver)
  {
	  this.driver=driver;
	  
  }
  
  //locators
  By imglogo=By.xpath("//img[@alt='company-branding']");
  By txtusername=By.xpath("//img[@alt='company-branding']");
  By imglogo=By.xpath("//img[@alt='company-branding']");
  By imglogo=By.xpath("//img[@alt='company-branding']");
  
  @Test
  public void f() {
  }
}
