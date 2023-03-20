package Pomtest;

import java.util.Set; 
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.Kadas;

public class KadasBlueStone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Kadas k = new Kadas(driver);
		k.moveToJwellary(driver);
		k.kadasClick();
		k.selectClick();
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
		}
		
		k.buyClick();
		
		System.out.println(k.errorSms());
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
