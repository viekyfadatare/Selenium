package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	
	@Test(invocationCount = 5)
	public void tc1() {
		Reporter.log("hiii1", true);
	}
	
	@Test(invocationCount = 0)
	public void tc2() {
		Reporter.log("hiii2", true);
	}

}
