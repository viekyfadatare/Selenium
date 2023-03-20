package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

@Test(groups = "Functional")
public static void tc1() {
	Reporter.log("functional  tc1", true);
}
@Test(groups = "Integration" , dependsOnGroups = "Functional")
public static void tc2() {
	Reporter.log("integration  tc2", true);
}
@Test(groups = "System",dependsOnGroups = "Integration")
public static void tc3() {
	Reporter.log("System tc3", true);
}
@Test(groups = "Functional")
public static void tc4() {
	Reporter.log("functional tc4", true);
}
@Test(groups = "Integration",dependsOnGroups = "Functional")
public static void tc5() {
	Reporter.log("integration tc5", true);
}
@Test(groups = "System",dependsOnGroups = "Integration")
public static void tc6() {
	Reporter.log("System tc6", true);
}
}
