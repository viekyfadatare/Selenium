package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	WebElement un	= driver.findElement(By.xpath("//td[@class='textFieldsArea']//input[@name='username']"));
		un.sendKeys("admin");
		
		WebElement p = driver.findElement(By.xpath("//td[@class='textFieldsArea']//input[@name='pwd']"));
		
		p.sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
		
		driver.findElement(By.xpath("//div[@class='menuTable']/div[4]")).click();
		
		driver.findElement(By.xpath("//ul[@class=\"popup_menu_items\"]/li/a[contains(.,'About your actiTIME')]")).click();
	
		WebElement ft = driver.findElement(By.xpath("//td[@class='aboutCopyright']/span"));
		
		System.out.println(ft.getText());
		
	}

}
