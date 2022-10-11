package sr_manager_apprval;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Senior_Manager6 {

	@Test
	public void manager() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver pms = new ChromeDriver();
		pms.manage().window().maximize();
		pms.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pms.get("http://14.98.231.134/Account/Login.aspx");

		Thread.sleep(2000);
		pms.findElement(By.id("Login1_UserName")).sendKeys("00000001");
		Thread.sleep(2000);
		pms.findElement(By.id("Login1_Password")).sendKeys("abcd@123");
		Thread.sleep(2000);
		pms.findElement(By.id("Login1_LoginButton")).click();

		Thread.sleep(2000);
		WebElement dd=pms.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/a"));
		Actions ac = new Actions(pms);
		ac.moveToElement(dd).build().perform();
		Thread.sleep(2000);
		pms.findElement(By.linkText("PMS")).click();
		Thread.sleep(2000);
		Alert aee=pms.switchTo().alert();
		aee.dismiss();
		Thread.sleep(2000);
		pms.findElement(By.partialLinkText("Manager's")).click();
		Thread.sleep(2000);
		pms.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_Grdmngrating_btnPendingView_1\"]")).click();
		Thread.sleep(2000);
		WebElement mn=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_0"));
		mn.sendKeys("4.3");//1st rating
		mn.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ff=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_0"));
		ff.sendKeys("Good working");//1st remark
		ff.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement tt=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_1"));
		tt.sendKeys("3.9");//2nd rating  
		tt.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement hf=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_1"));
		hf.sendKeys("Need to improve");//2nd remark
		hf.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement pp=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_2"));
		pp.sendKeys("4.1");//3rd rating 
		pp.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement as=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_2"));
		as.sendKeys("Great working");//3rd Remark
		as.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement gk=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_3"));
		gk.sendKeys("4.0");//4th rating
		gk.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement bv=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_3"));
		bv.sendKeys("Good Progress");//4th remark
		bv.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement jk=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_4"));
		jk.sendKeys("3");//5th rating
		jk.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ask=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_4"));
		ask.sendKeys("Need Improvement");//5th remark
		ask.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement rrr=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_5"));
		rrr.sendKeys("4.7");//6th rating
		rrr.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement tre=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_5"));
		tre.sendKeys("Great");//6th remark
		tre.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ntr=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_6"));
		ntr.sendKeys("3.8");//7th rating
		ntr.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement mns=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_6"));
		mns.sendKeys("Work more to acheive target");//7th remark
		mns.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ps=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtManage_7"));
		ps.sendKeys("5");//8th rating 
		ps.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ytre=pms.findElement(By.id("ContentPlaceHolder1_MainContent_Grd_mng_txtmremarks_7"));
		ytre.sendKeys("Great work");//8th remark
		ytre.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		pms.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_managerupdate\"]")).click();
		
		
	}

}
