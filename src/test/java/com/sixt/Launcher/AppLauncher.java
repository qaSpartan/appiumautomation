package com.sixt.Launcher;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppLauncher{
	private AndroidDriver<MobileElement> androidDriver;
	private AppiumDriverLocalService service;
	
	
	public AndroidDriver<MobileElement> launchAndroidAppiumService(int port, String udid) throws Exception{
		
							service = AppiumDriverLocalService
			
					        .buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
							.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
							.withIPAddress("0.0.0.0").usingPort(port).withLogFile(new File("/tmp/AppiumLogs.txt")));
			
			service.start();
			Thread.sleep(1000);
			
			
//			File appAPK = new File(System.getProperty("user.dir")+"/apps/android/");
			
			DesiredCapabilities capability = new DesiredCapabilities();
			capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			capability.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidDevice");
			capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 40);
//			capability.setCapability(MobileCapabilityType.FULL_RESET, true);
			capability.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			capability.setCapability("appActivity","com.amazon.mShop.home.HomeActivity");
			capability.setCapability("clearSystemFiles", "true");
			capability.setCapability(MobileCapabilityType.UDID, udid);
			androidDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:"+port+"/wd/hub"), capability);
			androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			if (androidDriver.isLocked())
			{
				androidDriver.unlockDevice();
			}
			return androidDriver;
		}
				
	
	
	
}