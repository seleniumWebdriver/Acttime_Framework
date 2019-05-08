package GmailTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class sampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://gmail.com");
String CurrentPageTitle = driver.getTitle();
if(CurrentPageTitle.equals("Gmail"))
      System.out.println("Login page is available == PASS");	
      else
	  System.out.println("Login page is not available == FAIL");
String CurrentPageUrl = driver.getCurrentUrl();
System.out.println(CurrentPageUrl);
System.out.println("browserSessionId");
System.out.println("CurrentPageHTMLCode");
driver.quit();
}

	}

