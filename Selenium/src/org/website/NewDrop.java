package org.website;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class NewDrop {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("sathees");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("palani");
		
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));	
		radio.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='4']"));
		radio1.click();
		
		WebElement tester = driver.findElement(By.name("profession"));
		tester.click();
		
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		date.sendKeys("09/07/2022");
		
		WebElement tool = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		tool.click();
		
		Thread.sleep(2000);
                WebElement conti = driver.findElement(By.name("continents"));
		
		Select s1 = new Select(conti);
		s1.selectByIndex(0);
		boolean multi = s1.isMultiple();
		System.out.println(multi);
		

		WebElement drop = driver.findElement(By.name("selenium_commands"));
		Select s =new Select(drop);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> droplist = s.getOptions();
		for (WebElement x : droplist) {
			
			System.out.println(x.getText());
			
		}
		s.selectByIndex(0);
		s.selectByIndex(1);
		
	//	s.deselectByVisibleText("Navigation Commands");
		
		WebElement f = s.getFirstSelectedOption();
		System.out.println(f.getText());
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement y : allSelectedOptions) {
		System.out.println(y.getText());
		
	}

		
		

}
}