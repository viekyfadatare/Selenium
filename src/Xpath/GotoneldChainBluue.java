package Xpath;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GotoneldChainBluue {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();

		WebElement jwel = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions a = new Actions(driver);
		a.moveToElement(jwel).perform();
		Thread.sleep(1000);
		WebElement Gchain = driver.findElement(By.xpath("//a[@title='Gold Chains']"));
		Gchain.click();

		WebElement chain = driver.findElement(By.xpath("//a[@id='pid_65917']/img"));

		chain.click();

		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
		}
		Thread.sleep(1000);

		WebElement buy = driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']/input"));
		buy.click();

	}

}
