package Xpath;

import java.io.File; 
import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;




public class UrbanLadeMouse {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		
		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		
		close.click();
		
		Actions a = new Actions(driver);
		List <WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		
		for(WebElement menuName:menus) {
			
			System.out.println(menuName.getText());
			
			Thread.sleep(2000);

			a.moveToElement(menuName).perform();
			 Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File ss = ts.getScreenshotAs(OutputType.FILE);
			
			File ssSave = new File("./ScreenShot/uk.png");
			
			Files.copy(ss, ssSave);
			
			Thread.sleep(2000);
			
		}
		
		
	}
	
}