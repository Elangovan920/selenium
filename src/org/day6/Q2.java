package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.*;

public class Q2 {
        public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
        
        WebElement dd = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        Actions a= new Actions(driver);
        Robot r= new Robot();
       dd.click();
     WebElement dv = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[11]"));
       a.contextClick(dv).perform();
       for(int i=0;i<5;i++) {
    	   r.keyPress(KeyEvent.VK_DOWN);
    	   r.keyRelease(KeyEvent.VK_DOWN);
       }
    	   r.keyPress(KeyEvent.VK_ENTER);
    	   r.keyRelease(KeyEvent.VK_ENTER);
       
       
       
//      a.doubleClick(dd).perform();
//       r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_A);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_A);
//        a.contextClick(dv).perform();
//        WebElement dv = driver.findElement(By.xpath("//input[@type='password']"));
//        dv.click();
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        
//         
       
//       
////        
//    r.keyPress(KeyEvent.VK_ENTER);
//      r.keyRelease(KeyEvent.VK_ENTER);
        
//        WebElement rr = driver.findElement(By.xpath("(//a[@target='_blank'])[102]"));
//        a.moveToElement(rr).perform();
//        a.contextClick(rr).perform();
 //       Robot r= new Robot();
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//        
        
        
        
        }
}
