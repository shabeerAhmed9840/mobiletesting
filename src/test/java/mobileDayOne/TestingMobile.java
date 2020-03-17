package mobileDayOne;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestingMobile {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dp = new DesiredCapabilities();
		dp.setCapability("deviceName", "shabeer phone");
		dp.setCapability("platformName", "Android");
		dp.setCapability("platformVersion", "6.0.1");
		dp.setCapability("appPackage", "com.snapdeal.main");
		dp.setCapability("appActivity", "com.snapdeal.ui.material.activity.MaterialMainActivity");

		// AppiumDriver d = new AndroidDriver<MobileElement>(new
		// URL("https://0.0.0.0:4723/wd/hub"), dp);

		AppiumDriver d = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dp);

		MobileElement search = (MobileElement) d.findElement(By.id("search_text_view"));
		search.click();
		MobileElement pass = (MobileElement) d.findElement(By.id("search_edit_text"));
		pass.sendKeys("iphone");
		/*
		 * MobileElement allowPopUp = (MobileElement)
		 * d.findElement(By.id("positiveBtnView")); allowPopUp.click(); MobileElement
		 * allowPermission = (MobileElement)
		 * d.findElement(By.id("permission_allow_button")); allowPermission.click();
		 */MobileElement iphone = (MobileElement) d.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/com.snapdeal.sdrecyclerview.widget.SDRecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout\r\n"));
		iphone.click();
		MobileElement selIphone = (MobileElement) d.findElement(By.xpath("//*[@class='android.widget.TextView']"));

		selIphone.click();

	}

}
