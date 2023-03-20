import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sofa",Keys.ENTER);
		
		driver.findElement(By.xpath("//img[@alt='Weston Half Leather Sofa (Wine Italian Leather)']")).click();
		
		driver.findElement(By.xpath("//a[text()='Order Your Set']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
