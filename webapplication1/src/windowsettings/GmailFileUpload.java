package windowsettings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailFileUpload {

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
		   pswwb.sendKeys("jaiaartijai");
		   WebElement btn2wb = driver.findElement(By.xpath("//span[text()='Next']"));
		   btn2wb.click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//div[text()='Compose']")).click();
		   driver.findElement(By.xpath("//div[@aria-label='Attach files']/div/div")).click();
		   StringSelection str = new StringSelection("C:\\Users\\Pooja\\Desktop\\arti.docx");
		   Toolkit tool = Toolkit.getDefaultToolkit();
		   Clipboard mouse = tool.getSystemClipboard();
		   mouse.setContents(str, null);
		   Robot robot = new Robot();
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_V);
		   robot.keyRelease(KeyEvent.VK_V);
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
