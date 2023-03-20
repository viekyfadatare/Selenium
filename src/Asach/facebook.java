package Asach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/web/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("viekyfadatare@fb.com");
		Thread.sleep(2000);
		email.clear();
		
		System.out.println(email.getTagName());
		
		Thread.sleep(5000);

		driver.quit();

	}

}
