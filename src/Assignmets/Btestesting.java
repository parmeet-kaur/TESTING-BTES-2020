package Assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Btestesting {
	WebDriver driver;
	String path,title;
	public void Launch()
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.btes.co.in/");
    driver.findElement(By.xpath("//header[@class='site-header']/div/nav/ul/li[2]/a[1]")).click();
    driver.findElement(By.xpath("//header[@class='site-header']/div/nav/ul/li[2]/ul/li[6]/a")).click();
    driver.navigate().back();
    driver.findElement(By.xpath("//header[@class='site-header']/div/nav/ul/li[4]/a[1]")).click();
    driver.findElement(By.xpath("//header[@class='site-header']/div/nav/ul/li[4]/ul[2]/li[5]/a")).click();
    driver.navigate().back();
    driver.findElement(By.xpath("//header[@class='site-header']/div/nav/ul/li[3]/a[1]")).click();
    driver.findElement(By.xpath("//header[@class='site-header']/div/nav/ul/li[3]/ul/li[1]/a")).click();
   
    driver.findElement(By.xpath("//a[contains(@data-open-modal,'#course-shedule')]")).click();
    
    
    
    
	}
	public static void main(String[] args) {
		
		Btestesting obj = new Btestesting();
		obj.Launch();
	}

}
