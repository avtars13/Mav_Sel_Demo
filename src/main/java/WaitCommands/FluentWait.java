package WaitCommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait
{
	public static void main(String args[])
	{
		// WebDriverManager.chromeDriver().setup();//used in earlier version but can be used now also
		WebDriver driver=new ChromeDriver();
		//implicitly wait command(Selenium)
		//applicable for all elemnts in a web page no need to initialize again and again
		FluentWait mywait=new FluentWait(driver,Duration.ofSeconds(10));
		driver.get("");
		WebElement wb=mywait.
		
		
	}


}
