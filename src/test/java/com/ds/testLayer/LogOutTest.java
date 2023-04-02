package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashBoardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class LogOutTest extends TestBase {
	
	@Test
	public void logoutverifycation() throws InterruptedException
	{
		String expected_result = "https://www.apps.dalalstreet.ai/logout";
		//LoginPage login_obj = new LoginPage(driver);
		//DashBoardPage dash_obj = new DashBoardPage(driver);
		//UtilClass util_obj = new UtilClass();
		//login_obj.enteremailadd("vilastuppat@gmail.com");
		//login_obj.enterpassword("Vilas@3113");
		//login_obj.clickonloginbtn();
		//Thread.sleep(5000);
		dash_obj.clickonprofiledropdown();
		dash_obj.clickonpoweroffbtn();
		Thread.sleep(5000);
		String act_result =util_obj.getwebpageurl();
		Assert.assertEquals(act_result, expected_result);
	}

}
