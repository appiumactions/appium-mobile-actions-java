package com.appium.actions.actions;

import com.appium.actions.enums.Direction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public interface ActionsStrategy {
    void tap(AppiumDriver driver, WebElement webElement);
    void doubleTap(AppiumDriver driver, WebElement webElement);
    void longTap(AppiumDriver driver, WebElement webElement, Duration duration);
    void swipe(AppiumDriver driver, WebElement webElement, Direction direction);
    void scroll(AppiumDriver driver, Direction direction, int topAreaDiscount, int bottomAreaDiscount);
}
