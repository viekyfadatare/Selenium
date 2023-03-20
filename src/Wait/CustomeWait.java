package Wait;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomeWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/Selenium/HTML3.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait ww = new WebDriverWait(driver, 10);
		
		ww.until(new ExpectedCondition<Boolean>(){

			@Override
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.id("iantextbox")).isDisplayed();
			}
			
			
		});

		driver.findElement(By.id("iantextbox")).sendKeys("vieky");
	}

}
