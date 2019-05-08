package testng;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=2)
  public void createCustomer()
  {
	  System.out.println("execute createCustomerTest");
  }
  @Test(priority=3)
  public void modify()
  {
	  System.out.println("execute modify");
  }
  @Test(priority=1)
  public void delete()
  {
	  System.out.println("execute delete");
  }

}
