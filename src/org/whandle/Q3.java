package org.whandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Library1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement btnclk = driver.findElement(By.id("heading304"));
		btnclk.click();
		WebElement btnclk1 = driver.findElement(By.xpath("(//a[text()=' TESTNG'])[1]"));
		btnclk1.click();
		
		Set<String> wh = driver.getWindowHandles();
        List<String> l = new ArrayList();
        l.addAll(wh);
        System.out.println(l);
        driver.switchTo().window(l.get(1));
        WebElement btnclk2 = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		String tvt = btnclk2.getText();
		System.out.println(tvt);
}
}