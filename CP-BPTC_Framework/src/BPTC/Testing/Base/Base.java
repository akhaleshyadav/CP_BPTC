package BPTC.Testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import BPTC.utilities.Logs;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class Base {
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
      public void BrowserLaunch() throws InterruptedException, IOException
      {
		File f=new File("D:\\Automation\\Selenium_Workspace\\CP-BPTC_Framework\\src\\ObjectRepository\\ObjectRepo.properties");
		FileInputStream fi=new FileInputStream(f);
		 pr=new Properties();
		 pr.load(fi);
		 
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\CompleteSeleniumSetUp_win64bit\\chromedriver_win32 (1)\\chromedriver.exe");
    	  driver= new ChromeDriver();
    	  driver.get("https://cp-bptcstg.qryde.com/");
    	  driver.manage().window().maximize();
    	  Thread.sleep(5000);
    	  Logs.Takelog("Base", "Browser launched successfully");
      }
      @AfterMethod
      public void BrowserClose() throws InterruptedException
      {
    	 // driver=new ChromeDriver();
    	  driver.close();
    	  Logs.Takelog("Base", "Browser Closed successfully");
    	  Thread.sleep(3000);
      }
      @DataProvider
      public Object[][] LoginData() throws BiffException, IOException
      {
    	 File f=new File("C:\\Users\\Akhalesh\\Desktop\\CP_BPTC_InputData.xls");
    	Workbook wk=Workbook.getWorkbook(f);
    	Sheet st=wk.getSheet("Login");
    	int Row=st.getRows();
    	int Col=st.getColumns();
    	System.out.println("rows & Columns "+Row +" "+Col);
    	Object[][] ob =new Object[Row][Col];
    	for ( int i=0; i<Row; i++)
    	{
    		for (int j=0; j<Col; j++)
    		{
    			Cell C1= st.getCell(j,i);
    			ob[i][j]=C1.getContents();
    		    					
    		}
    	}
    	return ob;
      }
      
}
