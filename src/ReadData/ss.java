package ReadData;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ss {

	public static void tss(WebDriver driver , String Name) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File save = new File("./ScreenShote/"+Name+".png");
		Files.copy(ss, save);
	}
	
}
