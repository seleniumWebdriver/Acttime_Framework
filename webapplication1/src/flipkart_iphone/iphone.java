package flipkart_iphone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("http://flipkart.com");
		   WebElement flp = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		   flp.click();
		   WebElement flp1 = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		   flp1.click();
		   WebElement flp2 = driver.findElement(By.xpath("//input[@type='text' and @name='q']"));
		   flp2.sendKeys("iphone 10");
		   WebElement flp3 = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		   flp3.click();
		//   WebElement flp4 = driver.findElement(By.xpath("//span[@class='_2yAnYN']"));
		  // flp4.click();
	}

}
