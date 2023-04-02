package com.ds.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TransitionPage {
	
	private WebDriver driver; 
	public TransitionPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public void getdata()
	{
	 String data= driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText();
	 System.out.println(data);
	}
	public void getalldata()
	{
	 String data= driver.findElement(By.xpath("//div[@class='table-responsive']")).getText();
	 System.out.println(data);
	}
	public void getalldata2()
	{
	 String data= driver.findElement(By.xpath("//div[@class='table-responsive']")).getText();
	 System.out.println(data);
	}
	public void getalldata3()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String data= driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				 System.out.println(data);
		}
		System.out.println();
	}
	
}}
