package Assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukrisearch {
	WebDriver driver;
	String path,title;
	public void Search() throws InterruptedException
	{
		//System.setProperty("wedriver.chrome.driver","C:\\Silenium Softwares\\chromedriver_win32\\chromedriver.exe");
		 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver",path);
    driver=new ChromeDriver();
    driver.get("https://www.naukri.com/");
    title=driver.getTitle();
    driver.manage().window().maximize();
    System.out.println("Title of page is:"+title);
    Thread.sleep(100);
     WebElement searchsection = driver.findElement(By.id("qsbClick"));
     searchsection.click();
     
     WebElement Searchkeyword= driver.findElement(By.name("qp"));
     Searchkeyword.sendKeys("Quality Analyst");
     driver.findElement(By.name("ql")).sendKeys("Chandigarh");
     driver.findElement(By.cssSelector("div#exp_dd")).click();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("div#exp_dd li#a2")).click();
     driver.findElement(By.cssSelector("div#salary_dd")).click();
     driver.findElement(By.cssSelector("div#salary_dd li#a2")).click();
     driver.findElement(By.id("qsbFormBtn")).click();
     
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Naukrisearch obj = new Naukrisearch();
		obj.Search();
	}

}
