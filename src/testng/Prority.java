package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prority {

	@Test(priority = 2, invocationCount = 3)
	public void tc1() {
		Reporter.log("hi1", true);
	}

	@Test(priority = -15489, invocationCount = 2)
	public void tc2() {
		Reporter.log("hi2", true);
	}

	@Test(priority = -1365488, invocationCount = 0)
	public void tc3() {
		Reporter.log("hi3", true);
	}

}
