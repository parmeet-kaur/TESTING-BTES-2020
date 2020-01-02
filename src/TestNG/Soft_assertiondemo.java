package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertiondemo {
	WebDriver driver;
	String path,exptitle="Go",title;
	
	@Test
	public void Launch() 
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
		SoftAssert ast= new SoftAssert();
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.google.com/");
   ast.assertEquals(driver.getTitle(), exptitle);
	  System.out.println("hello");
	}
}
