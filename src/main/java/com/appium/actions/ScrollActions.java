package com.appium.actions;

import com.appium.arguments.Direction;
import com.appium.interfaces.ScrollActionsInterface;
import com.appium.platforms.android.AndroidScrollActions;
import com.appium.platforms.ios.IOSScrollActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

public class ScrollActions extends BaseActions {
    private final ScrollActionsInterface scrollActions;

    public ScrollActions(AppiumDriver driver) {
        super(driver);

        scrollActions = platform.is(Platform.ANDROID)
                ? new AndroidScrollActions()
                : new IOSScrollActions();
    }

    public void swipe(Direction direction, double percent) {
        scrollActions.swipe(driver, direction, percent);
    }

    public void swipe(Direction direction, double percent, WebElement webElement) {
        scrollActions.swipe(driver, direction, percent, webElement);
    }

    public void scroll(Direction direction, double percent) {
        scrollActions.scroll(driver, direction, percent);
    }

    public void scroll(Direction direction, double percent, WebElement webElement) {
        scrollActions.scroll(driver, direction, percent, webElement);
    }
}
