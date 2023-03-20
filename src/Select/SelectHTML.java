package Select;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectHTML {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/OfflineSelenium1.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("b"));
		
		Select s = new Select(ele);
		
		if(s.isMultiple()) {
			
			s.selectByIndex(0);
			s.selectByIndex(3);
		}
		
		System.out.println("===================================================================");
		
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("===================================================================");
		
		List<WebElement> sopt = s.getAllSelectedOptions();
		for (WebElement opt : sopt) {
			System.out.println(opt.getText());
		}

		Thread.sleep(5000);
		driver.close();
	}

}
