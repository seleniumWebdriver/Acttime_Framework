package pack1;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		

	}

}
