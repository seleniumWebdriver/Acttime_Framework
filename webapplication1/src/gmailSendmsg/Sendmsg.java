package gmailSendmsg;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sendmsg {

	//private static Object wait;

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		   driver.findElement(By.xpath("//div[text()='Compose']")).click();
		 //  driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).click();
		   driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).sendKeys("abcd@gmail.com");
		   //driver.findElement(By.name("subjectbox")).click();
		   driver.findElement(By.name("subjectbox")).sendKeys("efgh");
		   driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
		   driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("this is an auto generated mail");
	}

}
