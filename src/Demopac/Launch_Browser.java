package Demopac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	WebDriver driver; //WebDriver is an interface
	String path,title,url,exptitle="Facebook – log in or sign up";
	public void Launch()
	{
	System.setProperty("wedriver.chrome.driver","C:\\selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";//user.dir automatically picks the path of the project.
	
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);//takes 2 parameters key and value.every browser have their own key.
    driver=new ChromeDriver();//initialize driver and launching chrome browser
    
	driver.get("https://www.facebook.com/");//get is a method where we give path of applicaton which is to be run.
	//driver.navigate().back();
	title=driver.getTitle();
	System.out.println("Title of page is:"+title );
	if(title.equals(exptitle))
	{
		System.out.println("You are landing on correct page");
	}
	else
	{
		System.out.println("correct page not found");
	}
	url=driver.getCurrentUrl();
	System.out.println("URL of page is:"+url );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_Browser oo=new Launch_Browser();
		oo.Launch();
	}
}