package Assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_Demo {
	
	WebDriver driver;
	String path;
	public void CSSSelector()
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.orange.com/en/home");
    driver.manage().window().maximize();
    driver.findElement(By.cssSelector("#menu-hamburger > span.hamburger-box")).click();
    driver.findElement(By.cssSelector("#menu-14625-target-col")).click();
    driver.findElement(By.cssSelector("#menu-14625-target-col")).click();
    driver.findElement(By.cssSelector("#menu-14625-target > ul > li:nth-child(5) > a")).click();
    driver.findElement(By.cssSelector("#menu-36826-target")).click();
    
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSSSelector_Demo obj = new CSSSelector_Demo();
		obj.CSSSelector();
	}

}
