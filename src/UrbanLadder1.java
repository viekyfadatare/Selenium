import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.urbanladder.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		driver.findElement(By.xpath("//ul[@class='featuredLinksBar__linkContainer']//a[contains(.,'Stores')]")).click();
		
		List<WebElement> show = driver.findElements(By.xpath("//h3[@class='_3JJeW']"));
		
		for (WebElement shows : show) {
			System.out.println(shows.getText());
		}

	}

}
