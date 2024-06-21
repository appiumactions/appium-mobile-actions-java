package com.appium.actions;

import com.appium.interfaces.ActionsTapInterface;
import com.appium.platforms.android.AndroidTapActions;
import com.appium.platforms.ios.IOSTapActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TapActions extends BaseActions {
    private final ActionsTapInterface actionsTapStrategy;

    public TapActions(AppiumDriver driver) {
        super(driver);

        actionsTapStrategy = platform.is(Platform.ANDROID)
                ? new AndroidTapActions()
                : new IOSTapActions();
    }

    public void tap(WebElement webElement) {
        actionsTapStrategy.tap(driver, webElement);
    }

    public void doubleTap(WebElement webElement) {
        actionsTapStrategy.doubleTap(driver, webElement);
    }

    public void longTap(WebElement webElement, Duration duration) {
        actionsTapStrategy.longTap(driver, webElement, duration);
    }
}
