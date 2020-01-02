package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assertiondemo {
	WebDriver driver;
	String path,exptitle="Google",title;
	
	@Test
	public void Launch() 
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    title=driver.getTitle();
	   System.out.println("Title is" +title);
	   Assert.assertEquals(title, exptitle);
	   System.out.println("hello");
	}

}
