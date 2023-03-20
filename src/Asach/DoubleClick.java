package Asach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement doble = driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		
		Actions a = new Actions(driver);
		
		a.doubleClick(doble).perform();
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
