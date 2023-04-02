package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashBoardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransitionPage;
import com.ds.testBase.TestBase;

public class TransitionTest extends TestBase {
	
	@Test
	public void tansitionPageDataGet() throws InterruptedException
	{
		//LoginPage login_obj = new LoginPage(driver);  // move to test base class
		//DashBoardPage dash_obj = new DashBoardPage(driver);
		//TransitionPage get_data =new TransitionPage(driver);
		//UtilClass util_obj = new UtilClass();
		//login_obj.enteremailadd("vilastuppat@gmail.com");  // move to test base class
		//login_obj.enterpassword("Vilas@3113");
		//login_obj.clickonloginbtn();
		//Thread.sleep(3000);
		dash_obj.clickontransitionbutton();
		get_data.getdata();
		Thread.sleep(3000);
		get_data.getalldata3();
	}
	

}
