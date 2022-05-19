package org.website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DradDrop {

	

	public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement source1 = driver.findElement(By.xpath("//a[(text()=' BANK ')][1]"));
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement source3 = driver.findElement(By.xpath("//a[(text()=' SALES ')][1]"));
		WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

		WebElement source4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(source1, target1).build().perform();
		a.dragAndDrop(source2, target2).build().perform();
		a.dragAndDrop(source3, target3).build().perform();
		a.dragAndDrop(source4, target4).build().perform();
		
		
	WebElement dm = driver.findElement(By.id("t7"));
	String text1 = dm.getText();
	int i = Integer.parseInt(text1);
	System.out.println("The debit movement:"+i);
	
	WebElement cm = driver.findElement(By.id("t8"));
	String text2 = dm.getText();
	int j = Integer.parseInt(text2);
	System.out.println("The credit movement:"+j);
	
	if (i==j) {
		System.out.println(" Equal");
		
	} else {
		System.out.println("Not equal");

	}
	
	WebElement forgot = driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]"));
	a.moveToElement(forgot).build().perform();
	

	}
}
