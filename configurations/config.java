package com.sixt.apps.configurations;


public  class config{
	private static  String appPackage;
	private static String appActivity;
	private static int port;
	private static String UDID;
	
	
	
	public static void setappPackage(String appPackageName){
		config.appPackage =  appPackageName;
	 }
	
	public static String getappPackage() {
		return appPackage;
	}
	
	public static void setAppActivity(String appActivityName){
		config.appActivity = appActivityName;
	}
	
	public static String getAppActivity() {
	    return appActivity;
    }
			 
	public static void setPort(int portNumber){
		config.port = portNumber;
	}
	
	public static int getPort() {
		return port;
	}
	
	public static void setDeviceID(String deviceID) {
		config.UDID = deviceID;
	}
	
	public static String getDeviceID() {
		return UDID;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}