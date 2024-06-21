package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public interface ActionsTapInterface {
    void tap(AppiumDriver driver, WebElement webElement);
    void doubleTap(AppiumDriver driver, WebElement webElement);
    void longTap(AppiumDriver driver, WebElement webElement, Duration duration);
}
