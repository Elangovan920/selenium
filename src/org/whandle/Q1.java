package org.whandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" http://www.greenstechnologys.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Actions a = new Actions(driver);
	WebElement mov = driver.findElement(By.xpath("//a[text()='COURSES']"));
	a.moveToElement(mov).perform();
	WebElement mov1 = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
    mov1.click();
   
    WebElement bcl = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
    bcl.click();
   // WebElement mov2 = driver.findElement(By.xpath("//h2[text()='Curriculum']"));
    JavascriptExecutor jj=(JavascriptExecutor) driver;
    Thread.sleep(4000);
  //  WebElement pop = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
  //  pop.click();
    WebElement mov2 = driver.findElement(By.xpath("//h2[text()='Curriculum']"));
    a.moveToElement(mov2).perform();
    jj.executeScript("arguments[0].scrollIntoView(true)", mov2);
    a.contextClick(mov2).perform();
    Robot r = new Robot();
	for(int i=0;i<2;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
