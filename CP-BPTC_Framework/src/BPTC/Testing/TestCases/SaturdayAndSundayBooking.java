package BPTC.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BPTC.Testing.Base.Base;
import BPTC.Testing.POM.Login;
import BPTC.Testing.POM.TripBooking;
import BPTC.utilities.Logs;
@Test
public class SaturdayAndSundayBooking extends Base {
	public void SaturdayAndSundayBooking() throws InterruptedException
	{
	try {
	WebElement lgb=driver.findElement(By.id("lnkLogin"));
	 lgb.click();	
	 Thread.sleep(3000);
    Login l=new Login(driver, pr);
    l.Signin("testnk","Hbss2004");
    Logs.Takelog("SaturdayAndSundayBooking", "User Logged in successfully");
    Thread.sleep(3000);
    TripBooking tp=new TripBooking(driver,pr);
    tp.SingleTripBooking("02/01/2020");       //put the coming Saturday date
    Logs.Takelog("SaturdayBooking", "Saturday trip booked");
    tp.SingleTripBooking("02/02/2020");
    Logs.Takelog("SundayBooking", "Sunday trip booked");
	}
	catch(Exception e) {
		Logs.Takelog("SaturdayAndSundayBooking", e.getMessage());
		Logs.takescreens();
	}
}}
