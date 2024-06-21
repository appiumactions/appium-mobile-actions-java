package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;

public interface DeviceActionsInterface {
    void lock(AppiumDriver driver);
    void lock(AppiumDriver driver, int seconds);
    void unlock(AppiumDriver driver, String key, String type);
    void unlock(AppiumDriver driver, String key, String type, String strategy);
    void unlock(AppiumDriver driver, String key, String type, int timeoutMs);
    void unlock(AppiumDriver driver, String key, String type, String strategy, int timeoutMs);
    boolean isLocked(AppiumDriver driver);
}
