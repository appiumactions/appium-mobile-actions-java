package com.appium.platforms.ios;

import com.appium.interfaces.ActionsSessionInterface;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

public class IOSSessionActions implements ActionsSessionInterface {
    @Override
    public void terminateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: terminateApp", Map.of("bundleId", appId));
    }

    @Override
    public void activateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: activateApp", Map.of("bundleId", appId));
    }
}
