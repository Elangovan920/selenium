package org.day5;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Q4 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	
	driver.get("http://www.greenstechnologys.com/python-training.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 Actions a= new Actions(driver);
	   WebElement ee = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	   ee.click();
	 JavascriptExecutor je = (JavascriptExecutor)driver;
	WebElement addr = driver.findElement(By.xpath("(//div[@class='panel-heading accordion-toggle collapsed'])[24]"));
	//je.executeScript("arguments[0].scrollIntoView(true)", addr);
	je.executeScript("arguments[0].click()", addr);

   WebElement click = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
   je.executeScript("arguments[0].click()", click);
   WebElement click1 = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
   je.executeScript("arguments[0].click()", click1);
//   Robot r= new Robot();
  
   Set<String> wh = driver.getWindowHandles();
   System.out.println(wh);
   
//   List<String> l= new ArrayList();
//   l.addAll(wh);
   int count=0;
   for(String all:wh) {
	   if(count==1) {
		   driver.switchTo().window(all);
	   }
	  count++;
	   
   }
	
	WebElement price = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
	String rs = price.getAttribute("innerText");
	System.out.println(rs);
	}

}
