package status;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee_Status4 {
	
	@Test
	
	public void status () throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dotnet = new ChromeDriver();
		dotnet.manage().window().maximize();
		dotnet.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dotnet.get("http://14.98.231.134/Account/Login.aspx");

		Thread.sleep(2000);
		dotnet.findElement(By.id("Login1_UserName")).sendKeys("00000280");
		Thread.sleep(2000);
		dotnet.findElement(By.id("Login1_Password")).sendKeys("abcd@123");
		Thread.sleep(2000);
		dotnet.findElement(By.id("Login1_LoginButton")).click();
		Thread.sleep(2000);
		WebElement p=dotnet.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/a"));
		Actions ac= new Actions(dotnet);
		ac.moveToElement(p).build().perform();
		Thread.sleep(2000);
		dotnet.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/ul/li/a")).click();
		Thread.sleep(2000);
		
		dotnet.findElement(By.linkText("Status")).click();
		Thread.sleep(2000);
		dotnet.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_GV_Report_btnStatus_0\"]")).click();
		Thread.sleep(4000);
		dotnet.close();
	}

}
