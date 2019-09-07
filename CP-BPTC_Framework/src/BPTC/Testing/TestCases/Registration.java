package BPTC.Testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import BPTC.Testing.Base.Base;

public class Registration extends Base {
public void Reg_new() throws InterruptedException
{
	WebElement LoginBtn=driver.findElement(By.id("lnkLogin"));
	WebDriverWait w=new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.textToBePresentInElement(LoginBtn, "Login"));
	Thread.sleep(5000);
	
	WebElement Register_Btn=driver.findElement(By.id("btnRyderLnk"));
	Register_Btn.click();
	Thread.sleep(3000);
	
	WebElement ClientId = driver.findElement(By.xpath("//input[@id='txtClientID']"));  //Tag with 
	//WebElement ClientId = driver.findElement(By.id("txtClientID"));
	ClientId.sendKeys("C13046");
	
	Actions ac=new Actions(driver);
	ac.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(10000);
	
	WebElement name=driver.findElement(By.id("txtFName"));
	String fname=name.getText();
	System.out.println(fname);
			
	WebElement Pswd =driver.findElement(By.xpath("//input[@type='password' and @id='txtUserPassword']"));
	Pswd.sendKeys("Hbss2004");
	
	WebElement ConfrmPswd=driver.findElement(By.xpath("//input[@type='password' and @id='txtConfirmPassword']"));
	ConfrmPswd.sendKeys("Hbss2004");
	Thread.sleep(8000);
	WebElement LetsGo = driver.findElement(By.id("btnRegister"));
	LetsGo.click();
	
}
}