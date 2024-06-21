package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;

public interface ActionsSessionInterface {
    void terminateApp(AppiumDriver driver, String appId);
    void activateApp(AppiumDriver driver, String appId);
    boolean isAppInstalled(AppiumDriver driver, String appId);
}
