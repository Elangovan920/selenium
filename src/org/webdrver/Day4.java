package org.webdrver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://www.flipkart.com ");
	  WebElement dragfm1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	dragfm1.click();
	WebElement drag = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));
	// WebElement drag1 = driver.findElement(By.id("bank"));
	Actions as = new Actions(driver);
	as.moveToElement(drag).perform();
	
	WebElement dragfm = driver.findElement(By.id("//a[text()='Bath linen']"));
//	WebElement dragto = driver.findElement(By.id("amt7"));
    as.moveToElement(dragfm).click().build().perform();
//	
//	WebElement dragfm1 = driver.findElement(By.id("credit1"));
//	WebElement dragto1 = driver.findElement(By.id("loan"));
//	as.clickAndHold(dragfm1).moveToElement(dragto1).release().build().perform();
//	
//	WebElement dragfm2 = driver.findElement(By.id("fourth"));
//	WebElement dragto2 = driver.findElement(By.id("amt8"));
//	as.clickAndHold(dragfm2).release(dragto2).build().perform();
	
	
	}

}
