package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LibGlobal {
	public static AppiumDriver driver = null;

	public static void appiumLaunch() throws MalformedURLException {
		DesiredCapabilities dp = new DesiredCapabilities();
		dp.setCapability("deviceName", "shabeer phone");
		dp.setCapability("platformName", "Android");
		dp.setCapability("platformVersion", "6.0.1");
		dp.setCapability("appPackage", "com.snapdeal.main");
		dp.setCapability("appActivity", "com.snapdeal.ui.material.activity.MaterialMainActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dp);

	}

	public static void fill(MobileElement element, String name) {
		element.sendKeys(name);

	}

	public static void btnClick(MobileElement element) {
		element.click();

	}
	
}
