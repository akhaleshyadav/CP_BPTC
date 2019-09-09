package BPTC.Testing.TestCases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BPTC.Testing.Base.Base;
import BPTC.Testing.POM.Login;
import BPTC.utilities.Logs;

public class LoginTC extends Base {
	@Test(dataProvider = "LoginData")
	public void LoginTest(String Userid, String Password) throws InterruptedException
	{   
		System.out.println(Userid);
		System.out.println(Password);
		
		WebElement lgb=driver.findElement(By.id("lnkLogin"));
		lgb.click();
		//For valid case
		Login l =new Login(driver, pr);
		
		
		l.Signin(Userid, Password );    //Case-1 Invalid id and Pwd
		Thread.sleep(3000);
		WebElement loginErr=driver.findElement(By.id("divLoginErrMsg"));
		boolean er1=loginErr.isDisplayed();
		System.out.println(er1);
		if (er1=true) 
		{
		  System.out.println("Login test - Pass for Invalid credential, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Pass for Invalid credential, it prompts validation for invalid credentials");
		}
		else 
		{
			 System.out.println("Login test - Fail for Invalid credential, it prompts validation for invalid credentials");
		  Logs.Takelog("LoginTC", "Login test -Fail for Invalid credential, it prompts validation for invalid credentials");
		}
		
		
      }
}
