package com.appium.actions;

import com.appium.arguments.Direction;
import com.appium.interfaces.GestureActionsInterface;
import com.appium.platforms.android.AndroidGestureActions;
import com.appium.platforms.ios.IOSGestureActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

public class GestureActions extends BaseActions {
    @VisibleForTesting
    protected final GestureActionsInterface gestureActionsPlatform;

    public GestureActions(AppiumDriver driver) {
        super(driver);

        gestureActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidGestureActions()
                : new IOSGestureActions();
    }

    public void swipe(Direction direction, double percent) {
        gestureActionsPlatform.swipe(driver, direction, percent);
    }

    public void swipe(Direction direction, double percent, WebElement webElement) {
        gestureActionsPlatform.swipe(driver, direction, percent, webElement);
    }

    public void swipe(Direction direction, double percent, int speed) {
        gestureActionsPlatform.swipe(driver, direction, percent, speed);
    }

    public void swipe(Direction direction, double percent, int speed, WebElement webElement) {
        gestureActionsPlatform.swipe(driver, direction, percent, speed, webElement);
    }

    public void scroll(Direction direction, double percent) {
        gestureActionsPlatform.scroll(driver, direction, percent);
    }

    public void scroll(Direction direction, double percent, WebElement webElement) {
        gestureActionsPlatform.scroll(driver, direction, percent, webElement);
    }
}
