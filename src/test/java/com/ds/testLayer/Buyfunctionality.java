package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashBoardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;


public class Buyfunctionality extends TestBase {
	
	@Test
	public void buyverificationWithLongTermMarket() throws InterruptedException
	{
		String expected = "Order Created successfully";
	//------------------obj creation------------------------	
		//LoginPage login_obj = new LoginPage(driver);
		//UtilClass util_obj = new UtilClass();
		//DashBoardPage dash_obj = new DashBoardPage(driver);
		//ExchangePage exchange_obj = new ExchangePage(driver);
	//----------------login-----------------------------------------	
		//login_obj.enteremailadd("vilastuppat@gmail.com");
		//login_obj.enterpassword("Vilas@3113");
		//login_obj.clickonloginbtn();
		//Thread.sleep(3000);
	//-----------------serch share--------------------------------------	
		dash_obj.enterinserchbox("wipro");
		dash_obj.selectoption();
		Thread.sleep(3000);
	//-----------------buy share with longterm and intraday	
		exchange_obj.clickonbuybutton1();
		exchange_obj.enterquantity("2");
		Thread.sleep(3000);
		util_obj.scrollby();
		Thread.sleep(3000);
		exchange_obj.clickonbuybutton2();
		Thread.sleep(3000);
	   String actual= exchange_obj.orderconformpopup();
	   Assert.assertEquals(actual, expected);
      System.out.println(actual);
	}

	//-------------- Intraday With Market----------------------------------------------------------------
	/*	@Test
	public void buyWithIntradayMarket() throws InterruptedException
	 {
		
		 String expected = "Order Created Successfully";
		 
     LoginPage login_pg = new LoginPage(driver);
     UtilClass util_obj = new UtilClass();
     DashBoardPage dash_obj = new DashBoardPage(driver);
      ExchangePage exchange_obj = new ExchangePage(driver);
	     login_pg.enteremailadd("vilastuppat@gmail.com");
		 login_pg.enterpassword("Vilas@3113");
		 login_pg.clickonloginbtn();
	Thread.sleep(3000);
		 dash_obj.enterinserchbox("wipro");
		 dash_obj.selectoption();
	Thread.sleep(3000);
	     exchange_obj.clickonbuybutton1();
	     exchange_obj.selectIntraday();
	     exchange_obj.enterquantity("2");
	     util_obj.scrollby();
	     exchange_obj.clickonbuybutton2();
	 Thread.sleep(3000);
	 String actual= exchange_obj.orderconformpopup();
	 Assert.assertEquals(actual, expected);
	 System.out.println(actual);
	    
	 }*/

}
