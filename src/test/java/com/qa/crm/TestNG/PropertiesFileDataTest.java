package com.qa.crm.TestNG;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PropertiesFileDataTest {
  @Test
  public void PrpData() throws IOException ,FileNotFoundException
  {
	  Properties prop= new Properties();
	  FileInputStream ip=new FileInputStream("C:\\Users\\Varma\\eclipse-new -workspace\\TestingMaven\\lib\\config.properties");
	  prop.load(ip);
	  String browser = prop.getProperty("browser"); //Reading the data from properties file.
	  System.out.println(browser);
	  String TD_File_path = "C:\\Users\\Varma\\eclipse-new -workspace\\TestingMaven\\lib\\MyTestData.xlsx";
	  System.out.println(TD_File_path);

	  XSSFWorkbook wb=new XSSFWorkbook(TD_File_path);
		//XSSFSheet ws=wb.getSheet("Sheet1");
		XSSFSheet ws=wb.getSheetAt(0);
		int rows=ws.getPhysicalNumberOfRows();
		

		
		System.out.println("No of rows in excel file  :"+rows);
		for(int i=0;i<rows;i++)
		{
			String ddValue=ws.getRow(i).getCell(0).getStringCellValue();
			String txtValue=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(ddValue +"---"+txtValue);
		}
		wb.close();
  }
}
