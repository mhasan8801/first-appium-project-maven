package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionUsingOptions {

    public static void main(String[] args) throws MalformedURLException {

        //Path apk yang akan diuji
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator +
                "resources" + File.separator + "ApiDemos-debug.apk" ;

        //Setup options for create driver sessions and desire capabilies
        UiAutomator2Options options = new UiAutomator2Options().
//                setDeviceName("pixel_3a").
                setUdid("emulator-5554").
                setAutomationName("UiAutomator2").
                setApp(appUrl);

        //URL Appium server yang akan digunakan untuk menjalankan test
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        //Inisialisasi AppiumDriver untuk Android
        AppiumDriver driver = new AndroidDriver(url,options);
    }

}
