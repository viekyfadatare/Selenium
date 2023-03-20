import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBOOK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ih = driver.findElement(By.id("email"));
		ih.sendKeys("vieky");
		WebElement ps = driver.findElement(By.id("pass"));
		ps.sendKeys("1125", Keys.ENTER);
		Thread.sleep(20000);

		driver.close();
		//click:- it is a non static method of weblement which use to click on button or link or redio button
		//and check boxes without taking any argument with return type void

	}

}
