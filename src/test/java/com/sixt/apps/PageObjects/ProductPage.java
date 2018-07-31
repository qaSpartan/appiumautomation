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

public class ProductPage extends AppsUtils{
	private AndroidDriver<MobileElement> driver;
	
	public ProductPage(AndroidDriver<MobileElement> driver){
//		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}
	
	
	@FindBy(xpath=AndroidLocators.productSizeElement_XPath)
	MobileElement productSizeElement;
	
	@FindBy(xpath=AndroidLocators.productSize_XPath)
	MobileElement selectSize;
	
	@FindBy(id=AndroidLocators.productAddToCart_ID)
	MobileElement addProductToCart;
	
	@FindBy(id=AndroidLocators.cartCount_ID)
	MobileElement getCartCount;
	
	
	@FindBy(id=AndroidLocators.cart_ID)
	MobileElement cart;
	
	
	public void selectProductSize(){
		productSizeElement.click();
		selectSize.click();	
			
		
	}
	
	public void addProduct(){
		super.swipeDown();
		addProductToCart.click();
	}
	
	public String getCartCount(){
		return getCartCount.getText();	
	}
	
	public void accessCart(){
		cart.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	