package com.sixt.apps.PageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sixt.apps.utils.AppsUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.*;
import com.sixt.apps.Locators.AndroidLocators;

public class BasketPage extends AppsUtils{
	private AndroidDriver<MobileElement> driver;
	
	public BasketPage(AndroidDriver<MobileElement> driver){
//		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}
	
	@FindBy(id=AndroidLocators.proceedCheckout_ID)
	MobileElement proceedCheckout;
	
	
	public void proceedCheckout(){
		proceedCheckout.click();
	}
}	
	
	