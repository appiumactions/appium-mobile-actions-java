package com.appium.platforms.android;

import com.appium.interfaces.TapActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Map;

public class AndroidTapActions implements TapActionsInterface {
    @Override
    public void tap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: clickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId()));
    }

    @Override
    public void doubleTap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: doubleClickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId()));
    }

    @Override
    public void longTap(AppiumDriver driver, WebElement webElement, Duration duration) {
        driver.executeScript("mobile: longClickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId(), "duration", duration.getSeconds() * 1000));
    }
}
