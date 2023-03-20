package Asach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']")); 
		
		Actions a = new Actions(driver);
		
		a.dragAndDropBy(slider, 250, 0).perform();
		Thread.sleep(1000);
		a.dragAndDropBy(slider, 150, 0).perform();
		
		Thread.sleep(1000);

		a.dragAndDropBy(slider, 70, 0).perform();
		Thread.sleep(1000);
		a.dragAndDropBy(slider, 50, 0).perform();
		
		driver.quit();
		

	}

}
