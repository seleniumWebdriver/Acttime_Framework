package handleMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleEements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://in.yahoo.com");
/*List<WebElement> lst = driver.findElements(By.xpath("//a"));
System.out.println(lst.size());
for(int i=0; i<lst.size(); i++)
{
	String linkName = lst.get(i).getText();
	System.out.println(linkName);
}*/



/*String x = "//span[@data-category='trending news']/../../ul/li/ul/li[*]";
List<WebElement> lst = driver.findElements(By.xpath(x));
for(WebElement wb : lst)
{
	System.out.println(wb.getText());
}*/



String x = "//span[@data-category='trending news']/../../ul/li/ul/li[*]";
List<WebElement> lst = driver.findElements(By.xpath(x));
for(WebElement wb : lst)
{
	wb.click();
	String titleofThePage = driver.getTitle();
	if(titleofThePage.contains("not found"));
	{
		System.out.println("Link is broken ==>"+wb.getText());
	}
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
}
	}

}
