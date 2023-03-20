package Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/web/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

		
		driver.findElement(By.linkText("Sign up for Facebook")).click();

		WebElement day = driver.findElement(By.id("day"));

		Select s = new Select(day);

		s.selectByValue("7");

		WebElement month = driver.findElement(By.id("month"));

		Select s1 = new Select(month);
		s1.selectByIndex(2);

		WebElement year = driver.findElement(By.id("year"));

		Select s2 = new Select(year);

		s2.selectByVisibleText("1995");

		List<WebElement> months = s1.getOptions();
		for (WebElement mns : months) {
			System.out.println(mns.getText());
		}
		
		List<WebElement> days = s.getOptions();
		for (WebElement d : days) {
			System.out.println(d.getText());
		}
		
		 List<WebElement> years = s2.getOptions();
		for (WebElement y : years) {
			System.out.println(y.getText());
		}
	}

}
