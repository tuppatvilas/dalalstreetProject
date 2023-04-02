package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {
	
	public ExchangePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//--------------object repository-------------	
	@FindBy(xpath="//a[text()='Buy']")
	WebElement buy_button1;
	@FindBy(xpath="//input[@name='input-Qunatity']")
	WebElement entr_quantity;
	@FindBy(xpath="//button[text()='Buy']")
	WebElement buy_button2;
	@FindBy(xpath="//div[contains(text(),'Order Created')]")
	WebElement ordersucsess_popup;
	@FindBy(xpath="//label[text()='Intraday']")
	WebElement intraday_button;
	
//--------------action class---------------------------
	public void clickonbuybutton1()
	{
		buy_button1.click();
	}
	public void clickonbuybutton2()
	{	
		buy_button2.click();	
	}
	public void enterquantity(String count)
	{   entr_quantity.click();
		entr_quantity.sendKeys(count);
	}
	public String orderconformpopup()
	{
		String conformation_mag=ordersucsess_popup.getText();
		//System.out.println(ordersucsess_popup.getText());
		return conformation_mag;
	}
	public void selectIntraday()
	{
		intraday_button.click();
	}
}
	


