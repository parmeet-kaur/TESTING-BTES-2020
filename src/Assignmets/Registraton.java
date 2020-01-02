package Assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registraton {
	WebDriver driver;
	String path;
	public void Launch() throws InterruptedException
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    //driver.navigate().forward();
    driver.findElement(By.name("firstname")).sendKeys("Ruchika");
    driver.findElement(By.name("lastname")).sendKeys("Mahajan");
    Thread.sleep(100);
    driver.findElement(By.name("reg_email__")).sendKeys("9988778987");
    driver.findElement(By.id("u_0_w")).sendKeys("admin");
    Select s1=new Select( driver.findElement(By.id("day")));
    s1.selectByIndex(4);
    Select s2=new Select( driver.findElement(By.id("month")));
    s2.selectByValue("10");
    Select s3=new Select( driver.findElement(By.id("year")));
    s3.selectByValue("2017");
    
    
    driver.findElement(By.name("sex")).click();
    driver.findElement(By.id("u_0_a"));
    driver.findElement(By.id("u_0_b"));
    Thread.sleep(100);
    driver.findElement(By.name("websubmit")).click();
    
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Registraton obj = new Registraton();
		obj.Launch();
	}

}
