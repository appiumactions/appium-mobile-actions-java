package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;

public interface SessionActionsInterface {
    void terminateApp(AppiumDriver driver, String appId);
    void terminateApp(AppiumDriver driver, String appId, int timeout);
    void activateApp(AppiumDriver driver, String appId);
    boolean isAppInstalled(AppiumDriver driver, String appId);
    boolean removeApp(AppiumDriver driver, String appId);
    boolean removeApp(AppiumDriver driver, String appId, int timeout);
    boolean removeApp(AppiumDriver driver, String appId, boolean keepData);
    boolean removeApp(AppiumDriver driver, String appId, int timeout, boolean keepData);
    void installApp(AppiumDriver driver, String appPath);
    void installApp(AppiumDriver driver, String appPath, boolean checkVersion);
    void installApp(AppiumDriver driver, String appPath, int timeout);
    void installApp(AppiumDriver driver, String appPath, boolean checkVersion, int timeout);
    void clearApp(AppiumDriver driver, String appId);
    void acceptAlert(AppiumDriver driver);
    void acceptAlert(AppiumDriver driver, String buttonLabel);
    void dismissAlert(AppiumDriver driver);
    void dismissAlert(AppiumDriver driver, String buttonLabel);
}
