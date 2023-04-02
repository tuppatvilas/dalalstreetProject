package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//-----------------obj repository-----------
	@FindBy(xpath="//input[@class='form-control']")
	WebElement search_button;
	
	@FindBy(xpath="(//div[@class='m-2 card-title'])[2]")
	WebElement select_option;
	
	@FindBy(xpath="//button[@id='page-header-user-dropdown']")
	WebElement profile_dropdown;
	
	@FindBy(xpath="//span[text()='Power Off']")
	WebElement power_off_btn;
	@FindBy(xpath="//a[@class='nav-link dropdown-togglez arrow-none']")
	WebElement transition_btn;
	
	//-------------------actinon----------
	public void enterinserchbox(String company)
	{
		search_button.sendKeys(company);
	}
	public void selectoption()
	{
		select_option.click();
	}
	public void clickonprofiledropdown()
	{
		profile_dropdown.click();
	}
	public void clickonpoweroffbtn()
	{
		power_off_btn.click();
	}
   public void clickontransitionbutton()
   {
	   transition_btn.click();
   }
}
