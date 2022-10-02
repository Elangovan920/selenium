package org.webdrver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	   driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement click = driver.findElement(By.xpath("(//a[@role='tab'])[1]"));
	click.click();
	WebElement tex=	driver.findElement(By.xpath("//b[text()='Velmurugan is a Test Manager at Hexaware.']"));
	String tex1 = tex.getAttribute("innerText");
	System.out.println(tex1);
	WebElement text=	driver.findElement(By.xpath("(//p[contains(text(),'He')])[3]"));
	String text1 = text.getAttribute("innerText");
	System.out.println(text1);
    WebElement un=	driver.findElement(By.xpath("(//p[contains(text(),'He')])[4]"));
	String text2 = un.getAttribute("innerText");
	System.out.println(text2);
	}
	

}
