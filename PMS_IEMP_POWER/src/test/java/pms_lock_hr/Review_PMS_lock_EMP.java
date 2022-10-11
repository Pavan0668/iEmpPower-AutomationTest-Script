package pms_lock_hr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Review_PMS_lock_EMP {
	
	
	@Test 
	public void test_emp() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver pmslock = new EdgeDriver();
		pmslock.manage().window().maximize();
		pmslock.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pmslock.get("http://192.168.2.240/Account/Login.aspx");
		
		Thread.sleep(2000);
		pmslock.findElement(By.id("Login1_UserName")).sendKeys("00000361");
		Thread.sleep(2000);
		pmslock.findElement(By.id("Login1_Password")).sendKeys("abcd@123");
		Thread.sleep(2000);
		pmslock.findElement(By.id("Login1_LoginButton")).click();
		Thread.sleep(2000);
		WebElement c=pmslock.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/a"));
		Thread.sleep(2000);
	
		Actions ast = new Actions(pmslock);
		ast.moveToElement(c).build().perform();
		pmslock.findElement(By.linkText("PMS")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
