package com.appium.actions;

import com.appium.interfaces.SessionActionsInterface;
import com.appium.platforms.android.AndroidSessionActions;
import com.appium.platforms.ios.IOSSessionActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class SessionActions extends BaseActions {
    @VisibleForTesting
    protected final SessionActionsInterface sessionActionsPlatform;

    public SessionActions(AppiumDriver driver) {
        super(driver);

        sessionActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidSessionActions()
                : new IOSSessionActions();
    }

    public void terminateApp(String appId) {
        sessionActionsPlatform.terminateApp(driver, appId);
    }

    public void terminateApp(String appId, int timeout) {
        sessionActionsPlatform.terminateApp(driver, appId, timeout);
    }

    public void activateApp(String appId) {
        sessionActionsPlatform.activateApp(driver, appId);
    }

    public boolean isAppInstalled(String appId) {
        return sessionActionsPlatform.isAppInstalled(driver, appId);
    }

    public boolean removeApp(String appId) {
        return sessionActionsPlatform.removeApp(driver, appId);
    }

    public boolean removeApp(String appId, int timeout) {
        return sessionActionsPlatform.removeApp(driver, appId, timeout);
    }

    public boolean removeApp(String appId, boolean keepData) {
        return sessionActionsPlatform.removeApp(driver, appId, keepData);
    }

    public boolean removeApp(String appId, int timeout, boolean keepData) {
        return sessionActionsPlatform.removeApp(driver, appId, timeout, keepData);
    }

    public void installApp(String appPath) {
        sessionActionsPlatform.installApp(driver, appPath);
    }

    public void installApp(String appPath, boolean checkVersion) {
        sessionActionsPlatform.installApp(driver, appPath, checkVersion);
    }

    public void installApp(String appPath, int timeout) {
        sessionActionsPlatform.installApp(driver, appPath, timeout);
    }

    public void installApp(String appPath, boolean checkVersion, int timeout) {
        sessionActionsPlatform.installApp(driver, appPath, checkVersion, timeout);
    }

    public void clearApp(String appId) {
        sessionActionsPlatform.clearApp(driver, appId);
    }
}
