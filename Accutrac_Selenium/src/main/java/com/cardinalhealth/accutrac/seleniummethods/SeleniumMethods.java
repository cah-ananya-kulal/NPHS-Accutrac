package com.cardinalhealth.accutrac.seleniummethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {

WebDriver driver;
	
	public void seleniummethods(){
		// Initialize browser 
		
		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accutrac-admin-dev.apps.cf.np.cahcloud.net");     //Launch Accutrac Application
		driver.manage().window().maximize();                                   // Maximize the window
		
	}
	/*WebElement webElement = driver.findElement(By.cssSelector("#username"));
	webElement.sendKeys(Keys.TAB);
	driver.findElement(By.cssSelector("#username")).sendKeys("ananya.kulal");
	Thread.sleep(1000);
	WebElement webElement1 = driver.findElement(By.cssSelector("#password"));
	webElement1.sendKeys(Keys.TAB);
	driver.findElement(By.cssSelector("#password")).sendKeys("Dec@2019");
	Thread.sleep(1000);
	WebElement webElement2 = driver.findElement(By.cssSelector("body > app-root > ng-component > div > div > div > div > div > div > div > div:nth-child(2) > div > form > div.form-group.row.justify-content-center > div > button"));
	webElement2.sendKeys(Keys.TAB);
	webElement2.sendKeys(Keys.ENTER);
	Thread.sleep(4000);*/
}
