package testng;

import org.testng.Reporter; 
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void login() {
		Reporter.log("login", true);
	}
	@Test(dependsOnMethods = "login")
	public void chat() {
		Reporter.log("chat", true);
	}
	@Test(dependsOnMethods = {"chat","login"})
	public void logout() {
		Reporter.log("logout", true);
	}
}
