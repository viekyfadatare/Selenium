import java.io.IOException; 
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SS.screen;

public class UrbanLaDER {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
	List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		
		Actions a= new Actions(driver);
		
		for (WebElement menu : menus) {
			String name = menu.getText();
			System.err.println(name);
			a.moveToElement(menu).perform();
			
			Thread.sleep(1000);
			screen.takePic(driver, name);
			
	List<WebElement> sub = driver.findElements(By.xpath("//span[contains(., '"+name+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for (WebElement subs : menus) {
				a.moveToElement(subs).perform();
				System.out.println(subs.getText());
			}
			
		}
		
				
		
		
	}

}
