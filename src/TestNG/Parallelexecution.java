package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexecution {
	
	WebDriver driver;
	String Path;
	
	@Test
	@Parameters("browser")
	public void launch(String browser)
	{
		if(browser.equals("chrome")) {
			Path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
			System.out.println(Path);
			System.setProperty("webdriver.chrome.driver",Path);
		    driver=new ChromeDriver();
			
		}
		else
		{
			Path=System.getProperty("user.dir")+"//Drivers//geckodriver.exe";
			System.out.println(Path);
			System.setProperty("webdriver.gecko.driver",Path);
		    driver=new ChromeDriver();
		}
		
		//opening facebook app to test
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
}
