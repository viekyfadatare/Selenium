package ReadData;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SS.screen;

public class Actime {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String user = Read.getCell("./Excel2/Login3.xlsx", "Sheet1", 1, 0);
		String pass = Read.getCell("./Excel2/Login3.xlsx", "Sheet1", 1, 1);
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass, Keys.ENTER);
		Thread.sleep(4000);
		screen.takePic(driver, pass);
		 driver.close();

	}

}
