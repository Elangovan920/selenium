package org.webdrver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gt {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get(" https://www.swiggy.com/");
	
	WebElement click = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	click.click();
	
	WebElement  clic = driver.findElement(By.xpath("//input[@type='tel']"));
	clic.sendKeys("8778016943");

    WebElement  login = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	login.sendKeys("Elangovan");
	WebElement  passcode = driver.findElement(By.xpath("//input[@type='email']"));
	passcode.sendKeys("elangovan@gmail");
	WebElement  cpin = driver.findElement(By.xpath("//input[@type='password']"));
	cpin.sendKeys("1234156789");
}
}
