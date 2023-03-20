package Xpath;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.urbanladder.com");
			
			driver.manage().window().maximize();
			
			Thread.sleep(10000);
			
			WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
			
			close.click();
			
			WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
			
			search.sendKeys("sofa",Keys.ENTER);
	}

}
