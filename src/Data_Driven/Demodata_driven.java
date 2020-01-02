package Data_Driven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demodata_driven {
	String data;
	
	public void getdata() throws IOException 
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\pc\\Documents\\login.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("login");
		int count = sheet.getLastRowNum();
		System.out.println("Total number of rows are:"+count);
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		data = cell.getStringCellValue();
		System.out.println("data is :"+data);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Demodata_driven obj = new Demodata_driven();
		obj.getdata();

	}

}
