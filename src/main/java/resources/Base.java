package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
//This class is a reusable class on which we can place all the reusable properties which
//are useful for the testcases
public class Base {
	public static AppiumDriverLocalService service;
//By this method we start the appium server
	public static AppiumDriverLocalService startServer() {
		service=AppiumDriverLocalService.buildDefaultService();
	    service.start();
	    return service;
	}
//This method is a reusable method through which application invokation, setting up of capabilities, provision
//of port for the appium server	all will be done
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {
		// TODO Auto-generated method stub
		
		  FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\globalVariables.properties");
		  Properties prop=new Properties();
		  prop.load(fis);
		  File appDir=new File("src/main/java");
		  File app=new File(appDir,(String) prop.get(appName));
		  String deviceName=prop.getProperty("device");
		  DesiredCapabilities dc=new DesiredCapabilities();
		  dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		  dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");
		  dc.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		  dc.setCapability("autoGrantPermissions", "true");
		  AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	      return driver;	
	}

}
