package api.utilities;


import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "Data")
	public String[][] getAllData() throws IOException
	{
		String path = System.getProperty("user.dir")+"\\testData\\Userdata.xlsx";
	// Richa for testing file path
		//System.out.println(path);
		XLUtility xl = new XLUtility(path);
		
		int rownum = xl.getRowCount("Sheet1");
		//System.out.println(rownum);
		int colcount = xl.getCellCount("Sheet1",1);
		//System.out.println(colcount);
		
		String apidata[][] = new String[rownum][colcount];
		
		for(int i =1;i<=rownum;i++)
		{
			//System.out.println("value of i is "+i);
			
			for(int j =0;j<colcount;j++)
			{
				//System.out.println("value of j is "+j);
				apidata[i-1][j] = xl.getCellData("Sheet1", i, j);
				//System.out.println("value of j is "+j);
				
			}
			
			//System.out.println("value of i is "+i);
		}
		;
		return apidata;
		
		}
	
	
	@DataProvider(name = "UserNames")
	public String[] getUserNames() throws IOException
	{
		String path = System.getProperty("user.dir")+"//testData//Userdata.xlsx";
		XLUtility xl = new XLUtility(path);
		
		int rownum = xl.getRowCount("Sheet1");
				
		String apidata[] = new String[rownum];
		
		for(int i =1;i<=rownum;i++)
		{
						
				apidata[i-1] = xl.getCellData("Sheet1", i, 1);
			
		}
		
		return apidata;
		
		}
	
	
}
