package appium.demo;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Helloappium {
	
	@Test
	public void openapplication() throws Exception {
		
		DesiredCapabilities caps = new  DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.0.0");
		caps.setCapability("deviceName", "Nexus6P");
		caps.setCapability("app", "C:\\Users\\HP\\Downloads\\selendroid.apk");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		SearchScreen search = new SearchScreen(driver);
		search.settext("Hello Appium");
		
	}

}
