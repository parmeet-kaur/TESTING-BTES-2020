package Demopac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchdata_fromtable {
	WebDriver driver;
	String path;
	public void Fetch_data()
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("file:///C:/Users/pc/Documents/javaprograms/studata_table.html");
   // PrintTableData(1,1,true);
    
	}

//	public void PrintTableData(int row, int column, boolean fromhead) {
//		
//		
//	}

	public static void main(String[] args) {
		Fetchdata_fromtable obj= new Fetchdata_fromtable();
		obj.Fetch_data();
	}

}
