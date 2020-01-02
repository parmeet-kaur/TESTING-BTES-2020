package Demopac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Image {
	WebDriver driver;
	String path;
	public void Images()
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://in.yahoo.com/?p=us");
    
    //to get the count of images
    List<WebElement> listimages = driver.findElements(By.tagName("img"));
    System.out.println("The Count of images are:" +listimages.size());
	}
	public static void main(String[] args) {
		Count_Image obj=new Count_Image();
		obj.Images();


	}

}
