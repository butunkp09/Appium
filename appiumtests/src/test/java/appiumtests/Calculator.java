package appiumtests;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Calculator {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			openCalculator();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap= new DesiredCapabilities();
	    cap.setCapability("deviceName", "motorola one power");
	    cap.setCapability("udid", "ZF6223QBKD");
	    cap.setCapability("platformName", "Android");
	    cap.setCapability("platformVersion", "9");
	    cap.setCapability("appPackage", "com.google.android.calculator");
	    cap.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivity");
	    URL url= new URL("http://127.0.0.1:4723/wd/hub");
	    System.out.println("Application Started.......");
	    
	    driver=new AppiumDriver<MobileElement>(url,cap);
	    System.out.println("Application Started 1.......");
	}

}
