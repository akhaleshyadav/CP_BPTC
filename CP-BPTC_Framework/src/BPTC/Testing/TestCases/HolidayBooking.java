package BPTC.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BPTC.Testing.Base.Base;
import BPTC.Testing.POM.Login;
import BPTC.Testing.POM.TripBooking;
import BPTC.utilities.Logs;

public class HolidayBooking extends Base{
	public void HolidayBooking() throws InterruptedException
	{
	 WebElement lgb=driver.findElement(By.id("lnkLogin"));
	 lgb.click();	
	 Thread.sleep(3000);
     Login l=new Login(driver, pr);
     l.Signin("testnk","Hbss2004");
     Logs.Takelog("HolidayBooking", "User Logged in successfully");
     Thread.sleep(3000);
     TripBooking tp=new TripBooking(driver,pr);
     tp.SingleTripBooking("01/28/2019");
   
		  
}
}
