package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	
	WebDriver driver;
	String Path;
	
	@Test
	@Parameters({"browser","username","password"})
	public void Orangelogintest(String browser,String username,String password )
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
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys(username);
	    
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	    driver.findElement(By.id("btnLogin")).click();
	}

}
