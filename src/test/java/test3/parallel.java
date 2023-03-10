package test3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel {
WebDriver driver;

@BeforeClass
@Parameters({"Browser","url"})
void setup(String br,String geturl) throws InterruptedException
{
if(br.equals("Chrome"))
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
}
else if(br.equals("Edge"))
{
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();
}
else
{
WebDriverManager.firefoxdriver().setup();
driver=new FirefoxDriver();
}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get(geturl);
Thread.sleep(5000);
}

@Test(priority=1)
void Maximize()
{
	driver.manage().window().maximize();

}
}