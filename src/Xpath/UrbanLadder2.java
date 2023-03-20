package Xpath;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.urbanladder.com");
			
			driver.manage().window().maximize();
			
			Thread.sleep(10000);
			
			WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
			
			close.click();
			
			WebElement store = driver.findElement(By.xpath("//a[contains(., 'Stores ')]"));
					
					store.click();
					
					WebElement hadap = driver.findElement(By.xpath("//h3[contains(. , 'Hadapsar, Pune')]"));
					System.out.println(hadap.getText());
					hadap.click();
			
	}
}