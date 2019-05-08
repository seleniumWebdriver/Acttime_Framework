package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CustomerTest_withAll_Annotation {
  @Test
  public void createCustomerTest() {
	  System.out.println("execute customerTest");
  }
  @BeforeMethod
  public void configBM() {
	  System.out.println("login");
  }

  @Test
  public void modifyCustomerTest() {
	  System.out.println("execute modifyTest");
  }
  @AfterMethod
  public void configAM() {
	  System.out.println("logout");
  }

  @BeforeClass
  public void configBC() {
	  System.out.println("--------launch a browser--------");
  }

  @AfterClass
  public void configAC() {
	  System.out.println("---------close the browser--------");
  }

}
