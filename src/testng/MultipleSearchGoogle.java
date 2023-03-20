package testng;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleSearchGoogle {
	WebDriver driver;

	@BeforeMethod

	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		Reporter.log("BeforeMethod", true);
	}

	@AfterMethod
	public void close() {

		Reporter.log("AfterMethod", true);
		driver.close();
	}

	@Test()
	public void click() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	for(int i =0 ; i<=10;i++)  {

			driver.findElement(By.xpath("//a[@id='pnnext']")).click();
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		}
	Thread.sleep(3000);
	}

}
