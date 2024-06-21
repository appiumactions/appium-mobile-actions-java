package com.appium.actions;

import com.appium.enums.Direction;
import com.appium.interfaces.ActionsScrollInterface;
import com.appium.platforms.android.AndroidScrollActions;
import com.appium.platforms.ios.IOSScrollActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

public class ScrollActions extends BaseActions {
    private final ActionsScrollInterface actionsScrollStrategy;

    public ScrollActions(AppiumDriver driver) {
        super(driver);

        actionsScrollStrategy = platform.is(Platform.ANDROID)
                ? new AndroidScrollActions()
                : new IOSScrollActions();
    }

    public void swipe(WebElement webElement, Direction direction) {
        actionsScrollStrategy.swipe(driver, webElement, direction);
    }
    public void scroll(Direction direction, int topAreaDiscount, int bottomAreaDiscount) {
        actionsScrollStrategy.scroll(driver, direction, topAreaDiscount, bottomAreaDiscount);
    }
}
