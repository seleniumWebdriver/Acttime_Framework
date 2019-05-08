package makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class flight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://www.makemytrip.com/flights/");
		   WebElement months = driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		   Select sel2 = new Select(months);
		   sel2.selectByVisibleText("BLR, Kempegowda International Airport India");
		   months.click();
		 
	}
}
