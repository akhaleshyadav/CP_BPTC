package BPTC.Testing.POM;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
		   ChromeDriver driver;
		   Properties pr;
	
    public Login(ChromeDriver driver, Properties pr)
		   {
			   this.driver=driver;
			   this.pr=pr;
		   }
	public void Signin(String uid, String Pwd) throws InterruptedException
    {   
    	
    	WebElement userid = driver.findElement(By.id("txtLoginUserId"));
		userid.sendKeys(uid);
		WebElement Password = driver.findElement(By.id("txtpassword"));
		Password.sendKeys(Pwd);
		WebElement LetsGo_login=driver.findElement(By.id("btnloginCmd"));
		LetsGo_login.click();
		Thread.sleep(5000);
    }
}
