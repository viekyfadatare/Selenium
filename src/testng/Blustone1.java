package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Blustone1 {
	WebDriver driver;
	
	@BeforeMethod
	
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Beforemethod", true);

		
	}
	
	@AfterMethod
	
	public void close() {
		Reporter.log("Aftermoethod", true);
		driver.close();
	}

	@Test
	public void tc1() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Reporter.log("Test1", true);
	}
	@Test
	public void tc2() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li[3]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Reporter.log("Test2", true);
	}
	@Test
	public void tc3() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li[4]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Reporter.log("Test3", true);
	}
}
