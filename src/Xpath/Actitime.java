package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	WebElement un = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	System.out.println(un.isEnabled());
	
	WebElement p = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	
	Thread.sleep(2000);

	
	WebElement username = driver.findElement(By.id("username"));
	
	username.sendKeys(un.getText());
	
	
	WebElement pass = driver.findElement(By.name("pwd"));
	
	pass.sendKeys(p.getText());
	
	
	Thread.sleep(2000);

	
	WebElement login = driver.findElement(By.xpath("//a[contains(@id,'loginButton')]"));
	
	login.click();
	
	System.out.println(login.isDisplayed());
	System.out.println(login.isEnabled());
	System.out.println(login.isSelected());
	
	
}
}
