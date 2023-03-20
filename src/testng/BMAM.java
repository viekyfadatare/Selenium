package testng;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMAM {

	WebDriver driver;

	@BeforeMethod

	public void BM() {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("BeforeMethod", true);

	}


	@Test
	public void tc1() throws InterruptedException   {

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Kristena", Keys.ENTER);
		Reporter.log("Test1", true);
		Thread.sleep(2000);

	}

	@Test
	public void tc2() throws InterruptedException   {

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Alexa", Keys.ENTER);
		Reporter.log("Test2", true);
		Thread.sleep(2000);


	}
	
	@AfterMethod
	public void AM() {

		Reporter.log("AfterMethod", true);

		driver.close();
	}

}
