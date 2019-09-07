package BPTC.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BPTC.Testing.Base.Base;
import BPTC.Testing.POM.Login;
import BPTC.utilities.Logs;

public class LoginTC extends Base {
	@Test
	public void LoginTest() throws InterruptedException
	{
		WebElement lgb=driver.findElement(By.id("lnkLogin"));
		lgb.click();
		//For valid case
		Login l =new Login(driver, pr);
		l.Signin("C11111", "hbss2051");    //Case-1 Invalid id and Pwd
		WebElement loginErr=driver.findElement(By.id("divLoginErrMsg"));
		boolean er1=loginErr.isDisplayed();
		if (er1=true) 
		{
		  System.out.println("Login test - Pass for Invalid credential, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Pass for Invalid credential, it prompts validation for invalid credentials");
		}
		else {
			 System.out.println("Login test - Fail for Invalid credential, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Fail for Invalid credential, it prompts validation for invalid credentials");
		}
		
		l.Signin("C13057", "hbss2545");     //Case-2 Valid id and Invalid Pwd
		boolean er2=loginErr.isDisplayed();
		if (er2=true) 
		{
		  System.out.println("Login test - Pass for valid username and invalid pwd, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Pass for valid username and invalid pwd, it prompts validation for invalid credentials");
		}
		else {
			 System.out.println("Login test - Fail for valid username and invalid pwd, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Fail for valid username and invalid pwd, it prompts validation for invalid credentials");
		}
		
		l.Signin("C11111", "Hbss2004");    //Case-3 Invalid id and Valid Pwd
		boolean er3=loginErr.isDisplayed();
		if (er3=true) 
		{
		  System.out.println("Login test - Pass for Invalid id and Valid Pwd, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Pass Invalid id and Valid Pwd, it prompts validation for invalid credentials");
		}
		else {
			 System.out.println("Login test - Fail for Invalid id and Valid Pwd, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Fail for Invalid id and Valid Pwd, it prompts validation for invalid credentials");
		}
		
		l.Signin("C13057", "Hbss2004");    //Case-4 Valid id and Valid Pwd
		boolean er4=loginErr.isDisplayed();
		if (er4=true) 
		{
		  System.out.println("Login test - Pass for Valid id and Valid Pwd, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Pass Valid id and Valid Pwd, it prompts validation for invalid credentials");
		}
		else {
			 System.out.println("Login test - Fail for Valid id and Valid Pwd, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Fail for valid id and Valid Pwd, it prompts validation for invalid credentials");
		}
      }
}
