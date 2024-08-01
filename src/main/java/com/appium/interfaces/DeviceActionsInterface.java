package com.appium.interfaces;

import com.appium.models.BatteryInfoModel;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

public interface DeviceActionsInterface {
    void lock(AppiumDriver driver);
    void lock(AppiumDriver driver, int seconds);
    void unlock(AppiumDriver driver, String key, String type);
    void unlock(AppiumDriver driver, String key, String type, String strategy);
    void unlock(AppiumDriver driver, String key, String type, int timeoutMs);
    void unlock(AppiumDriver driver, String key, String type, String strategy, int timeoutMs);
    boolean isLocked(AppiumDriver driver);
    BatteryInfoModel batteryInfo(AppiumDriver driver);
    Map<String, Object> deviceInfo(AppiumDriver driver);
    void pushFile(AppiumDriver driver, String remotePath, String payload);
}
