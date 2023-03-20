package Xpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("java");
		Thread.sleep(1000);
		
		List<WebElement> java = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		java.get(0).click();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		System.out.println(links.size());
		
		
		
	}

}
