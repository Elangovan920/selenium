package org.javaspt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Library1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement sd = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		je.executeScript("arguments[0].setAttribute('value','melangovan')", sd);
		String addr = sd.getAttribute("value");
		System.out.println(addr);
		WebElement sd1 = driver.findElement(By.xpath("(//input[@type='password'])"));
		je.executeScript("arguments[0].setAttribute('value','elangovan')", sd1);
		String addr1 = sd1.getAttribute("value");
		System.out.println(addr1);
		WebElement sd2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		je.executeScript("arguments[0].click()", sd2);
		
		
	}

}
