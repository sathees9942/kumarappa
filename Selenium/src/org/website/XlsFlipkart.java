package org.website;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XlsFlipkart {
	

		public static void main(String[] args) throws InterruptedException, IOException  {
			
			System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			WebElement close = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]"));
			close.click();
			
			WebElement searchmod = driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]"));
			searchmod.click();
			searchmod.sendKeys("iphone");
			
			WebElement submit = driver.findElement(By.xpath("//button[contains(@type ,'submit')]"));
			submit.click();
			
			Thread.sleep(2000);
			
		List<WebElement> phonelist = driver.findElements(By.xpath("//div[contains(text(),'iPhone')]"));
		
		for (int i = 0; i < phonelist.size(); i++) {
			
			WebElement printlist = phonelist.get(i);
			System.out.println(printlist.getText());
			
		
		}
		
		File f = new File("C:\\Users\\Susi\\eclipse-workspace\\apr\\Selenium\\excel\\demo.xls");
		//	 f.createNewFile();
		

		XSSFWorkbook xl = new XSSFWorkbook();
		
		XSSFSheet xlsheet = xl.createSheet("expence");
		
		XSSFRow row = xlsheet.createRow(0);
		
		XSSFCell cell = row.createCell(0);
		
		
	//	cell.setCellValue(CellValue());
		
		FileOutputStream output = new FileOutputStream(f);
		
		xl.write(output);
		
		xl.close();
		
}

		
		}		
		
	
 		



