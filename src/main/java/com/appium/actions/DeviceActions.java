package com.appium.actions;

import com.appium.interfaces.DeviceActionsInterface;
import com.appium.platforms.android.AndroidDeviceActions;
import com.appium.platforms.ios.IOSDeviceActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class DeviceActions extends BaseActions {
    @VisibleForTesting
    protected final DeviceActionsInterface deviceActionsPlatform;

    public DeviceActions(AppiumDriver driver) {
        super(driver);

        deviceActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidDeviceActions()
                : new IOSDeviceActions();
    }

    public void lock() {
        deviceActionsPlatform.lock(driver);
    }

    public void lock(int seconds) {
        deviceActionsPlatform.lock(driver, seconds);
    }

    public void unlock(String key, String type) {
        deviceActionsPlatform.unlock(driver, key, type);
    }

    public void unlock(String key, String type, String strategy) {
        deviceActionsPlatform.unlock(driver, key, type, strategy);
    }

    public void unlock(String key, String type, int timeoutMs) {
        deviceActionsPlatform.unlock(driver, key, type, timeoutMs);
    }

    public void unlock(String key, String type, String strategy, int timeoutMs) {
        deviceActionsPlatform.unlock(driver, key, type, strategy, timeoutMs);
    }

    public boolean isLocked() {
        return deviceActionsPlatform.isLocked(driver);
    }
}
