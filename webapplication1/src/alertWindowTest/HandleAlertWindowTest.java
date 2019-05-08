package alertWindowTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlertWindowTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		driver.findElement(By.xpath("//button[text()='Click here to show confirm alert']")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(4000);
		alt.dismiss();
		Thread.sleep(10000);
		alt.accept();
		
	}

}
