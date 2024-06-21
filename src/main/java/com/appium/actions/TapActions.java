package com.appium.actions;

import com.appium.interfaces.TapActionsInterface;
import com.appium.platforms.android.AndroidTapActions;
import com.appium.platforms.ios.IOSTapActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TapActions extends BaseActions {
    private final TapActionsInterface tapActions;

    public TapActions(AppiumDriver driver) {
        super(driver);

        tapActions = platform.is(Platform.ANDROID)
                ? new AndroidTapActions()
                : new IOSTapActions();
    }

    public void tap(WebElement webElement) {
        tapActions.tap(driver, webElement);
    }

    public void doubleTap(WebElement webElement) {
        tapActions.doubleTap(driver, webElement);
    }

    public void longTap(WebElement webElement, Duration duration) {
        tapActions.longTap(driver, webElement, duration);
    }
}
