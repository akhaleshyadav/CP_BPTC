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
		System.out.println("Constructor call");
	}
	
	public void SingleTripBooking(String ddate) throws InterruptedException
	{
		System.out.println("Single trip booking started !");
		Thread.sleep(15000);
	/*WebElement PuLocation = driver.findElement(By.cssSelector(pr.getProperty("Pickuplocationddl")));*/
	WebElement PuLocation=  driver.findElement(By.cssSelector("#aPulocation"));
	PuLocation.click();
	Thread.sleep(3000);
	
    //WebElement PUselect = driver.findElement(By.xpath("//li[@value='A46419A000']")); //555 N MORTON ST , BLOOMINGTON, IN 47408
    WebElement PUselect=driver.findElement(By.xpath("//ul[@id='aPuLocationUL']/li/a[text()='5 JEWETT ST APT 1R, LOWELL, MA 01850']"));
	PUselect.click();
	Logs.Takelog("TripBooking", "PU address selected successfully");
	Thread.sleep(2000);
	
	WebElement DOLocation = driver.findElement(By.cssSelector("#aAplocation"));
	DOLocation.click();
	Thread.sleep(3000);
	
	WebElement SelectDO = driver.findElement(By.xpath("//ul[@id='aAplocationUL']/li/a[text()='40 N FITZWILLIAM RD , ROYALSTON, MA 01368']"));  //40 N FITZWILLIAM RD , ROYALSTON, MA 01368'
	SelectDO.click();
	Logs.Takelog("TripBooking", "Destination address selected successfully");
	
	WebElement timeClick=driver.findElement(By.id("#puTime"));
	timeClick.click();
	WebElement timeddlclick=driver.findElement(By.cssSelector("cssSelector"));
	//Below time pickup code for BPTC
	//WebElement hh= driver.findElement(By.cssSelector("Select#ddlHH"));
	//Select s_hh=new Select(hh);
	//s_hh.selectByVisibleText("07");	
	//Logs.Takelog("TripBooking", "07 Hours selected");
	//Thread.sleep(3000);
	
	//WebElement mm= driver.findElement(By.cssSelector("Select#ddlMM"));
	//Select s_mm=new Select(mm);
	//s_mm.selectByVisibleText("25");	
	//Logs.Takelog("TripBooking", "25 min selected");
	Thread.sleep(3000);
	String S=ddate;
	String[] arrStr= S.split("/");
	System.out.println(arrStr[0] +"and"+arrStr[1]+"and"+arrStr[2]);
	
	WebElement dte= driver.findElement(By.id("travelDate"));
	dte.click();
	WebElement cldnr=driver.findElement(By.xpath("//a[@class='ui-state-default' and text()=18]"));
	cldnr.click();
	System.out.println("Date selected");
	Thread.sleep(3000);
	WebElement RoundChckBx=driver.findElement(By.cssSelector("#chkroundtrip"));
	RoundChckBx.click();
	Thread.sleep(4000);
	WebElement BookTpBtn=driver.findElement(By.cssSelector("#btnBookTrip"));
	BookTpBtn.click();
	Thread.sleep(8000);
		
	}
	
	
	
}
