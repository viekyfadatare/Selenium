package testng;

import org.testng.Reporter; 

import org.testng.annotations.Test;

public class Enable {

	@Test(priority = 2)
	public void tc1() {
		Reporter.log("hi1", true);
	}

	@Test(priority =1, enabled = false)
	public void tc2() {
		Reporter.log("hi2", true);
	}

	@Test(priority = -2)
	public void tc3() {
		Reporter.log("hi3", true);
	}
}
