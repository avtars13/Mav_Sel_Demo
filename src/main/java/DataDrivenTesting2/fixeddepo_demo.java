package DataDrivenTesting2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fixeddepo_demo 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String file=System.getProperty("user.dir")+"\\TestData\\data2.xlsx";//path of file
		int row=Xutil.getRowCount(file,"Sheet1");
		for(int i=1;i<=row;i++)
		{
			//readdata from excel
			String princ=Xutil.getCellData(file, "Sheet1", i,0);
			String rateofInterest=Xutil.getCellData(file,"Sheet1", i, 1);
			String per1=Xutil.getCellData(file,"Sheet1",i, 2);
			String per2=Xutil.getCellData(file,"Sheet1",i, 3);
			String fre=Xutil.getCellData(file,"Sheet1",i, 4);			
			String exp_val=Xutil.getCellData(file,"Sheet1",i, 5);
			//pass data to application
			driver.findElement(By.id("principal")).sendKeys(princ);
			driver.findElement(By.id("interest")).sendKeys(rateofInterest);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			
			Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement calculate_btn=driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
			js.executeScript("arguments[0].click()",calculate_btn);//click on calculate
			
//			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
//			
			//validation and update results in excel
			String act_value=driver.findElement(By.id("resp_matval")).getText();
			if(Double.parseDouble(exp_val)==Double.parseDouble(act_value))
			{
				System.out.println("Test Passed");
				Xutil.setCellData(file,"sheet1",i,7,"Passed");
				//Xutil.FillGreenColor(file,"sheet1",i,7);
			}
			else
			{
				System.out.println("Test Failed");
				Xutil.setCellData(file,"sheet1",i,7,"failed");
				//Xutil.FillRedColor(file,"sheet1",i,7);
			}
			Thread.sleep(3000);
			WebElement clear_btn=driver.findElement(By.xpath("//img[@class='PL5']"));
			js.executeScript("arguments[0].click()", clear_btn);//clicking on clear button
//			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
		}
	}

}
