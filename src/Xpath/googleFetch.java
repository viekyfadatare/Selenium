package Xpath;

import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleFetch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//div[@class='a4bIc']/input")); 
		
		
		search.sendKeys("java");
		
		Thread.sleep(2000);
		
		List<WebElement> option = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for (WebElement getoption : option) {
			
			System.out.println(getoption.getText());
		}
		
		option.get(2).click();
	}
}
