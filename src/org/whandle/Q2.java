package org.whandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Library1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions a = new Actions(driver);
	WebElement bn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	bn.click();
	WebElement txtun = driver.findElement(By.name("q"));
	txtun.sendKeys("hp laptop");
	JavascriptExecutor je = (JavascriptExecutor)driver;

	WebElement bn1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	je.executeScript("arguments[0].click()", bn1);
    a.click(bn1).perform();
	//Thread.sleep(3000);
	//JavascriptExecutor je = (JavascriptExecutor)driver;
	WebElement txtun1 = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]"));
	je.executeScript("arguments[0].click()", txtun1);
    
	Set<String> gg = driver.getWindowHandles();
	List<String> l = new ArrayList();
	l.addAll(gg);
	System.out.println(l);
	driver.switchTo().window(l.get(1));
	WebElement txtun2 = driver.findElement(By.xpath("(//div[text()='₹41,990'])[1]"));
	//txtun2.sendKeys("642205");
	String text = txtun2.getAttribute("innerText");
    System.out.println(text);
}}
