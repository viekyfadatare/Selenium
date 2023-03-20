package Xpath;

import java.io.IOException;

import java.util.List;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OyoroomFEtachSubmenu {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.oyorooms.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement close = driver.findElement(By.xpath("//span[@class='c-13l9cls']"));
		Thread.sleep(2000);

		close.click();
		
		List<WebElement> menu = driver.findElements
	(By.xpath("//div[@class='oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone headerMDD__mddListWrapper']/div"));
	
		
		Actions a = new Actions(driver);
		for (WebElement Mainmenu : menu) {
			String name = Mainmenu.getText();
			System.err.println(name);
			Thread.sleep(2000);
			a.moveToElement(Mainmenu).perform();
			
			List<WebElement> submenu = driver.findElements
(By.xpath("//h2[contains(.,'"+name+"')]/ancestor::div[@class=\"mddCityItem__cityItemWrapper\"]/descendant::div[@class=\"mddCityPopUp d-popup\"]/a"));
			for (WebElement sub : submenu) {
				System.out.println(sub.getText());
			}
			
		}
		
		Thread.sleep(5000);

		driver.quit();
	}

}
