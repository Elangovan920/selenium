package org.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.*;
public class Q4 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	   driver.get("http://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        WebElement tfr = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
        Actions n= new Actions(driver);
      tfr.click(); 
//        WebElement tyu = driver.findElement(By.xpath("(//li[@class='MainFlyout__item'])[16]"));
//     n.moveToElement(tfr).moveToElement(tyu).build().perform();
//	
	
	
	}
}