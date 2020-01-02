package Demopac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_row_data_fromwebtable {
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
    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
   String rowdata = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[4]")).getText();
   System.out.println("data of row is" +rowdata);
   
//   String rowdata = driver.findElement(By.xpath("//a[contains(@text(),' UCO Bank ')]/parent::*/following-sibling::td[3]")).getText();
//   System.out.println("data of row is" +rowdata);
//   
   
   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fetch_row_data_fromwebtable obj=new fetch_row_data_fromwebtable();
		obj.Fetch_data();

	}

}
