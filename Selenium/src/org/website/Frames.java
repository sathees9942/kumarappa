package org.website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		
		
		driver.manage().window().maximize();
		List<WebElement> l1 = driver.findElements(By.tagName("iframes"));
		System.out.println();
		
		driver.switchTo().frame("a077aa5e");
		WebElement frame = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frame.click();
		
		driver.switchTo().parentFrame();
		
		WebElement ins = driver.findElement(By.id("philadelphia-field-email"));
		ins.sendKeys("satheesbijd@gmai.com");
}
}