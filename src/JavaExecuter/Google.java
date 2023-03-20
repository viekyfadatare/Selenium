package JavaExecuter;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1500)");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(2000);

		driver.close();

	}

}
