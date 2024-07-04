package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public interface TapActionsInterface {
    void tap(AppiumDriver driver, WebElement webElement);
    void tap(AppiumDriver driver, int x, int y);
    void doubleTap(AppiumDriver driver, WebElement webElement);
    void doubleTap(AppiumDriver driver, int x, int y);
    void longTap(AppiumDriver driver, WebElement webElement, Duration duration);
    void longTap(AppiumDriver driver, int x, int y, Duration duration);
}
