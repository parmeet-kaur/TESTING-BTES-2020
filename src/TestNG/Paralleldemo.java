package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleldemo {
	WebDriver driver;
	String path;
	
	@Test
	public void launch2() {
		// Launch Browser
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		//System.out.println(path);
		//Setting key and path of Chrome driver
		System.setProperty("webdriver.chrome.driver", path);
				driver=new ChromeDriver();
		// Launch Application
				driver.get("https://www.google.com/");
	}
	
	@Test
	public void Launch1() 
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.google.com/");
	}
	
	@Test
	public void Launch() 
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.google.com/");
	}


}
