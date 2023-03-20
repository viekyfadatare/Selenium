package Asach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop  = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(drag, drop).perform();
		
		System.out.println(drag.getText());
		
		System.out.println(drag.getCssValue("background-color"));
		System.out.println(drag.getCssValue("border"));
		System.out.println(drag.getCssValue("font"));
		
		System.out.println("------------------------------------------------------------------------------------");
		
		System.out.println(drop.getCssValue("background-color"));
		System.out.println(drop.getCssValue("border"));
		System.out.println(drop.getCssValue("font"));

		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
