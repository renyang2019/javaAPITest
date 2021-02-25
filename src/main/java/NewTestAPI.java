import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAPI {
	@Test(dataProvider = "dp", groups = "functional test")
	@Parameters({ "userName", "Pwd" })
	public void test_case_001(Integer n, String s) {
		int i = 1 / 0;
		System.out.println("s is : " + s);
		//System.out.println("userName is : " + userName);
		System.out.println("i is : " + i);
		System.out.println("n is : " + n.toString());
		Assert.assertEquals("1235", "123");
	}

	@Test( groups = "functional test")
	@Parameters({"userName","pwd"})
	public void test_case_002(String userName,String pwd) {
		//int i = 1 / 0;
		System.out.println("userName is : " + userName);
		Assert.assertEquals("1235", "123");
	}

	@BeforeMethod
	@Test(enabled = false, timeOut = 5000)
	public void beforeMethod() {
		//
	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" } };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@AfterSuite
	public void afterSuite() {
	}

}
