package Pop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert2 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait ww = new WebDriverWait(driver,10);
		
		ww.until(ExpectedConditions.alertIsPresent());
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		Thread.sleep(5000);
		driver.close();
}
}