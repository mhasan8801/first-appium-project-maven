package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class StartDriver {

    public StartDriver() {
    }

    public static void main(String[] args) throws MalformedURLException {

        //Setup DesiredCapabilities untuk konfigurasi perangkat dan aplikasi
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","pixel_3a");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("udid","emulator-5554");
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator +
                "resources" + File.separator + "ApiDemos-debug.apk" ;
        caps.setCapability("app", appUrl);

        //URL Appium server yang akan digunakan untuk menjalankan test
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        //Inisialisasi AppiumDriver untuk Android
        AppiumDriver driver = new AndroidDriver(url,caps);

    }

}
