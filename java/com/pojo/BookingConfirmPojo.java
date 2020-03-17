package com.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BookingConfirmPojo extends com.global.LibGlobal{
	public BookingConfirmPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='order_no']")
	private List<WebElement> lstOrderNumber;

    @FindBy(xpath="//input[@id='logout']")
    private List<WebElement> btnLogOut;

	public List<WebElement> getLstOrderNumber() {
		return lstOrderNumber;
	}

	public List<WebElement> getBtnLogOut() {
		return btnLogOut;
	}
}
