package gmaillogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementIdentification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
   FirefoxDriver driver = new FirefoxDriver();
   driver.get("http://gmail.com");
   System.out.println("---------START LOGON-------");
   WebElement emailwb = driver.findElement(By.id("identifierId"));
   emailwb.sendKeys("shekhawataarti4@gmail.com");
   WebElement btnwb = driver.findElement(By.xpath("//span[text()='Next']"));
   btnwb.click();
   Thread.sleep(2000);
   WebElement pswwb = driver.findElement(By.name("password"));
   pswwb.sendKeys("aarti");
   WebElement btn2wb = driver.findElement(By.xpath("//span[text()='Next']"));
   btn2wb.click();
   Thread.sleep(5000);
   WebElement imgwb = driver.findElement(By.xpath("//span[@class='gb_ya gbii']"));
   imgwb.click();
   Thread.sleep(1000);
   WebElement logoutwb = driver.findElement(By.id("gb_71"));
   logoutwb.click();
   //driver.quit();
   System.out.println("-------------END----------");
	}

}
