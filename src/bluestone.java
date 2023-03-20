import java.util.Set; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@class='menuparent repb']/a[contains(.,'Rings')]")).click();
		driver.findElement(By.xpath("//img[@alt='The Felicita Top Open Ring']")).click();
		
		Set<String> win = driver.getWindowHandles();
		for (String wins : win) {
			driver.switchTo().window(wins);
			
		}
		
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		WebElement error = driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		
		System.out.println(error.getText());
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
