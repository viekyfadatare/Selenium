package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueSton1stSenario {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		
		driver.manage().window().maximize();
		
		WebElement ring = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']"));
		Actions a = new Actions(driver);
		a.moveToElement(ring).perform();
		Thread.sleep(1000);
		
		WebElement diamond = driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']"));
		
		diamond.click();
		
		WebElement price = driver.findElement(By.xpath("//span/span[contains(.,'Price')]"));
		
		a.moveToElement(price).perform();
		
		List<WebElement> dfprice = driver.findElements(By.xpath("//form[@id='price']/div[@class='form-items']/div"));
		
		for (WebElement defaultp : dfprice) {
			System.out.println(defaultp.getText());
			
		}
		
		WebElement polular = driver.findElement(By.xpath("//span/span[contains(.,' Popular ')]"));
		a.moveToElement(polular).perform();
		
		WebElement ltoh = driver.findElement(By.xpath("//div/a[contains(.,'Price Low to High ')]"));
		ltoh.click();
		
	}

}
