package ReadData;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "./Softwrare/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.name("username")).sendKeys(rid.red("./Excel2/Login3.xlsx", "Sheet1", 1, 0));
		driver.findElement(By.name("pwd")).sendKeys(rid.red("./Excel2/Login3.xlsx", "Sheet1", 1, 1), Keys.ENTER);
		
		Thread.sleep(4000);
		
		ss.tss(driver, "Act");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(4000);
		driver.close();

		
		
	}

}
