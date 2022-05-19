package org.website;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;

public class Action {

	

	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("sathees009@gmail.com");
		
		Thread.sleep(2000);
		WebElement forgot = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password')]"));
		Actions a = new Actions(driver);
		a.moveToElement(forgot).build().perform();
		
		WebElement password = driver.findElement(By.name("pass"));
		a.sendKeys(password,"6817631876").build().perform();
		
		//WebElement login = driver.findElement(By.name("login"));
		//a.click(login).build().perform();
		
		WebElement dclick = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
		a.doubleClick(dclick).build().perform();
		a.moveToElement(dclick).build().perform();
		a.contextClick(dclick).build().perform();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

		

	}
}
