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

    public void activateApp(String appId) {
        actionsSessionStrategy.activateApp(driver, appId);
    }

    public boolean isAppInstalled(String appId) {
        return actionsSessionStrategy.isAppInstalled(driver, appId);
    }
}
