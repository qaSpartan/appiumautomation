package com.sixt.apps.PageObjects;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sixt.apps.utils.AppsUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.*;
import com.sixt.apps.Locators.AndroidLocators;

public class Search extends AppsUtils{
	private AndroidDriver<MobileElement> driver;
	
	public Search(AndroidDriver<MobileElement> driver){
//		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}
	
	@FindBy(id=AndroidLocators.searchProduct_ID)
	MobileElement searchProduct;
	

	@FindBy(id=AndroidLocators.search_DropDown_ID)
	List<MobileElement> searchProductDropDown;
	
	@FindBy(xpath=AndroidLocators.searchResults_XPath)
	MobileElement searchResultFirstProduct;
	
	public void initiateSearch(){
		searchProduct.click();
		
	}
	
	public void searchProduct(String product){
		
		searchProduct.sendKeys(product);
	}
	
	public void selectProduct(){
		searchProductDropDown.get(0).click();
		searchResultFirstProduct.click();
	}
	
	
	
	
}	
	