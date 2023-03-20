package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class featchMainFlipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
	WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	
	close.click();
		
	List<WebElement> menus = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
	
	for(WebElement menuName:menus) {
		
		System.out.println(menuName.getText());
	}
	
	}

}
