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

public class Manager_review_employeeRating3 {

	@Test

	public void pms_module() throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		WebDriver iemp = new ChromeDriver();
		iemp.manage().window().maximize();
		iemp.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iemp.get("http://14.98.231.134/Account/Login.aspx");

		Thread.sleep(2000);
		iemp.findElement(By.id("Login1_UserName")).sendKeys("00000127");
		Thread.sleep(2000);
		iemp.findElement(By.id("Login1_Password")).sendKeys("abcd@123");
		Thread.sleep(2000);
		iemp.findElement(By.id("Login1_LoginButton")).click();
		Thread.sleep(2000);

		WebElement p = iemp.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/a"));
		Actions ac = new Actions(iemp);
		ac.moveToElement(p).build().perform();
		Thread.sleep(2000);
		iemp.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/ul/li/a")).click();
		Thread.sleep(2000);

		iemp.findElement(By.partialLinkText("Review")).click();
		Thread.sleep(2000);
		iemp.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_Grdmngrating_btnPendingView_0\"]/i"))
				.click();
		Thread.sleep(2000);
		WebElement a = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_0"));
		a.sendKeys("3.9");// 1st rating
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement c = iemp.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_Grd_mng_txtManage_1\"]"));
		c.sendKeys("4.0");// 2nd rating
		c.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		WebElement cc = iemp.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_Grd_mng_txtManage_2\"]"));
		cc.sendKeys("3.4");// 3rd rating
		cc.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		WebElement d = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_3"));
		d.sendKeys("3.9");// 4th rating
		d.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement dsp = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_4"));
		dsp.sendKeys("3.6");// 5th rating
		dsp.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement dd = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_5"));
		dd.sendKeys("4.1");// 6th rating
		dd.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement pys = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_6"));
		pys.sendKeys("3.9");// 7th rating
		pys.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement jkl = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_7"));
		jkl.sendKeys("4.0");
		jkl.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement acc = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_8"));
		acc.sendKeys("3.9");
		acc.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement e = iemp.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_0\"]"));
		e.sendKeys("very good");// 1st remark
		e.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement f = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_1"));
		f.sendKeys("nice work");// 2nd remark
		f.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		WebElement g = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_2"));
		g.sendKeys("very Great need to focus");// 3rd remark
		g.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement h = iemp.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_3\"]"));
		h.sendKeys("perfect as well as  good");// 4th remark
		h.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement gk = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_4"));
		g.sendKeys("very Great need to focus");// 5th remark
		g.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ghu = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_5"));
		g.sendKeys("Timesheet maintaining on time");// 6th remark
		g.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ggg = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_6"));
		g.sendKeys("Task response on time");// 7th remark
		g.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement sg = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_7"));
		g.sendKeys("Nominee for training");// 8th remark
		g.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement gr = iemp.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_8"));
		g.sendKeys("good learning activities");// 9rd remark
		g.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		iemp.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_managerupdate\"]")).click();
		Thread.sleep(2000);

	}
}