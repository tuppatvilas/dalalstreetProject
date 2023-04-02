package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//-----------------obj repository----------
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_textbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass_textbox;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	//-------action-------------------------------------
	public void enteremailadd(String email)
	{
		email_textbox.sendKeys(email);
	}
	public void enterpassword(String password ) 
	{
		pass_textbox.sendKeys(password);
	}
	public void clickonloginbtn()
	{
		login_btn.click();
	}
	

}