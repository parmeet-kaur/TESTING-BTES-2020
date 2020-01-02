package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Excel_Utility.Xls_Reader;

public class Dataprovidertest {

	WebDriver driver;
	String path;
	@BeforeClass
	public void launchApp() {
		// Launch Browser
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		//System.out.println(path);
		//Setting key and path of Chrome driver
		System.setProperty("webdriver.chrome.driver", path);
				driver=new ChromeDriver();
		// Launch Application
				driver.get("https://www.facebook.com/");
	}

	@DataProvider(name="Login")
	public Object[][] readData() {
		//Read data from xls Sheet
		//get the access Excel Sheet
		String sheetpath = System.getProperty("user.dir")+"\\TestData\\login.xlsx";
		Xls_Reader xlr = new Xls_Reader(sheetpath); 
		
		//Count Row
		int rowCount = xlr.getRowCount("Login");//3
		System.out.println(rowCount);
		//Count Col
		int colCount = xlr.getColumnCount("Login");//2
        System.out.println(colCount);
		Object[][] arr = new String[rowCount-1][colCount];//2 2
		for(int i=2; i<=rowCount;i++) {
			 
	
			for(int j=0;j<colCount;j++) {
				
				arr[i-2][j] = xlr.getCellData("Login", j, i);//passing sheetname,rows and columns
			}
		}
		return arr;
		
	}
	
	@Test(dataProvider="Login")
	public void loginFun(String username ,String pass ) {
//		System.out.println(username);
//		System.out.println(pass);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
		//enter email
		//enter pwd
		//click login
	}
}



