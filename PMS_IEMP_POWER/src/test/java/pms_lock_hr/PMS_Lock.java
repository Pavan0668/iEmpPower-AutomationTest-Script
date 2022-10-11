package pms_lock_hr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PMS_Lock {
	
	@Test 
	
	public void lock() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver lock = new FirefoxDriver();
		lock.manage().window().maximize();
		lock.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lock.get("http://192.168.2.240/Account/Login.aspx");
		
		Thread.sleep(2000);
		lock.findElement(By.id("Login1_UserName")).sendKeys("00000284");
		Thread.sleep(2000);
		lock.findElement(By.id("Login1_Password")).sendKeys("abcd@123");
		Thread.sleep(2000);
		lock.findElement(By.id("Login1_LoginButton")).click();
		Thread.sleep(2000);
		
		WebElement hh=lock.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li8\"]"));
		Actions ac=new Actions(lock);
		ac.moveToElement(hh).build().perform();
		lock.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_Li2\"]/a")).click();
		Thread.sleep(2000);
		
		lock.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdLocking_CB_LockHeader\"]")).click();
		Thread.sleep(2000);
		lock.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdLocking_CB_LockHeader\"]")).click();
		Thread.sleep(2000);
		lock.findElement(By.id("ContentPlaceHolder1_MainContent_btnSubmit")).click();
		Thread.sleep(2000);
		
		lock.findElement(By.id("ContentPlaceHolder1_MainContent_txtsearch"))
		  .sendKeys("361");//search employee id
		 
		Thread.sleep(2000);
		lock.findElement(By.id("ContentPlaceHolder1_MainContent_btnsearch")).click();
		Thread.sleep(2000);
		
		lock.findElement(By.id("ContentPlaceHolder1_MainContent_grdLocking_CB_Lock_0")).click();
		Thread.sleep(2000);
		lock.findElement(By.id("ContentPlaceHolder1_MainContent_btnSubmit")).click();
		Thread.sleep(2000);
		
	/*	lock.findElement(By.id("ContentPlaceHolder1_MainContent_grdLocking_CB_Lock_0")).click();
		Thread.sleep(2000);
		lock.findElement(By.id("ContentPlaceHolder1_MainContent_btnSubmit")).click();
		Thread.sleep(2000);*/
		
		
		lock.close();
	}

}
