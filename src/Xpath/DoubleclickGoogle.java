package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("java");
		
		Thread.sleep(2000);
		
		List<WebElement> option = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		option.get(0).click();
		Thread.sleep(2000);

		Actions a = new Actions(driver);
		
		WebElement java = driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"));
		
		a.doubleClick(java).perform();
		
	}

}
