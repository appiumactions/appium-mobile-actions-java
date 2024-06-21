package com.appium.actions;

import com.appium.interfaces.DeviceActionsInterface;
import com.appium.platforms.android.AndroidDeviceActions;
import com.appium.platforms.ios.IOSDeviceActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class DeviceActions extends BaseActions {
    private final DeviceActionsInterface deviceActions;

    public DeviceActions(AppiumDriver driver) {
        super(driver);

        deviceActions = platform.is(Platform.ANDROID)
                ? new AndroidDeviceActions()
                : new IOSDeviceActions();
    }

    public void lock() {
        deviceActions.lock(driver);
    }

    public void lock(int seconds) {
        deviceActions.lock(driver, seconds);
    }

    public void unlock(String key, String type) {
        deviceActions.unlock(driver, key, type);
    }

    public void unlock(String key, String type, String strategy) {
        deviceActions.unlock(driver, key, type, strategy);
    }

    public void unlock(String key, String type, int timeoutMs) {
        deviceActions.unlock(driver, key, type, timeoutMs);
    }

    public void unlock(String key, String type, String strategy, int timeoutMs) {
        deviceActions.unlock(driver, key, type, strategy, timeoutMs);
    }

    public boolean isLocked() {
        return deviceActions.isLocked(driver);
    }
}
