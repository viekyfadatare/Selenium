import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class OyoRoom {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.oyorooms.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@class='c-13l9cls']")).click();

		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='mddCityItem__cityItemWrapper']"));

		Actions a = new Actions(driver);

		for (WebElement menu : lst) {
			String name = menu.getText();
			System.err.println(name);
			Thread.sleep(1000);
			a.moveToElement(menu).perform();
			Thread.sleep(1000);

			OyoRoom.takeScreenShot(driver, name);

			List<WebElement> sub = driver.findElements(By.xpath("//h2[text()='" + name
					+ "']/ancestor::div[@class='mddCityItem__cityItemWrapper']/descendant::div[@class='mddCityPopUp d-popup']/a"));

			for (WebElement subs : sub) {

				a.moveToElement(subs).perform();
				System.out.println(subs.getText());
			}

		}
	}

	public static void takeScreenShot(WebDriver driver, String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File ss = ts.getScreenshotAs(OutputType.FILE);

		File ssSave = new File("./ScreenShote/" + name + ".png");

		Files.copy(ss, ssSave);
	}

}
