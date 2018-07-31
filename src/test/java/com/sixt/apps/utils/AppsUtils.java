package com.sixt.apps.utils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.TouchAction;
import io.appium.java_client.PerformsTouchActions;

public class AppsUtils{
	
	private AndroidDriver<MobileElement> testdriver;
	private static Logger testLogger = LogManager.getLogger(Logger.class.getName());
	
	public boolean androidBackButton(){
		boolean flag=true;
		try{
			testdriver.pressKeyCode(AndroidKeyCode.BACK);
			
		}catch(Exception ex){
		  testLogger.error("Unable to click Android Device back button while adding details in Shipping Address page");
		 flag=false;	
		}
		return flag;
	}
	
	public boolean androidNextButton() {
		boolean flag = true;
		try {
			testdriver.pressKeyCode(AndroidKeyCode.ENTER);

		} catch (Exception ex) {
			testLogger.error("Unable to click Android Device back button while adding details in Shipping Address page");
			flag = false;
		}
		return flag;
	}
	
	
public  void scroll(String down){
    	
    	JavascriptExecutor js = (JavascriptExecutor) testdriver;
    	HashMap<String, String> scrollObject = new HashMap<String, String>();
    	scrollObject.put("direction", down);
    	js.executeScript("mobile: scroll", scrollObject);

    	}
	
	public  void scrollUp(String up){
    	
    	JavascriptExecutor js = (JavascriptExecutor) testdriver;
    	HashMap<String, String> scrollObject = new HashMap<String, String>();
    	scrollObject.put("direction", up);
    	js.executeScript("mobile: scroll", scrollObject);

    	}
    
	public  void scrollleft(String left){
    	
    	JavascriptExecutor js = (JavascriptExecutor) testdriver;
    	HashMap<String, String> scrollObject = new HashMap<String, String>();
    	scrollObject.put("direction", left);
    	js.executeScript("mobile: scroll", scrollObject);

    	}
	
	
	public  void scrollright(String right){
    	
    	JavascriptExecutor js = (JavascriptExecutor) testdriver;
    	HashMap<String, String> scrollObject = new HashMap<String, String>();
    	scrollObject.put("direction", right);
    	js.executeScript("mobile: scroll", scrollObject);

    	}
	
	
	public void swipeUp(){
	  	 Set<String> availableContexts = testdriver.getContextHandles();
	  	 for(String context : availableContexts)
			if(context.contains("NATIVE_APP")){
				Dimension size = testdriver.manage().window().getSize(); 
				int starty = (int)(size.height * 0.100); 
				int endy = (int) (size.height * 0.60); 
				int startx = size.width/2; 
				TouchAction actions = new TouchAction(testdriver);
				actions.press(startx, endy).waitAction(Duration.ofSeconds(2)).moveTo(startx, starty).release().perform();

			}else{
				testLogger.error("Unable to perform swipe down operation");
				} 
	  	 
	   }
	
	
	public void swipeDown(){
		 Set<String> availableContexts = testdriver.getContextHandles();
	  	 for(String context : availableContexts)
			if(context.contains("NATIVE_APP")){
				Dimension size = testdriver.manage().window().getSize(); 
				int starty = (int)(size.height * 0.100); 
				int endy = (int) (size.height * 0.60); 
				int startx = size.width/2; 
				TouchAction actions = new TouchAction(testdriver);
				actions.press(startx, starty).waitAction(Duration.ofSeconds(2)).moveTo(startx, endy).release().perform();
				
				
			}else{
				testLogger.error("Unable to perform swipe up operation");
				} 
	  	 
	   }
	
	
	
	
	
	
	
	
	
	
	
	
}