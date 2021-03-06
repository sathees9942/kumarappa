package org.website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
	
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