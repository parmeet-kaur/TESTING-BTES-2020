package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Driver {
	
	public static WebDriver driver;
    public static String Path;
	
	@BeforeSuite
	public void Launch()
	{
		Path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.out.println(Path);
		System.setProperty("webdriver.chrome.driver",Path);
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	}
	
	@AfterSuite
	public void close_Browser()
	{                     
		System.out.println(2);
		driver.close();
		
	}

}
