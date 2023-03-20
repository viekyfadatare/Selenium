package Xpath;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fliphchartMouse {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
	
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		close.click();
			
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
		Actions a = new Actions(driver);
		for(WebElement menuName:menus) {
			
			System.out.println(menuName.getText());
			
			Thread.sleep(2000);

			a.moveToElement(menuName).perform();
			
			Thread.sleep(2000);
		}
		
		}


	}


