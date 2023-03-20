package Pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.SeleniumHome;

public class testSeleniumHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		SeleniumHome sh = new SeleniumHome(driver);

		sh.sendText("java");
		Thread.sleep(2000);
		driver.navigate().back();
		sh.sendText("testng");

		Thread.sleep(10000);
		driver.quit();

	}

}
