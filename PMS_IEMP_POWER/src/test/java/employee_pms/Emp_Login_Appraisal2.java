package employee_pms;

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

public class Emp_Login_Appraisal2 {

	@Test

	public void rating() throws InterruptedException {
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

		WebElement p = dotnet.findElement(By.xpath("//*[@id=\"SideMenuContentPlaceHolder_li11\"]/a"));
		Actions ac = new Actions(dotnet);
		ac.moveToElement(p).build().perform();
		Thread.sleep(2000);
		dotnet.findElement(By.linkText("PMS")).click();
		Thread.sleep(3000);
		WebElement a = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_0"));
		a.sendKeys("4.5");// 1st rating
		a.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_1")).click();
		WebElement b = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_1"));
		b.sendKeys("4.1");// 2nd rating
		b.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement c = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_2"));
		c.sendKeys("3.6");// 3rd rating
		c.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement d = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_3"));
		d.sendKeys("3.5");// 4th rating
		d.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement hgj = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_4"));
		hgj.sendKeys("4.1");// 5th rating
		hgj.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ds = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_5"));
		ds.sendKeys("3.7");// 6th rating
		ds.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement kjl = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_6"));
		kjl.sendKeys("3.6");// 7th rating
		kjl.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement tt = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_7"));
		tt.sendKeys("4.3");// 8th rating
		tt.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement fgk = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_8"));
		fgk.sendKeys("3.3");// 9th rating
		fgk.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement wer = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_9"));
		wer.sendKeys("4.0");// 10th rating
		wer.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement hgjk = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtself_10"));
		hgjk.sendKeys("4.5");// 11th rating
		hgjk.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement z = dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_0"));
		z.sendKeys("Best");// 1st remark
		z.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ys = dotnet
				.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtremark_1\"]"));
		ys.sendKeys("Good");// 2nd remark
		ys.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement xx = dotnet
				.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtremark_2\"]"));
		xx.sendKeys("Hardworking");// 3rd remark
		xx.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement vv = dotnet
				.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MainContent_grdrate_txtremark_3\"]"));
		vv.sendKeys("Intellegent");// 4th remark
		vv.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	    WebElement fw =dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_4"));
	    fw.sendKeys("Good improvement");//5th remark 
	    fw.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    WebElement  rrr=dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_5"));
	    rrr.sendKeys("still working");//6th remark
	    rrr.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    WebElement zk=dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_6"));
	    zk.sendKeys("Implementing ");//7th remark
	    zk.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    WebElement jkl=dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_7"));
	    jkl.sendKeys("Working on aggresive level");//8 th remark
	    jkl.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    WebElement gth=dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_8"));
	    gth.sendKeys("did certification for scrum");//9th remark
	    gth.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	   WebElement t=dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_9"));
	    t.sendKeys("Conducted program for 4 hours");//10 th remark
	    t.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    WebElement gjh=dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_grdrate_txtremark_10"));
	    gjh.sendKeys("Attended daily standup call ");
	    gjh.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	    

		dotnet.findElement(By.id("ContentPlaceHolder1_MainContent_Submit")).click();
		Thread.sleep(3000);
		Alert alt=dotnet.switchTo().alert();
		alt.accept();

		Thread.sleep(3000);
		dotnet.close();
	}

}
