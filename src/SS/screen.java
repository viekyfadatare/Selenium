package SS;

import java.io.File; 
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class screen {

	public static void takePic(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File ss = ts.getScreenshotAs(OutputType.FILE);
		File sssave = new File("./ScreenShote/"+name+".png");

		Files.copy(ss, sssave);

	}

}
