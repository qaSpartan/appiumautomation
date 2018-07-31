package com.sixt.apps.Locators;

public final class AndroidLocators{
	

	public static final String HomePageToolBar_XPath = "//android.view.View[contains(@resource-id,'activityMainToolbar')]/android.widget.TextView[@index=1]";
	public static final String carMenu_XPath = "//android.widget.LinearLayout[contains(@resource-id,'tab_layout')]/android.widget.LinearLayout[@index=0]";
	
//	SignIN Page
	public static final String signIn_ID = "signin_to_yourAccount";
	public static final String signInButton_ID = "sign_in_button";
	
//	LoginPage
	public static final String userEmailLogin_ID = "ap_email_login";
	public static final String continueButton_ID="continue";
	public static final String userPassword_ID="ap_password";
	public static final String submitCredentials_ID="signInSubmit";
	
//	Search
	
	public static final String searchProduct_ID = "rs_search_src_text";
	public static final String search_DropDown_ID = "iss_search_dropdown_item_suggestion";
	public static final String searchResults_XPath = "//android.widget.ListView[contains(@resource-id,'rs_vertical_stack_view')]/android.widget.LinearLayout[@index=1]/android.widget.FrameLayout[@index=0]";
	
//	Product Page Attributes
	public static final String productSizeElement_XPath = "//android.view.View[@index=8]/android.view.View[@index=0]";
	public static final String productSize_XPath = "//android.widget.ListView[@index=0]/android.view.View[@index=1]";
	public static final String productAddToCart_ID = "add-to-cart-button";
	public static final String cartCount_ID= "action_bar_cart_count";
	public static final String cart_ID = "action_bar_cart";
	
//	BasketPage
	public static final String proceedCheckout_ID = "a-autoid-0-announce";
	
	
	
}