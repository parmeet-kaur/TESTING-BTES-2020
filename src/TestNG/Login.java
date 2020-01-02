package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login  {
	WebDriver driver;
	String Path,exptitle="OrangeHRM",title;
	
	@Test
	public void Checktitle()
	{
		Path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.out.println(Path);
		System.setProperty("webdriver.chrome.driver",Path);
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		   title=driver.getTitle();
		   System.out.println("Title is" +title);
		   Assert.assertEquals(title, exptitle);
	}
	@Test
	public void Loginuser()
	{
		System.out.println("Login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
