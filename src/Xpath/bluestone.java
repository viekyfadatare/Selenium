package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		
		WebElement ten = driver.findElement(By.xpath("//div[contains(@class,'gms-banner-inner')]"));
		
		ten.click();
		
		Thread.sleep(8000);
		
		WebElement amt = driver.findElement(By.xpath("//input[contains(@id,'amount')]"));
		
		amt.sendKeys("15000");
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
		
		email.sendKeys("abc@gamil.com");
		
		WebElement start = driver.findElement(By.xpath("//input[contains(@id,'gmsStart')]"));
		
		start.click();
	}

}
