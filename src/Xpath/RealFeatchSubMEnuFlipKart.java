package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RealFeatchSubMEnuFlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		close.click();
		
		Actions a = new Actions(driver);
		
		List<WebElement> sub = driver.findElements(By.xpath("//div[contains(@class,'_37M3Pb')]//DIV"));
		
		for (WebElement submenu : sub) {
			System.out.println(submenu.getText());
			Thread.sleep(2000);
			
			a.moveToElement(submenu).perform();
			
		}
	}

}
