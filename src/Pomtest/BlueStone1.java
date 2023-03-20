package Pomtest;
import java.util.Set; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pom.BlueStone;
public class BlueStone1 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		BlueStone bs = new BlueStone(driver);
		
		bs.sendText("rings");
		
		driver.navigate().back();
		bs.sendText("kadas");
		driver.navigate().back();
		bs.sendText("Diamond");
		driver.navigate().back();

		
		/*bs.ringclick();
		bs.selctClick();*/
		
		  Set<String> tabs = driver.getWindowHandles();
		  for (String tab : tabs) {
			driver.switchTo().window(tab);
		}
		  
		
		 bs.buyClick();
		 System.out.println(bs.errorMassage());
		 
		
		Thread.sleep(7000);
		
		driver.quit();
		
		
	}

}
