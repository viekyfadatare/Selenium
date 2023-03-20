package Pop;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='uploadmode1']")).click();
		
		Thread.sleep(2000);
		
		Runtime r = Runtime.getRuntime();
		
		r.exec("‪D:\\Uplod.exe");
		
		driver.findElement(By.id("submitbutton")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}
