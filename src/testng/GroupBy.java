package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupBy {
	@Test(groups = "smoke" )
	public void tc1() {
		Reporter.log("smoke", true);
	}

	@Test(groups = "smoke")
	public void tc2() {
		Reporter.log("smoke", true);
	}

	@Test(groups = "functional",dependsOnGroups = "smoke")
	public void tc3() {
		Reporter.log("functional", true);
	}
	@Test(groups = "integration",dependsOnGroups = "functional")
	public void tc4() {
		Reporter.log("integration", true);
	}

	@Test(groups = "functional",dependsOnGroups = "smoke")
	public void tc5() {
		Reporter.log("functional", true);
	}

	@Test(groups = "integration",dependsOnGroups = "functional")
	public void tc6() {
		Reporter.log("integration", true);
	}
	@Test(groups = "system",dependsOnGroups = {"integration","functional"})
	public void tc7() {
		Reporter.log("system", true);
	}

	@Test(groups = "system",dependsOnGroups = "integration")
	public void tc8() {
		Reporter.log("system", true);
	}
}
