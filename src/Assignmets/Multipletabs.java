package Assignmets;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabs {
	WebDriver driver;
	String path,title;
	public void Launch()
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://mail.google.com/");
    ((JavascriptExecutor)driver).executeScript("window.open()");
    ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    driver.get("https://www.facebook.com/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multipletabs obj = new Multipletabs();
		obj.Launch();

	}

}
