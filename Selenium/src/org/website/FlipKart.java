package org.website;
	
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;

	public class FlipKart {

		public static void main(String[] args) throws InterruptedException  {
			
			System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			public Void test1()
			{
			
			WebElement close = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]"));
			close.click();
			
			WebElement searchmod = driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]"));
			searchmod.click();
			searchmod.sendKeys("iphone");
			
			WebElement submit = driver.findElement(By.xpath("//button[contains(@type ,'submit')]"));
			submit.click();
			
			
			
			
			String parenturl = driver.getWindowHandle();
			
			Set<String> childurl = driver.getWindowHandles();
			
			for (String x: childurl) {
				if(!parenturl.equals(x))
				{
					driver.switchTo().window(x);
				}
				
			}
			}
			
			public void test2()
			{
			WebElement m = driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 11 (Black, 128 GB)')]"));
			m.click();
			
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement cart = driver.findElement(By.xpath("//span[@class='_3iRXzi']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",cart);
			
			
			Thread.sleep(3000);
			
			}
			
			public void test3()
			{
			
			WebElement price = driver.findElement(By.xpath("(//div[text()='₹51,900'][1])"));
			String text1 = price.getText();
			System.out.println(text1);
			
			String prices = m.getText();
			System.out.println(prices);
			
	     	WebElement mob = driver.findElement(By.xpath("//div[contains(@class,'_4rR01T')]"));
			mob.click();
			}
		
		}
}
