package status;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manager_status_Review7 {
	
	@Test 
	
	public void status () throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver itchamp = new ChromeDriver();
		itchamp.manage().window().maximize();
		itchamp.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		itchamp.get("http://192.168.2.240/Account/Login.aspx");
		
		itchamp.findElement(By.id("Login1_UserName")).sendKeys("00000001");
		Thread.sleep(1000);
		itchamp.findElement(By.id("Login1_Password")).sendKeys("abcd@123");
		Thread.sleep(1000);
		itchamp.findElement(By.id("Login1_LoginButton")).click();
		Thread.sleep(1000);
		WebElement t=itchamp.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/a"));
	    Actions ac = new Actions(itchamp);
	    ac.moveToElement(t).build().perform();
	    Thread.sleep(1000);
	    itchamp.findElement(By.linkText("PMS")).click();
	    Alert al= itchamp.switchTo().alert();
	   al.dismiss();
	   Thread.sleep(2000);
	   
	   itchamp.findElement(By.partialLinkText("Manager's")).click();
	   Thread.sleep(2000);
	   itchamp.findElement(By.linkText("Status")).click();
	   Thread.sleep(2000);
	   itchamp.findElement(By.id("ContentPlaceHolder1_MainContent_GV_Report_btnStatus_0")).click();
	    
	}

}
