package com.appium.platforms.ios;

import com.appium.interfaces.SessionActionsInterface;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

public class IOSSessionActions implements SessionActionsInterface {
    @Override
    public void terminateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: terminateApp", Map.of("bundleId", appId));
    }

    @Override
    public void terminateApp(AppiumDriver driver, String appId, int timeout) {
        driver.executeScript("mobile: terminateApp", Map.of("bundleId", appId));
    }

    @Override
    public void activateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: activateApp", Map.of("bundleId", appId));
    }

    @Override
    public boolean isAppInstalled(AppiumDriver driver, String appId) {
        return (boolean) driver.executeScript("mobile: isAppInstalled", Map.of("bundleId", appId));
    }

    @Override
    public boolean removeApp(AppiumDriver driver, String appId) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("bundleId", appId));
    }

    @Override
    public boolean removeApp(AppiumDriver driver, String appId, int timeout) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("bundleId", appId));
    }

    @Override
    public boolean removeApp(AppiumDriver driver, String appId, boolean keepData) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("bundleId", appId));
    }

    @Override
    public boolean removeApp(AppiumDriver driver, String appId, int timeout, boolean keepData) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("bundleId", appId));
    }

    @Override
    public void installApp(AppiumDriver driver, String appPath) {
        driver.executeScript("mobile: installApp", Map.of("app", appPath));
    }

    @Override
    public void installApp(AppiumDriver driver, String appPath, boolean checkVersion) {
        driver.executeScript("mobile: installApp", Map.of("app", appPath, "checkVersion", checkVersion));
    }

    @Override
    public void installApp(AppiumDriver driver, String appPath, int timeout) {
        driver.executeScript("mobile: installApp", Map.of("app", appPath, "timeoutMs", timeout));
    }

    @Override
    public void installApp(AppiumDriver driver, String appPath, boolean checkVersion, int timeout) {
        driver.executeScript("mobile: installApp", Map.of("app", appPath, "checkVersion", checkVersion, "timeoutMs", timeout));
    }

    @Override
    public void clearApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: clearApp", Map.of("bundleId", appId));
    }
}
