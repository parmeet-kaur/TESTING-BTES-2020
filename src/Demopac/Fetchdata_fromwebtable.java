package Demopac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchdata_fromwebtable {
	WebDriver driver;
	String path;
	public void Fetch_data()
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   int rowsnumber = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
   System.out.println("Number of rows are:" +rowsnumber);
   
   int colsnumber = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td")).size();
   System.out.println("Number of columns are:" +colsnumber);
	}
	public static void main(String[] args) {
		Fetchdata_fromwebtable obj = new Fetchdata_fromwebtable();
		obj.Fetch_data();

	}

}
