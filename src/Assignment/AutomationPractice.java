package Assignment;

import java.util.List; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]"))
				.click();

		WebElement ts = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		Actions a = new Actions(driver);

		a.moveToElement(ts).perform();

		driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();

		driver.findElement(By.xpath("//span[@class='cross']")).click();

		WebElement cart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));

		a.moveToElement(cart).perform();

		System.out.println(driver.findElement(By.xpath("//dl[@class='products']/dt")).getText());

		System.out.println("====================================================================");

		System.out.println(driver.findElement(By.xpath("//div[@class='cart_block_list']")).getText());

		Thread.sleep(5000);

		driver.close();

	}

}
