package org.website;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;

public class Scroll {

	

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		
	//	WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	//	email.sendKeys("sathees009@gmail.com");
		
		Thread.sleep(2000);
		
	//	WebElement eng = driver.findElement(By.xpath("//li[contains(text(),'Eng')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView(true)",eng);
		
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
	//	WebElement fb = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	//	js.executeScript("arguments[0].scrollIntoView(false)",fb);
		
		js.executeScript("window.scrollBy(0,-600)");
		
		WebElement password = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','122345554')",password);
		
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", login);
		
		
	}
}