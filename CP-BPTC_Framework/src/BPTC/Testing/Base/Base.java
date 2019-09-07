package BPTC.Testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
    	  Thread.sleep(2000);
      }
      @AfterMethod
      public void BrowserClose()
      {
    	  driver=new ChromeDriver();
    	  driver.close();
      }
}
