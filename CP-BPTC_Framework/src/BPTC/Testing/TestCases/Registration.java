package BPTC.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BPTC.Testing.Base.Base;
import BPTC.utilities.Logs;

public class Registration extends Base {
@Test	
public void Reg_new() throws InterruptedException
{   try {
	WebElement LoginBtn=driver.findElement(By.id("lnkLogin"));
	LoginBtn.click();
	Thread.sleep(5000);
	
	WebElement Register_Btn=driver.findElement(By.id("btnRyderLnk"));
	Register_Btn.click();
	Thread.sleep(3000);
	Logs.Takelog("Registration", "Register button clicked successfully");
	
	WebElement ClientId = driver.findElement(By.xpath("//input[@id='txtClientID']"));  //Tag with 
	//WebElement ClientId = driver.findElement(By.id("txtClientID"));
	ClientId.sendKeys("C1276");
	
	Actions ac=new Actions(driver);
	ac.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(10000);
	
	WebElement name=driver.findElement(By.id("txtFName"));
	String fname=name.getText();
	System.out.println(fname);
	Logs.Takelog("Registration", fname +"Member first name");
			
	WebElement Pswd =driver.findElement(By.xpath("//input[@type='password' and @id='txtUserPassword']"));
	Pswd.sendKeys("Hbss2004");
	
	WebElement ConfrmPswd=driver.findElement(By.xpath("//input[@type='password' and @id='txtConfirmPassword']"));
	ConfrmPswd.sendKeys("Hbss2004");
	Thread.sleep(8000);
	WebElement LetsGo = driver.findElement(By.id("btnRegister"));
	LetsGo.click();
	WebElement confrmMsg=driver.findElement(By.xpath("//span[text()='   User Registered Successfully']"));
	Boolean Cfrm=confrmMsg.isDisplayed();
	if (Cfrm=true)
	{
		Logs.Takelog("Registration", "Pass - User Registered successfully");
	    System.out.println("Pass - User registered successfully");
	}
	    else
	    {   
	    	Logs.Takelog("Registration", "Fail - Confirmation message does not appear");
		    System.out.println(" Fail - Confirmation message does not appear");
	    	
	    }
}
catch (Exception e) {
	Logs.Takelog("Registration", e.getMessage());
	System.out.println("Registration" + e.getMessage());
}
}
}