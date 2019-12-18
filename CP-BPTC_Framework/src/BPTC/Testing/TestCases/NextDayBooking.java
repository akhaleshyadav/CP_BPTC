package BPTC.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BPTC.Testing.Base.Base;
import BPTC.Testing.POM.Login;
import BPTC.Testing.POM.TripBooking;
import BPTC.utilities.Logs;
@Test
public class NextDayBooking extends Base {
	public void NextDayBooking() throws InterruptedException
	{
	WebElement lgb=driver.findElement(By.id("lnkLogin"));
	 lgb.click();	
	 Thread.sleep(3000);
    Login l=new Login(driver, pr);
    l.Signin("C13057","Hbss2004");
    Logs.Takelog("NextDayBooking", "User Logged in successfully");
    Thread.sleep(3000);
    TripBooking tp=new TripBooking(driver,pr);
    tp.SingleTripBooking("12/18/2019");    //Pass the Tomorrow date
	}
}
