package com.appium.actions;

import com.appium.arguments.Direction;
import com.appium.interfaces.ScrollActionsInterface;
import com.appium.platforms.android.AndroidScrollActions;
import com.appium.platforms.ios.IOSScrollActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

public class ScrollActions extends BaseActions {
    @VisibleForTesting
    protected final ScrollActionsInterface scrollActionsPlatform;

    public ScrollActions(AppiumDriver driver) {
        super(driver);

        scrollActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidScrollActions()
                : new IOSScrollActions();
    }

    public void swipe(Direction direction, double percent) {
        scrollActionsPlatform.swipe(driver, direction, percent);
    }

    public void swipe(Direction direction, double percent, WebElement webElement) {
        scrollActionsPlatform.swipe(driver, direction, percent, webElement);
    }

    public void scroll(Direction direction, double percent) {
        scrollActionsPlatform.scroll(driver, direction, percent);
    }

    public void scroll(Direction direction, double percent, WebElement webElement) {
        scrollActionsPlatform.scroll(driver, direction, percent, webElement);
    }
}
