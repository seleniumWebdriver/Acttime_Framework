package data_driven;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CustomerTest {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		FileInputStream fis = new FileInputStream("F:\\eclipse\\workspace\\webapplication1\\npadDataDriven\\arti.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String URL = pObj.getProperty("url");
		String USER = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		String BROWSER = pObj.getProperty("browser");
		
		System.out.println(URL);
		System.out.println(USER);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);
		
		WebDriver driver = null;
		if(BROWSER.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(BROWSER.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (BROWSER.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(USER);
		driver.findElement(By.id("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
