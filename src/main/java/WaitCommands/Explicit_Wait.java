package WaitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait 
{
	public static void main(String args[])
	{
		// WebDriverManager.chromeDriver().setup();//used in earlier version but can be used now also
		WebDriver driver=new ChromeDriver();
		//implicitly wait command(Selenium)
		//applicable for all elemnts in a web page no need to initialize again and again
		WebDriver mywait=(WebDriver) new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("");
		WebElement username=(WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		username.sendKeys("Admin");
		
		
	}

}
