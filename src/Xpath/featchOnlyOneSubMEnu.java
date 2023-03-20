package Xpath;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class featchOnlyOneSubMEnu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		WebElement storage = driver.findElement(By.xpath("//ul[@class='topnav bodytext']/li[5]"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.moveToElement(storage).perform();
		
		List<WebElement> sub = driver.findElements(By.xpath("//span[contains(.,'Storage')]/parent::li/descendant::ul[@class='taxonslist']/li"));
		
		for (WebElement submenu : sub) {
			System.out.println(submenu.getText());
			a.moveToElement(submenu).perform();
		}
	}

}
