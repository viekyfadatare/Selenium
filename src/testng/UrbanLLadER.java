package testng;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UrbanLLadER {
	@Test
	@Parameters("browser")
	public void tc1(String browser) throws InterruptedException {

		WebDriver driver = null;

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");

			driver = new FirefoxDriver();
		} else {
			driver = null;
		}

		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();

		Actions a = new Actions(driver);

		WebElement sale = driver
				.findElement(By.xpath("//ul[@class='topnav bodytext']/li[@class='topnav_item saleunit']"));

		a.moveToElement(sale).perform();

		driver.findElement(By.xpath("//li[@class='subnav_item 14141']//span[contains(.,'Wooden Sofa Sets')]")).click();

		driver.findElement(By.xpath(
				"//img[@src='https://www.ulcdn.net/images/products/219463/sofa_listing/FNSF51PPSF3_-_main_1.jpg?1541578299']"))
				.click();

		Set<String> wins = driver.getWindowHandles();
		for (String win : wins) {
			driver.switchTo().window(win);

		}

		driver.findElement(By.xpath("//a[contains(.,'Order Your Set')]")).click();

		driver.findElement(By.xpath("//img[@alt='2-1-1 Set - Pricing']")).click();

		driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();

		driver.findElement(By.xpath("//img[@class='logo-img']")).click();

		driver.findElement(By.xpath("//a[@title='Cart']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scroll(0,100)");

		Thread.sleep(5000);


	}

}
