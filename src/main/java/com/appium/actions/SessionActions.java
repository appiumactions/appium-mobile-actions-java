package com.appium.actions;

import com.appium.interfaces.ActionsSessionInterface;
import com.appium.platforms.android.AndroidSessionActions;
import com.appium.platforms.ios.IOSSessionActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class SessionActions extends BaseActions {
    private final ActionsSessionInterface actionsSessionStrategy;

    public SessionActions(AppiumDriver driver) {
        super(driver);

        actionsSessionStrategy = platform.is(Platform.ANDROID)
                ? new AndroidSessionActions()
                : new IOSSessionActions();
    }

    public void terminateApp(String appId) {
        actionsSessionStrategy.terminateApp(driver, appId);
    }

    public void terminateApp(String appId, int timeout) {
        actionsSessionStrategy.terminateApp(driver, appId, timeout);
    }

    public void activateApp(String appId) {
        actionsSessionStrategy.activateApp(driver, appId);
    }

    public boolean isAppInstalled(String appId) {
        return actionsSessionStrategy.isAppInstalled(driver, appId);
    }

    public boolean removeApp(String appId) {
        return actionsSessionStrategy.removeApp(driver, appId);
    }

    public boolean removeApp(String appId, int timeout) {
        return actionsSessionStrategy.removeApp(driver, appId, timeout);
    }

    public boolean removeApp(String appId, boolean keepData) {
        return actionsSessionStrategy.removeApp(driver, appId, keepData);
    }

    public boolean removeApp(String appId, int timeout, boolean keepData) {
        return actionsSessionStrategy.removeApp(driver, appId, timeout, keepData);
    }

    public void installApp(String appPath) {
        actionsSessionStrategy.installApp(driver, appPath);
    }

    public void installApp(String appPath, boolean checkVersion) {
        actionsSessionStrategy.installApp(driver, appPath, checkVersion);
    }

    public void installApp(String appPath, int timeout) {
        actionsSessionStrategy.installApp(driver, appPath, timeout);
    }

    public void installApp(String appPath, boolean checkVersion, int timeout) {
        actionsSessionStrategy.installApp(driver, appPath, checkVersion, timeout);
    }

    public void clearApp(String appId) {
        actionsSessionStrategy.clearApp(driver, appId);
    }
}
