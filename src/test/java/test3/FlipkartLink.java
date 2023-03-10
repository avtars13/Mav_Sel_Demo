package test3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartLink {
	
	ChromeDriver driver;
	@BeforeClass
	public void invokeBrowser()
	{		
		driver=new ChromeDriver();
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();		
		
	}
	@Test(priority=1)
	public void getLinkCount()
	{
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links on a page :: "+allLink.size());
	}
		@Test(priority=2)
	public void getAllLinkInfo(){
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLink){
			System.out.println("Link Text :: "+ link.getText());
			System.out.println("Link URL  :: "+ link.getAttribute("href"));
			
			System.out.println("-------------------------------------------");
		}
	}
		@AfterClass
		void browserclose()
		{
			driver.quit();
		}

}