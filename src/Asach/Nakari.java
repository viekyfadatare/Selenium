package Asach;

import java.util.Set; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nakari {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Set<String>win=driver.getWindowHandles();
		for (String id : win) {
			System.out.println(id);
			driver.switchTo().window(id);
			
			Thread.sleep(2000);
			
			driver.close();
		}
	
	}

}
