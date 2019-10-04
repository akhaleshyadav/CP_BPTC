package BPTC.Testing.POM;

import java.awt.Checkbox;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BPTC.Testing.Base.Base;
import BPTC.utilities.Logs;

public class TripBooking extends Base{

	
	public TripBooking(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void SingleTripBooking(String ddate) throws InterruptedException
	{
		Thread.sleep(10000);
	WebElement PuLocation = driver.findElement(By.cssSelector(pr.getProperty("Pickuplocationddl")));
	PuLocation.click();
	Thread.sleep(3000);
	
    //WebElement PUselect = driver.findElement(By.xpath("//li[@value='A46419A000']")); //555 N MORTON ST , BLOOMINGTON, IN 47408
    WebElement PUselect=driver.findElement(By.xpath("//ul[@id='aPuLocationUL']/li/a[text()='1019 E SHERIDAN DR , BLOOMINGTON, IN 47401']"));
	PUselect.click();
	Logs.Takelog("TripBooking", "PU address selected successfully");
	Thread.sleep(2000);
	
	WebElement DOLocation = driver.findElement(By.cssSelector("#aAplocation"));
	DOLocation.click();
	Thread.sleep(3000);
	
	WebElement SelectDO = driver.findElement(By.xpath("//ul[@id='aAplocationUL']/li/a[text()='1965 S WALNUT ST , BLOOMINGTON, IN 47403']"));  //1965 S WALNUT ST , BLOOMINGTON, IN 47403'
	SelectDO.click();
	Logs.Takelog("TripBooking", "Destination address selected successfully");
	
	WebElement hh= driver.findElement(By.cssSelector("Select#ddlHH"));
	Select s_hh=new Select(hh);
	s_hh.selectByVisibleText("07");	
	Logs.Takelog("TripBooking", "07 Hours selected");
	Thread.sleep(3000);
	
	WebElement mm= driver.findElement(By.cssSelector("Select#ddlMM"));
	Select s_mm=new Select(mm);
	s_mm.selectByVisibleText("25");	
	Logs.Takelog("TripBooking", "25 min selected");
	Thread.sleep(3000);
	String S=ddate;
	String[] arrStr= S.split("/");
	System.out.println(arrStr[0] +"and"+arrStr[1]+"and"+arrStr[2]);
	
	WebElement dte= driver.findElement(By.id("travelDate"));
	dte.click();
	WebElement cldnr=driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight' or text()=arrStr[1]]"));
	cldnr.click();
	
	WebElement RoundChckBx=driver.findElement(By.id("chkroundtrip"));
	RoundChckBx.click();
	
	Checkbox ck=new Checkbox();
	
	}
	
}
