package com.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPojo extends com.global.LibGlobal {
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private List<WebElement> btnRadio;

	@FindBy(xpath = "//input[@name='continue']")
	private List<WebElement> btnContinue;

	public List<WebElement> getBtnRadio() {
		return btnRadio;
	}

	public List<WebElement> getBtnContinue() {
		return btnContinue;
	}

}
