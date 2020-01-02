package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testannotationdemo {
	WebDriver driver;
	String path,title,url;
	
	@Test
	public void Annotations()
	{
		 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver",path);
		    driver=new ChromeDriver();
		    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	}
	
	@Test
	public void Checktitle()
	{
		title=driver.getTitle();
		System.out.println("Title of page is:"+title);
		
	}
	
	@Test
	public void Url()
	{
		url=driver.getCurrentUrl();
		System.out.println("URL of page is:"+url);
		
	}
	
	@Test
	public void Search()
	{
		driver.findElement(By.id("login1")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin1");
		driver.findElement(By.name("proceed")).click();
	}
}
