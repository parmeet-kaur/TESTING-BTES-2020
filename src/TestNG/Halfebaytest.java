package TestNG;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Excel_Utility.Testutil;

public class Halfebaytest {
	
	WebDriver driver;
	String Path;
	
	@BeforeClass
	public void launchbrowser()
	{
		Path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		//System.out.println(Path);
		System.setProperty("webdriver.chrome.driver",Path);
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@DataProvider(name="gettestdata")
	public Iterator<Object[]> gettest()
	{
		
	ArrayList<Object[]> testdata=	Testutil.getdata_frmexcel();
	return testdata.iterator();
	}
	
	
	
	@Test(dataProvider="gettestdata")
	public void Ebaytest(String username,String password)
	{
		
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
		    driver.findElement(By.id("btnLogin")).click();
		
		
	}
	
//	@AfterMethod
//	public void teardown()
//	{
//		driver.quit();
//		
//	}

}
