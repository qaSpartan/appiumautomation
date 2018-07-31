package com.sixt.apps.PageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import com.sixt.apps.Locators.AndroidLocators;

public class SignInPage {
	private static AndroidDriver<MobileElement> Testdriver;
	
	
	public SignInPage(AndroidDriver<MobileElement> driver){
//		super(driver);
		Testdriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(Testdriver, 30, TimeUnit.SECONDS), this);
	}
	
	@FindBy(id=AndroidLocators.signIn_ID)
	MobileElement signINLabel;

	
	@FindBy(id=AndroidLocators.signInButton_ID)
	MobileElement signIn;

	@FindBy(id=AndroidLocators.userEmailLogin_ID)
	MobileElement userEmail;

	@FindBy(id=AndroidLocators.continueButton_ID)
	MobileElement continueButton;
	
	@FindBy(id=AndroidLocators.userPassword_ID)
	MobileElement userPassword;
	
	@FindBy(id=AndroidLocators.submitCredentials_ID)
	MobileElement submitUserCredentials;
	
	
	
	
	public void verifySignInLabel(){
		String value = signINLabel.getText() ;	
	}
	
	public void clickSignIn(){
		signIn.click();
	}
	
	
	public void addUserEmail(String email){
		if(userEmail.getText()!=null){
			userEmail.sendKeys(Keys.CLEAR);
		}
		userEmail.sendKeys(email);
		continueButton.click();
		
	}
	
	public void addPassword(String password){
		userPassword.sendKeys(password);	
	}
	
	public void submitCredentials(){
		submitUserCredentials.click();
	}
	
	 
	
	
	
	
	
	
}