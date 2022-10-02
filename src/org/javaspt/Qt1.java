package org.javaspt;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qt1 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Library1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	
//	WebElement fme = driver.findElement(By.xpath("(//frameset[@border='false'])[1]"));
//	WebElement fme1 = driver.findElement(By.xpath("(//frameset[@border='false'])[2]"));
//	driver.switchTo().frame(fme);
//	driver.switchTo().frame(fme1);
//	driver.switchTo().frame("login_page");
	
	
	JavascriptExecutor jj= (JavascriptExecutor)driver;
	WebElement tt2 = driver.findElement(By.name("DUMMY1"));
	jj.executeScript("arguments[0].click()", tt2);
	WebElement tt3 = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	tt3.sendKeys("elango");
	WebElement tt4 = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
	tt4.sendKeys("elango123");
	WebElement tt5 = driver.findElement(By.name("Action.VALIDATE_CREDENTIALS"));
	tt5.click();
//	driver.switchTo().defaultContent();
//	WebElement tt1 = driver.findElement(By.id("Button2"));
//	tt1.click();
//    Alert aa = driver.switchTo().alert();
//    aa.sendKeys("selenium");
//    String text = aa.getText();
//    System.out.println(text);
//    aa.accept();
}}
