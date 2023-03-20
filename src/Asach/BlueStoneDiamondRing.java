package Asach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneDiamondRing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bluestone.com/");

		driver.manage().window().maximize();

		WebElement rings = driver.findElement(By.xpath("//ul[@class=\"wh-main-menu\"]/li/a[contains(.,'Ring')]"));
		Actions a = new Actions(driver);

		a.moveToElement(rings).perform();

		List<WebElement> diamond = driver.findElements(By.xpath("//a[@title='Diamond Rings']"));

		for (WebElement dia : diamond) {

			Thread.sleep(1000);

			a.moveToElement(dia).perform();

			Thread.sleep(1000);

			dia.click();

			break;
		}
		List<WebElement> sortBy = driver
				.findElements(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));

		for (WebElement sb : sortBy) {

			a.moveToElement(sb).perform();

		}

		List<WebElement> LtoH = driver.findElements(By.xpath("//a[contains(.,'Price Low to High ')]"));

		for (WebElement lh : LtoH) {
			a.moveToElement(lh).perform();
			Thread.sleep(1000);

			lh.click();
		}
	}
}
