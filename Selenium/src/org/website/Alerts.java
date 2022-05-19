package org.website;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		WebElement cid = driver.findElement(By.xpath("//input[@name='cusid']"));
		cid.sendKeys("243535");
		
		WebElement log = driver.findElement(By.xpath("//input[@name='submit']"));
		log.click();
		
		Thread.sleep(2000);
		
		
		Alert alt = driver.switchTo().alert();
		String t1 = alt.getText();
		System.out.println(t1);
		alt.accept();
		

		Alert alt1 = driver.switchTo().alert();
		String t2 = alt1.getText();
		System.out.println(t2);
		alt1.accept();
		
		
		WebElement menu = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		menu.click();
		
		
		

}
}
