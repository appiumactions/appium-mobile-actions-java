package com.appium.actions;

import com.appium.exceptions.PlatformException;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class BaseActions {
    protected final AppiumDriver driver;
    protected final Platform platform;

    public BaseActions(AppiumDriver driver) {
        validatePlatform(driver);

        this.driver = driver;
        this.platform = driver.getCapabilities().getPlatformName();
    }

    private static void validatePlatform(AppiumDriver driver) {
        if (!driver.getCapabilities().getPlatformName().is(Platform.IOS) || !driver.getCapabilities().getPlatformName().is(Platform.ANDROID)) {
            throw new PlatformException("This platform is not supported: " + driver.getCapabilities().getPlatformName().name());
        }
    }
}
