package org.website;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		   
		File f = new File("C:\\Users\\Susi\\eclipse-workspace\\apr\\Selenium\\excel\\demo.xls");
	//	 f.createNewFile();
	

		XSSFWorkbook xl = new XSSFWorkbook();
		
		XSSFSheet xlsheet = xl.createSheet("expence");
		
		XSSFRow row = xlsheet.createRow(1);
		
		XSSFCell cell = row.createCell(1);
		
		cell.setCellValue("sathees");
		
		FileOutputStream output = new FileOutputStream(f);
		
		xl.write(output);
		
		xl.close();
		
		FileInputStream f1 = new FileInputStream(f);
		
		XSSFWorkbook sheetread = new XSSFWorkbook(f1);
		
		XSSFSheet sheetout = sheetread.getSheet("expence");
		
		XSSFRow row2 = sheetout.getRow(1);
		
		XSSFCell cell2 = row2.getCell(1);
		
		String stringCellValue = cell2.getStringCellValue();
		
		System.out.println(stringCellValue);
}
}
