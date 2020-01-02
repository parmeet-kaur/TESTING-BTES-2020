package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
	String Path;
	WebDriver driver;
	@DataProvider(name="Checklogin")
	
	public Object[][] Authenticate()
	{
		Object[][] arr=new Object[3][2];
		arr[0][0]="Admin";
		arr[0][1]="admin@123";
		
		arr[1][0]="pass";
		arr[1][1]="pass123";
		
		arr[2][0]="123ddemo";
		arr[2][1]="demo";
		
		
		return arr;
				
		
	}
	
	@Test
	public void launchbrowser()
	{
		Path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.out.println(Path);
		System.setProperty("webdriver.chrome.driver",Path);
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test(dataProvider="Checklogin")
	public void login(String uname,String pwd)
	{
		
	    driver.findElement(By.id("txtUsername")).sendKeys(uname);
	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pwd);
	    driver.findElement(By.id("btnLogin")).click();
//		System.out.println("Username is"+uname);
//		System.out.println("Password is"+pwd);
		
	}
	

}
