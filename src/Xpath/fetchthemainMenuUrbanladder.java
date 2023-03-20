package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchthemainMenuUrbanladder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		
		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		
		close.click();
		
		List <WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		
		for(WebElement menuName:menus) {
			
			System.out.println(menuName.getText());
			
		}
		
		
	}
	
}