package htmlforms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		//   FirefoxDriver driver = new FirefoxDriver();
      WebDriver driver = new  FirefoxDriver();
      driver.get("file:///C:/Users/Pooja/Desktop/MyPage.html");
      String expval = "java";
      boolean flag = false;
      WebElement wb = driver.findElement(By.xpath("//Select[@multiple='true']"));
      Select sel1 = new Select(wb);
      List<WebElement> lst = sel1.getOptions();
      for(int i=0 ; i<lst.size() ; i++)
      {
    	  String actval = lst.get(i).getText();
      
	if(expval.equals(actval))
      {
    	  sel1.selectByVisibleText(expval);
    	  flag=true;
    	  break;
      }
	}	
	if(flag==true)
	{
		System.out.println(expval+"==> is available == PASS");
	}
	else
	{
		System.out.println(expval+"==> is available == FAIL");
	}
	}

}

