package BPTC.Testing.TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HeadlessBrowser_TripBooking 
 {
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver=new HtmlUnitDriver();
	driver.get("http://dctb.hbssweb.com/Portal/");
  	((HtmlUnitDriver) driver).setJavascriptEnabled(true);
  	  	
	//driver.manage().window().maximize();
	System.out.println("Page title -" +driver.getTitle());
	
		Thread.sleep(5000);
 	 WebElement login=driver.findElement(By.cssSelector("input[name='txtUserName']"));
 	//WebElement Pulocation=driver.findElement(By.cssSelector("#aAplocation"));
 	login.sendKeys("DCTB");
 	System.out.println("user entered");
 	WebElement pwd=driver.findElement(By.cssSelector("input[name='txtPassword']"));
 	pwd.sendKeys("Hbss2004");
 	System.out.println("password ntered");
 	WebElement loginbtn=driver.findElement(By.cssSelector("input[name='btnLogin']"));
 	loginbtn.click();
  	System.out.println("Page title is"+driver.getTitle());
	
	}
	}
 


