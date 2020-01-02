package Silenium_practicaltest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	WebDriver driver;
	String path;
	public void Links() throws InterruptedException {
		
		 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver",path);
		    driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    
	    
		    
		    List<WebElement> linknames = driver.findElements(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li/a"));
		    System.out.println("The Count of Links is:" +linknames.size());
	    
		    
		    for(int i=0;i<linknames.size();i++)
		    {
		    System.out.println(linknames.get(i).getText());
		    String href = linknames.get(i).getAttribute("href");
		    System.out.println(href);
		    driver.navigate().to(href);
		    driver.navigate().back();
		    }
		    
		   
		    
		   }

	

	public static void main(String[] args) throws InterruptedException {
		Test obj = new Test();
		obj.Links();

	}

}
