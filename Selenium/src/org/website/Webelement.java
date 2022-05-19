package org.website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;

public class Webelement {

	

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("sathees009@gmail.com");
		
		WebElement passwd = driver.findElement(By.xpath("//input[contains(@id ,'pass')]"));
		passwd.sendKeys("yyyyyyy");
	
		
		
		WebElement login = driver.findElement(By.name("login"));
		
		String text = login.getText();
		System.out.println(text);
		
		String attribute = login.getAttribute("id");
		System.out.println(attribute);
		
		
		
		WebElement er = driver.findElement(By.xpath("//div[contains(text(),'The password that ')]"));
		String er1 = er.getText();
		System.out.println(er1);
		
		WebElement dclick = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
		dclick.click();
		
		
}
}
