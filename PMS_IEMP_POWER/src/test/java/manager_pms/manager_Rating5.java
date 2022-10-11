package manager_pms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class manager_Rating5 {

	@Test

	public void pms_module() throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		WebDriver dotnet = new ChromeDriver();
		dotnet.manage().window().maximize();
		dotnet.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dotnet.get("http://14.98.231.134/Account/Login.aspx");

		Thread.sleep(2000);
		dotnet.findElement(By.id("Login1_UserName")).sendKeys("00000127");
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

		WebElement ghj = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_0"));
		ghj.sendKeys("4.3");// 1st rating
		ghj.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement f = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_0"));
		f.sendKeys("Good");// 1st remark
		f.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement rt = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_1"));
		rt.sendKeys("3.5");// 2nd rating
		rt.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement aa = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_1"));
		aa.sendKeys("Great work");// 2nd remark
		aa.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement jh = dotnet.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtself_2\"]"));
		jh.sendKeys("3.0");// 3rd
		jh.sendKeys(Keys.ENTER);
		// rating
		Thread.sleep(2000);
		WebElement j= dotnet.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtremark_2\"]"));
		j.sendKeys("Need to work");// 3rd remark
		j.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement fg = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_3"));
		fg.sendKeys("1.2");// 4th rating
		fg.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement d = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_3"));
		d.sendKeys("Bad");// 4th remark
		d.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement cc = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_4"));
		cc.sendKeys("3");// 5th rating
		cc.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement t = dotnet.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtremark_4\"]"));
		t.sendKeys("best");// 5th remark
		t.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement rf = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_5"));
		rf.sendKeys("4.5");// 6th rating
		rf.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement mon = dotnet
				.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtremark_5\"]"));
		mon.sendKeys("Hardworking");// 6th remark
		mon.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement bhanu = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_6"));
		bhanu.sendKeys("1.1");// 7th rating
		bhanu.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement pavan = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_6"));
		pavan.sendKeys("need progress");// 7th remark
		pavan.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement as = dotnet.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtself_7\"]"));
		as.sendKeys("3");// 8th
		as.sendKeys(Keys.ENTER);
		// rating
		Thread.sleep(2000);
		WebElement somu = dotnet
				.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtremark_7\"]"));
		somu.sendKeys("progressing");// 8th remark
		somu.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		dotnet.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_Submit\"]")).click();
		Thread.sleep(2000);
		dotnet.close();

	}

}
