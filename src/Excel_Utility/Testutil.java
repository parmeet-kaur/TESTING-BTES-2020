package Excel_Utility;

import java.util.ArrayList;

public class Testutil {
static Xls_Reader reader;
	
	public static ArrayList<Object[]> getdata_frmexcel()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("D:\\Slenium_Codes\\Sileniumtest\\TestData\\chklogin.xlsx");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rownum=2;rownum<=reader.getRowCount("checklogin");rownum++)
		{
			String username=reader.getCellData("checklogin", "username", rownum);
			String password=reader.getCellData("checklogin", "password", rownum);
			
			
			Object ob[] = {username,password};
			mydata.add(ob);
			
		}
		return mydata;
	}
}
