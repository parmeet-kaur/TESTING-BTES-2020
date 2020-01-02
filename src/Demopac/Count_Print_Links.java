package Demopac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Print_Links {
	WebDriver driver;
	String path;
	public void Links()
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    
    //to get the count of links
    List<WebElement> linknames = driver.findElements(By.tagName("a"));
    System.out.println("The Count of Links is:" +linknames.size());
    
    //to get the name of all links
    
    for(int i=0;i<linknames.size();i++)
    {
    	System.out.println(linknames.get(i).getText());
    	//System.out.println(linknames.get(i).getAttribute("href"));
    }
    
    
	}

	public static void main(String[] args) {
		Count_Print_Links obj=new Count_Print_Links();
		obj.Links();

	}

}
