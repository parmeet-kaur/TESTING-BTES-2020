package Assignmets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sorting_price {

	 String path;
	 WebDriver driver;
	    WebElement city,search;
	    List<Integer> price = new ArrayList<Integer>();
	    //List<Integer> price;
	    void sortprice() throws InterruptedException {
	       
	    	 path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	    		System.setProperty("webdriver.chrome.driver",path);
	       driver=new ChromeDriver();
	        driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
	        ArrayList<WebElement> prices=(ArrayList<WebElement>)driver.findElements(By.cssSelector("[class='product-discountedPrice']"));
	        System.out.println(prices.size());
	       
	        for (WebElement propertyPrice : prices)
	            {
	           
	                price.add(Integer.parseInt(propertyPrice.getText().replaceAll("[^0-9]", "")));
	           
	            }
	        Collections.sort(price);
	       
	        System.out.println(price);
	       
	    }
	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub
	    	Sorting_price oo = new Sorting_price();
	        oo.sortprice();
	       
	    }

	}
