package org.website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {


	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement sday = driver.findElement(By.id("day"));
		
		Select s1 = new Select(sday);
		s1.selectByIndex(0);
		boolean multi = s1.isMultiple();
		System.out.println(multi);
		List<WebElement> datas = s1.getOptions();
		for (WebElement x : datas) {
			
			System.out.println(x.getText());
			
		}
		
	//    WebElement smonth = driver.findElement(By.id("month"));
		
	//	Select s2 = new Select(smonth);
	//	s2.selectByValue("6");
		
//	WebElement syear = driver.findElement(By.id("year"));
		
//		syear.sendKeys("1990");
	}
}
