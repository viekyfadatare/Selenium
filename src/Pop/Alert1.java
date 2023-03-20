package Pop;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		
		System.out.println("======================================================================================================");
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert a1 = driver.switchTo().alert();
		
		System.out.println(a1.getText());
		Thread.sleep(2000);

		a1.dismiss();
		
		WebElement txt = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		
		System.out.println(txt.getText());
		
		System.out.println("======================================================================================================");


		driver.findElement(By.id("promtButton")).click();
		
		Alert a2 = driver.switchTo().alert();
		
		a2.sendKeys("Vieky");
		a2.accept();
		
		System.out.println(driver.findElement(By.xpath("//span[@id='promptResult']")).getText());
		
		Thread.sleep(5000);

		driver.close();
	}

}
