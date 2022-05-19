package org.website;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptButton {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("sathees");
		alt.accept();
		
		Thread.sleep(2000);
		
		WebElement result = driver.findElement(By.xpath("//span[@id='promptResult']"));
		String text1 = result.getText();
		System.out.println(text1);
		

}
}
