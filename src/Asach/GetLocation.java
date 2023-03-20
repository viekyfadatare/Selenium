package Asach;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.name("q"));
		
		
		Point loc = search.getLocation();
		
		System.out.println(loc.getX()+"   "+loc.getY());
		
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
