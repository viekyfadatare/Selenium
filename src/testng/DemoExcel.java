package testng;

import org.testng.Reporter; 
import org.testng.annotations.Test;

public class DemoExcel {

	@Test(dataProviderClass = testng.excel.class, dataProvider = "read")
	
	public static void tc(String user, String pass) throws Exception {
		Reporter.log(user + "  " + pass, true);

	}
}
