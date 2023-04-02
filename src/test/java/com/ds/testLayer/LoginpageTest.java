package com.ds.testLayer;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class LoginpageTest extends TestBase {
	
	@Test
	public void loginveryfication() throws InterruptedException
	{
		String expected ="https://www.apps.dalalstreet.ai/dashboard";
		//LoginPage login_obj = new LoginPage(driver);
		//UtilClass util_obj = new UtilClass();
		//login_obj.enteremailadd("vilastuppat@gmail.com");
		//login_obj.enterpassword("Vilas@3113");
		//login_obj.clickonloginbtn();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(3000);
		System.out.println(util_obj.getwebpageurl());
		Thread.sleep(3000);
		String actual_url = util_obj.getwebpageurl();
		Thread.sleep(3000);
		Assert.assertEquals(actual_url, expected);
	}

}
