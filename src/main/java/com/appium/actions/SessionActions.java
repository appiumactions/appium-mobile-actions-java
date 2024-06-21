package com.appium.actions;

import com.appium.interfaces.SessionActionsInterface;
import com.appium.platforms.android.AndroidSessionActions;
import com.appium.platforms.ios.IOSSessionActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class SessionActions extends BaseActions {
    private final SessionActionsInterface sessionActions;

    public SessionActions(AppiumDriver driver) {
        super(driver);

        sessionActions = platform.is(Platform.ANDROID)
                ? new AndroidSessionActions()
                : new IOSSessionActions();
    }

    public void terminateApp(String appId) {
        sessionActions.terminateApp(driver, appId);
    }

    public void terminateApp(String appId, int timeout) {
        sessionActions.terminateApp(driver, appId, timeout);
    }

    public void activateApp(String appId) {
        sessionActions.activateApp(driver, appId);
    }

    public boolean isAppInstalled(String appId) {
        return sessionActions.isAppInstalled(driver, appId);
    }

    public boolean removeApp(String appId) {
        return sessionActions.removeApp(driver, appId);
    }

    public boolean removeApp(String appId, int timeout) {
        return sessionActions.removeApp(driver, appId, timeout);
    }

    public boolean removeApp(String appId, boolean keepData) {
        return sessionActions.removeApp(driver, appId, keepData);
    }

    public boolean removeApp(String appId, int timeout, boolean keepData) {
        return sessionActions.removeApp(driver, appId, timeout, keepData);
    }

    public void installApp(String appPath) {
        sessionActions.installApp(driver, appPath);
    }

    public void installApp(String appPath, boolean checkVersion) {
        sessionActions.installApp(driver, appPath, checkVersion);
    }

    public void installApp(String appPath, int timeout) {
        sessionActions.installApp(driver, appPath, timeout);
    }

    public void installApp(String appPath, boolean checkVersion, int timeout) {
        sessionActions.installApp(driver, appPath, checkVersion, timeout);
    }

    public void clearApp(String appId) {
        sessionActions.clearApp(driver, appId);
    }
}
