package org.day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement txt1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//         String ee = txt1.getAttribute("innerText")	;
//		System.out.println(ee);
		txt1.click();
		Alert rf = driver.switchTo().alert();
		String ss = rf.getText();
		System.out.println(ss);
		rf.accept();
//	
		
		
		
	}

}
