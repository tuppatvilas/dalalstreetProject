package com.ds.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class UtilClass extends TestBase {

	public UtilClass()
	{
		PageFactory.initElements(driver,this);
	}
	
	//----get url-------
	public String getwebpageurl()
	{
		String url =driver.getCurrentUrl();
		return url;
	}
//--------scroll down--------------------------------------------	
	public void scrollby()
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	public static void TakeSS(String filename)
	{
		String path ="C:\\sft testing\\DalalstreetFrameWork\\Screenshots\\";
		//screenshot
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path+filename+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
