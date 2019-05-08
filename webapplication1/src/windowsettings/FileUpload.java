package windowsettings;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.randstad.in/my-randstad/register/");
		driver.findElement(By.id("ctl08_ctl04_CVFileUpload")).sendKeys("C:\\Users\\Pooja\\Desktop\\arti.docx");
		driver.findElement(By.id("ctl08_ctl04_ApplyLinkButton")).submit();
	}

}
