package manager_pms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_only_emp_profile {
	
	
	@Test
	public void emp_profile() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dotnet = new ChromeDriver();
		dotnet.manage().window().maximize();
		dotnet.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dotnet.get("http://14.98.231.134/Account/Login.aspx");

		Thread.sleep(2000);
		dotnet.findElement(By.id("Login1_UserName")).sendKeys("00000333");
		Thread.sleep(2000);
		dotnet.findElement(By.id("Login1_Password")).sendKeys("abcd@123");
		Thread.sleep(2000);
		dotnet.findElement(By.id("Login1_LoginButton")).click();
		Thread.sleep(2000);

		WebElement p = dotnet.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/a"));
		Actions ac = new Actions(dotnet);
		ac.moveToElement(p).build().perform();
		Thread.sleep(2000);
		dotnet.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/ul/li/a")).click();
		
		Thread.sleep(2000);
		dotnet.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_relevantexperience\"]")).sendKeys("12345");
		Thread.sleep(2000);
		
		dotnet.close();
	}

}
