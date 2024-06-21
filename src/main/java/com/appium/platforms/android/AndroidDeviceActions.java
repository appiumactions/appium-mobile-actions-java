package com.appium.platforms.android;

import com.appium.interfaces.DeviceActionsInterface;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

public class AndroidDeviceActions implements DeviceActionsInterface {
    @Override
    public void lock(AppiumDriver driver) {
        driver.executeScript("mobile: lock");
    }

    @Override
    public void lock(AppiumDriver driver, int seconds) {
        driver.executeScript("mobile: lock", Map.of("seconds", seconds));
    }

    @Override
    public void unlock(AppiumDriver driver, String key, String type) {
        driver.executeScript("mobile: unlock", Map.of("key", key, "type", type));
    }

    @Override
    public void unlock(AppiumDriver driver, String key, String type, String strategy) {
        driver.executeScript("mobile: unlock", Map.of("key", key, "type", type, "strategy", strategy));
    }

    @Override
    public void unlock(AppiumDriver driver, String key, String type, int timeoutMs) {
        driver.executeScript("mobile: unlock", Map.of("key", key, "type", type, "timeoutMs", timeoutMs));
    }

    @Override
    public void unlock(AppiumDriver driver, String key, String type, String strategy, int timeoutMs) {
        driver.executeScript("mobile: unlock", Map.of("key", key, "type", type, "strategy", strategy, "timeoutMs", timeoutMs));
    }
}
