package testng;

import org.testng.Reporter;  
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@DataProvider
	
	public static String[][] demo() {

		String st[][] = new String[3][2];

		st[0][0] = "UserA";
		st[0][1] = "A";

		st[1][0] = "UserB";
		st[1][1] = "B";

		st[2][0] = "UserC";
		st[2][1] = "C";

		return st;

	}

	@Test(dataProvider = "demo")
	public void tc(String user, String pass) {
		Reporter.log(user + "  " + pass, true);
	}

}
