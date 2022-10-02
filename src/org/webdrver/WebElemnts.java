package org.webdrver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemnts {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
	
		
		
		WebElement ck = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		ck.click();
		WebElement click  =	driver.findElement(By.xpath("//a[@href='/selenium-training?q=banner#enroll-form']"));
		click.click();
		
		WebElement name  =	driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		name.sendKeys("Elangovan");
		WebElement lname  =	driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		lname.sendKeys("M");
		WebElement phno =	driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		phno.sendKeys("8778016943");
		WebElement city  =	driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		city.sendKeys("coimbatore");
		WebElement code  =	driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		code.sendKeys("NdPy");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("elangovan920@gmail.com");
		WebElement cnty = driver.findElement(By.xpath("//select[@name='country']"));
		cnty.sendKeys("India");
		WebElement description = driver.findElement(By.xpath("//textarea[@name='message']"));
		description.sendKeys("I would like to join java selenium");
		
		
		
		
	}
}




































