package Asach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightCLick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement right = driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(right).perform();
		
		Thread.sleep(5000);
		
		driver.quit();
		


	}

}
