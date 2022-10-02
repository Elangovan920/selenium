package org.day5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\msedgedriver.exe");
	     WebDriver driver= new EdgeDriver();
	     driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement txt1 = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
	Actions a= new Actions(driver);
	
	a.moveToElement(txt1).perform();
	
	WebElement txt2 = driver.findElement(By.xpath("//span[text()='Heels']"));
	txt2.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
