package org.webdrver;

import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://www.flipkart.com/ ");
	     WebElement skip = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	     skip.click();
	     WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
	      txt.sendKeys("oneplus 9");
//	      String attribute = txt.getAttribute("value");
//	       System.out.println(attribute);
	
	       WebElement txt1 = driver.findElement(By.xpath("//button[@type='submit']"));
		     txt1.click();
//		      String attributes = txt1.getAttribute("value");
//		       System.out.println(attributes);
	     WebElement txt2 = driver.findElement(By.xpath("(//div[contains(text(),'OnePlus')])[2]"));
		     txt2.click();;
	
	
	
	
	}

}
