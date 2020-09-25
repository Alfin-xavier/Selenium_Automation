package com.atmecs.data_providers.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.atmecs.data_providers.constants.Constants;

public class ReadDataFromExcel 
{
	public static void ReadData() throws IOException
	{
		File readData = new File(Constants.EXCEL_DATA);
		
		FileInputStream readExcel = new FileInputStream(readData);
		
		XSSFWorkbook workbook = new XSSFWorkbook(readExcel);
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
	}
}
