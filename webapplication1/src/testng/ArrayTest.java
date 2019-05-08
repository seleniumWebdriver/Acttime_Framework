package testng;

import org.testng.annotations.Test;

public class ArrayTest {
  @Test
  public void createCustomerTest()
  {
	  System.out.println("execute create");
	  int[]arr= {};
	  System.out.println(arr[2]);
  }
  @Test(dependsOnMethods="createCustomerTest")
  public void modifyCustomerTest()
  {
	  System.out.println("execute modify");
  }
  @Test(dependsOnMethods="modifyCustomerTest")
  public void deleteCustomerTest()
  {
	  System.out.println("execute delete");
  }
}
