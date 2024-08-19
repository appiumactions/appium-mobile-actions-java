package com.appium.interfaces;

import com.appium.models.BatteryInfoModel;
import io.appium.java_client.AppiumDriver;

import java.util.List;
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
    String pullFile(AppiumDriver driver, String remotePath);
    String pullFolder(AppiumDriver driver, String remotePath);
    void deleteFile(AppiumDriver driver, String remotePath);
    void setConnectivity(AppiumDriver driver, boolean wifi, boolean data, boolean airplaneMode);
    Map<String, Object> getConnectivity(AppiumDriver driver);
    Map<String, Object> getConnectivity(AppiumDriver driver, String service);
    Map<String, Object> getConnectivity(AppiumDriver driver, List<String> services);
}
