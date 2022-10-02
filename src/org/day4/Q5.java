package org.day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Q5 {public static void main(String[] args) throws AWTException  {
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://adactinhotelapp.com/");
  // driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
   
          WebElement un = driver.findElement(By.name("username"));
           un.sendKeys("boopathi123");
           
           
           WebElement up = driver.findElement(By.name("password"));
           up.sendKeys("boopathi");
           WebElement login = driver.findElement(By.name("login"));
           login.click();
         WebElement cnty = driver.findElement(By.name("location"));
         Select l = new Select(cnty);
          l.selectByIndex(7);
           WebElement hotel = driver.findElement(By.name("hotels"));
           Select p = new Select(hotel);
           p.selectByIndex(2);
          WebElement rt = driver.findElement(By.name("room_type"));
        Select r = new Select(rt);
          
           
         WebElement nor = driver.findElement(By.name("room_nos"));
           Select nr = new Select(nor);
           nr.selectByIndex(1);
           Robot rew = new Robot();
           WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
           checkin.click();
           rew.keyPress(KeyEvent.VK_CONTROL);
           rew.keyPress(KeyEvent.VK_A);
           rew.keyRelease(KeyEvent.VK_A);
           rew.keyRelease(KeyEvent.VK_CONTROL);
           rew.keyPress(KeyEvent.VK_BACK_SPACE);
           rew.keyRelease(KeyEvent.VK_BACK_SPACE);
           checkin.sendKeys("27/05/2022");
           WebElement checkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
           checkout.click();
           rew.keyPress(KeyEvent.VK_CONTROL);
           rew.keyPress(KeyEvent.VK_A);
           rew.keyRelease(KeyEvent.VK_A);
           rew.keyRelease(KeyEvent.VK_CONTROL);
           rew.keyPress(KeyEvent.VK_BACK_SPACE);
           rew.keyRelease(KeyEvent.VK_BACK_SPACE);
          
           checkout.sendKeys("07/06/2022");
           WebElement rt1 = driver.findElement(By.name("adult_room"));
           Select rm = new Select(rt1);
           List<WebElement> rtype = rm.getOptions();
           for(int i=0; i<rtype.size();i++) {
        	   WebElement tt = rtype.get(i);
        	   String typ = tt.getAttribute("innerText");
        	   System.out.println(typ);
           }

           rm.selectByIndex(2);
           WebElement rt2 = driver.findElement(By.name("child_room"));
          Select rm1 = new Select(rt2);
          rm1.selectByIndex(1);
           WebElement dout1 = driver.findElement(By.name("Submit"));
           dout1.click();
            
          WebElement dout2 = driver.findElement(By.xpath("//input[@class='select_text'][1]"));
           String ssd = dout2.getAttribute("value");
           System.out.print(ssd);
           WebElement dout21 = driver.findElement(By.xpath("//input[@class='select_text'][2]"));
           String ssd1 = dout21.getAttribute("value");
           System.out.print(ssd1);
           WebElement dout24 = driver.findElement(By.xpath("//input[@class='select_text'][3]"));
           String ssd4 = dout24.getAttribute("value");
           System.out.print(ssd4);
           WebElement dout25 = driver.findElement(By.xpath("//input[@class='select_text'][4]"));
           String ssd5 = dout25.getAttribute("value");
           System.out.print(ssd5);
           WebElement dout26 = driver.findElement(By.xpath("//input[@class='select_text'][5]"));
           String ssd6 = dout26.getAttribute("value");
           System.out.print(ssd6);
           WebElement dout27 = driver.findElement(By.xpath("//input[@class='select_text'][6]"));
           String ssd7 = dout27.getAttribute("value");
           System.out.print(ssd7);
           WebElement dout28 = driver.findElement(By.xpath("//input[@class='select_text'][7]"));
           String ssd8 = dout28.getAttribute("value");
           System.out.print(ssd8);
           WebElement dout22 = driver.findElement(By.xpath("//input[@class='select_text'][8]"));
           String ssd2 = dout22.getAttribute("value");
           System.out.print(ssd2);
           WebElement dout23 = driver.findElement(By.xpath("//input[@class='select_text'][9]"));
           String ssd3 = dout23.getAttribute("value");
           System.out.print(ssd3);
           
          

}}
