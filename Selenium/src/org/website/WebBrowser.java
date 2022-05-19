package org.website;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome",".\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		
		System.out.println("The curret url is"+ url);
		
		String tit = driver.getTitle();
		
		System.out.println("The curret title  is"+ tit);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		// driver.close();
		
		driver.quit();
		
	}

}
