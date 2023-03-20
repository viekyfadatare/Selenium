package testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {

	@Test

	public void tc1() {

		String s1 = "ABC";
		String s2 = "ABC";
		Assert.assertEquals(s1, s2);

		Reporter.log("Matched1", true);

		List<Object> lst1 = new ArrayList<Object>();

		lst1.add("Alia");
		lst1.add(121);
		lst1.add(65.5);
		lst1.add(true);

		List<Object> lst2 = new ArrayList<Object>();

		lst2.add("Alia");
		lst2.add(121);
		lst2.add(65.5);
		lst2.add(true);

		Assert.assertEquals(lst1, lst2);
		
		Reporter.log("Matched2", true);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("XYZ", "XYZ");
		
		Reporter.log("Matched3", true);
		//sa.assertAll();
	//	Assert.fail();
		Reporter.log("1", true);
	}
}
