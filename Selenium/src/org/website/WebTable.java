package org.website;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
   
public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
	WebElement body = driver.findElement(By.tagName("tbody"));
	List<WebElement> row = body.findElements(By.tagName("tr"));
	
	
	
	
	for(int i=0;i<row.size();i++)
	{
		WebElement containrow = row.get(i);
		
		List<WebElement> datas = containrow.findElements(By.tagName("td"));
		
	//	for (int j = 0; j < datas.size(); j++) {
			
			WebElement alldata = datas.get(0);
			String companyname = alldata.getText();
			//System.out.println(companyname);

			TakesScreenshot tk = (TakesScreenshot)driver;
			File source = tk.getScreenshotAs(OutputType.FILE);
			File destination = new File(".//screenshot//report.png");
			
			FileUtils.copyFile(source,destination);
			
			
			if(companyname.equals("IDFC L"))
			{
				WebElement price = datas.get(3);
				String val = price.getText();
				System.out.println(companyname+"  :  "+val);
			}
		
			
		else
			{
				System.out.println("company not avaliable");
		}
	//	}
			}
			
	
}
}
