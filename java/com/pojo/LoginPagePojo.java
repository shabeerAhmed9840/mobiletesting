package com.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPagePojo extends com.global.LibGlobal  {
	public LoginPagePojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private List<WebElement> user;

	@FindBy(xpath="//input[@name='password']")
	private List<WebElement> pass;
	
	@FindBy(xpath="//input[@name='login']")
	private List<WebElement> login;

	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getLogin() {
		return login;
	}

	
	
	
	
	


}
