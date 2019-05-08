package oopss;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

interface Google
{
	public void search(String data);
}
 class News implements Google
 {
	 public void search(String data)
	 {
		 System.out.println("search for news ==>"+data);
	 }
 }
	 class Images implements Google
	 {
		 public void search(String data)
		 {
			 System.out.println("search for news ==>"+data);
		 }
	 }
		 class Maps implements Google
		 {
			 public void search(String data)
			 {
				 System.out.println("search for news ==>"+data);
			 }
		 }
public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter tab");
String userInput = s.next();
Google g = null;
if(userInput.equals("Images"))
{
	g = new Images();
}
else if(userInput.equals("News"))
{
	g = new News();
}
else if(userInput.equals("Maps"))
{
	g = new Maps();
}
g.search("Buddhism");
	}
}
class WindowsmtdTest
{
	public static void main (String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\geckodriver\\geckodriver.exe");
		Scanner s = new Scanner(System.in);
		System.out.println("enter browser");
		String userInput = s.next();
		WebDriver driver = null;
		if(userInput.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(userInput.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		driver.get("http://www.gmail.com");
	}
}
