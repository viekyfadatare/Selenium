package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchGoogle {
	
	@Test
	
	public void tc1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("Kira Advani", Keys.ENTER);
		
		Reporter.log("I am First", true);
		
		Thread.sleep(2000);
		
		driver.close();

	}
	@Test
	
	public void tc2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("JIsha Patani", Keys.ENTER);
		Reporter.log("I am Second", true);

		Thread.sleep(2000);
		
		driver.close();

	}

}
