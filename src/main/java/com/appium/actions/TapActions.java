package com.appium.actions;

import com.appium.interfaces.TapActionsInterface;
import com.appium.platforms.android.AndroidTapActions;
import com.appium.platforms.ios.IOSTapActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TapActions extends BaseActions {
    @VisibleForTesting
    protected final TapActionsInterface tapActionsPlatform;

    public TapActions(AppiumDriver driver) {
        super(driver);

        tapActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidTapActions()
                : new IOSTapActions();
    }

    public void tap(WebElement webElement) {
        tapActionsPlatform.tap(driver, webElement);
    }

    public void doubleTap(WebElement webElement) {
        tapActionsPlatform.doubleTap(driver, webElement);
    }

    public void longTap(WebElement webElement, Duration duration) {
        tapActionsPlatform.longTap(driver, webElement, duration);
    }
}
