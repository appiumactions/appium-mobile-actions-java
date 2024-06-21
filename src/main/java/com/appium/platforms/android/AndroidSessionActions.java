package com.appium.platforms.android;

import com.appium.interfaces.ActionsSessionInterface;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

public class AndroidSessionActions implements ActionsSessionInterface {
    @Override
    public void terminateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: terminateApp", Map.of("appId", appId));
    }

    @Override
    public void activateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: activateApp", Map.of("appId", appId));
    }
}
