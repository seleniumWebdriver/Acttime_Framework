package createFbaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("http://facebook.com");
WebElement name= driver.findElement(By.id("u_0_j"));
		name.sendKeys("testselenium");
					//WebElement lname = driver.findElements(By.id("u_0_j")).sendKeys("arti");
						WebElement lname = driver.findElement(By.id("u_0_l"));
						lname.sendKeys("shekhawat");
								 
								WebElement email = driver.findElement(By.id("u_0_o"));
										email.sendKeys("tanya6786@gmail.com");
										WebElement reemail = driver.findElement(By.id("u_0_r"));
										reemail.sendKeys("tanya6786@gmail.com");
								 WebElement pwd = driver.findElement(By.id("u_0_v"));
								 pwd.sendKeys("bangalore1234");
								  WebElement dates = driver.findElement(By.id("day"));					
		  Select sel = new Select(dates); sel.selectByVisibleText("12");
		 
		   WebElement months = driver.findElement(By.id("month"));
		   Select sel2 = new Select(months);
		   sel2.selectByVisibleText("Mar");
		   
		   WebElement yearr = driver.findElement(By.id("year"));
		   Select sel3 = new Select(yearr);
		   sel3.selectByVisibleText("1997");
		   WebElement fsex = driver.findElement(By.id("u_0_a"));
		     fsex.click();
		     WebElement sbmt = driver.findElement(By.id("u_0_11"));
		     sbmt.click();
		   
	}

}
