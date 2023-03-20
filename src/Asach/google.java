package Asach;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

		

}
}
