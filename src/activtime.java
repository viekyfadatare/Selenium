import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement name = driver.findElement(By.xpath("//b[text()='admin']"));
		
		  WebElement pass = driver.findElement(By.xpath("//b[text()='manager']"));

		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name.getText());
		  
		  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass.getText(),Keys.ENTER);
		  
		  driver.findElement(By.xpath("//div[@class='menuTable']/div[4]")).click();
		  
		  
	}

}
