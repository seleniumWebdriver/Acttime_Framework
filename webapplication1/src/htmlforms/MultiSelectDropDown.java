package htmlforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		//   FirefoxDriver driver = new FirefoxDriver();
      WebDriver driver = new  FirefoxDriver();
      driver.get("file:///C:/Users/Pooja/Desktop/MyPage.html");
      WebElement wb = driver.findElement(By.xpath("//Select[@multiple='true']"));
      Select sel = new Select(wb);
      if(sel.isMultiple())
      {
    	  System.out.println("It is multi select drop down");
    	  for(int i=0 ; i<5 ; i++)
    	  {
    		  sel.selectByIndex(i);
    	  }
      }
      else
      {
    	  System.out.println("It is not multi select option");
      }
     sel.deselectAll();
	}

}
