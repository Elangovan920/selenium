package org.day4;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org .openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class Q11 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\TestNgs\\src\\test\\resources\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();

       driver.get(" https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Thread.sleep(3000);
    WebElement tgb = driver.findElement(By.xpath("//input[@type='text']"));
   tgb.sendKeys("elango");
  
   Robot r = new Robot();
   
   r.keyPress(KeyEvent.VK_F5);
   r.keyRelease(KeyEvent.VK_F5);
   
   
  
//  JavascriptExecutor js=  (JavascriptExecutor) driver;
//  js.executeScript("window.location.reload(true)");
   
   
   
//  js.executeScript("document.body.innerHTML = '<br>'");
//  driver.switchTo().defaultContent();
 
}
}
