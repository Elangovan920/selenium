package org.webdrver;
 import org.openqa.selenium.*;
 import org.openqa.selenium.chrome.*;
public class Day31 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elangovan\\eclipse-workspace\\Seleniummm\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html ");
	    
//	    WebElement txt = driver.findElement(By.xpath("//a[contains(text(),'Logi')]"));
//	    txt.click();
	    
	    WebElement txt1 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    txt1.sendKeys("pendrive");
//	    String text1= txt1.getAttribute("value");
//	    System.out.println(text1);
	    WebElement txt2 = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
	    txt2.click();
//		String text3 = txt2.getAttribute("value");
//		System.out.println(text3);
		WebElement tyu=driver.findElement(By.xpath("(//img[@border='0'])[1]"));
		tyu.click();
	}

}
