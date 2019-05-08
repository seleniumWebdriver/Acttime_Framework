package windowsettings;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowMtdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		Dimension dem = new Dimension(100,300);
		driver.manage().window().setSize(dem);
		driver.manage().window().maximize();
		Point p = new Point (400,0);
		driver.manage().window().setPosition(p);
	//	driver.close();
	}

}
