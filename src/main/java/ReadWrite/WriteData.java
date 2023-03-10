package ReadWrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData 
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\untitled 1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
//		//creating rows,cells and update data without loop
//		XSSFRow row1=sheet.createRow(0);
//		row1.createCell(0).setCellValue("Welcome");
//		row1.createCell(1).setCellValue("12345");
//		row1.createCell(2).setCellValue("xyz");
//		XSSFRow row2=sheet.createRow(0);
//		row2.createCell(0).setCellValue("Welcome");
//		row2.createCell(1).setCellValue("12345");
//		row2.createCell(2).setCellValue("xyz");
//		//and so on till how many rows you want to create
		
		//creating rows,cells and upadate data with loop
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<=3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<2;c++)
			{
				//currentrow.createcell(c).setCellValue("Welcome");
				System.out.println("Enter Value");
				String value=sc.next();
				currentrow.createCell(c).setCellValue(value);
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Writing is done");
		
	}

}
