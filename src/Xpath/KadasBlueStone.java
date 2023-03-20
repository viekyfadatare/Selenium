package Xpath;

import java.util.Set;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KadasBlueStone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		
		driver.manage().window().maximize();
		WebElement all = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(all).perform();
		
		WebElement kada = driver.findElement(By.xpath("//a[@title='Kadas']"));
		kada.click();
		WebElement goldk = driver.findElement(By.xpath("//a[@id='pid_8994']/img"));
		goldk.click();
		
		Set<String> tabs= driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
		}
		
		
		WebElement buy = driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']/input"));
		
		Thread.sleep(4000);

		
		buy.click();

	}

}
