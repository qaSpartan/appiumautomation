package com.sixt.apps.configurations;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.sixt.apps.configurations.config;

public class readProperties {
	
	private Properties prop;
	
	private static Logger log = Logger.getLogger(Logger.class.getName());
	
	private Properties readConfigurations(String fileName){
		try{
			FileInputStream fileRead =  new FileInputStream(System.getProperty("user.dir")+"/config/"+fileName);
			prop = new Properties();
			prop.load(fileRead);
			System.out.println("Reading of config file started");
		}catch(Exception ex){
			System.out.println("Reading of config file failed");
		}
		return prop;
	}
	
	
	
	public void loadConfigurations(String file){
		
	   readConfigurations(file);
	   
	   String port = (String) prop.get("appiumPort");
		int portInteger = Integer.parseInt(port,10);
		
	   config.setappPackage(prop.getProperty("appPackage"));
	   config.setAppActivity(prop.getProperty("appActivity"));
	   config.setDeviceID(prop.getProperty("UDID"));
	   config.setPort(portInteger);
	}
	
	
}