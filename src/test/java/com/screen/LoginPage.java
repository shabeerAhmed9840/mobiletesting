package com.screen;

import org.openqa.selenium.support.PageFactory;
import com.base.LibGlobal;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "search_text_view")
	private MobileElement searchBox;

	@AndroidFindBy(id = "search_edit_text")
	private MobileElement fillProduct;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/com.snapdeal.sdrecyclerview.widget.SDRecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout\r\n")
	private MobileElement selectProduct;

	public MobileElement getSearchBox() {
		return searchBox;
	}

	public MobileElement getFillProduct() {
		return fillProduct;
	}

	public MobileElement getSelectProduct() {
		return selectProduct;
	}

}