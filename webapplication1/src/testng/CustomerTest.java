package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CustomerTest {
	@BeforeMethod
	public void configBM() {
		System.out.println("login");
	}

	@Test
	public void createCustomerTest() {
		System.out.println("execute createCustomerTest");
	}
	
	@Test
	public void modifyCustomerTest() {
		System.out.println("execute modifyCustomerTest");
	}

	@AfterMethod
	public void configAM() {
		System.out.println("logout");
	}

}
