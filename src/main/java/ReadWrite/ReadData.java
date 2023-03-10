package ReadWrite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	public static void main(String arss[]) throws IOException
	{
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(f);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//workbook.getSheetAt(0);
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		System.out.println(totalrows);
		System.out.println(totalcells);
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				//1st method
				//XSSFCell cell=currentRow.getCell(c);
				//String value=cell.toString();
				//2nd method
				String value=currentRow.getCell(c).toString();
				System.out.println(value);
			}
			System.out.println(" ");
		}
		workbook.close();
		f.close();		
		
	}

}
