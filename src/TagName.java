import java.util.List; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		int count =0;
		
		for (WebElement link : links) {
			
			System.out.println(link.getText());
			count++;
		}
		
		System.out.println();
		System.out.println(count);
		driver.quit();

	}

}
