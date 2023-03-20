package Asach;

import java.awt.AWTException; 
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseNakuri {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		Set<String> win = driver.getWindowHandles();
		System.out.println(win.getClass());
		
		ArrayList <String> lst = new ArrayList<>(win);
		
		for(int i = lst.size()-1; i>=0;i--) {
			
			String id = lst.get(i);
			
			driver.switchTo().window(id);
			
			Thread.sleep(2000);
			driver.close();
	
		}	
		
		
	}

}
