package com.appium.platforms.android;

import com.appium.interfaces.GestureActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Map;

/**
 * A class that implements the GestureActionsInterface for Android platform.
 * It provides methods to perform tap actions on an Android device using Appium.
 */
public class AndroidGestureActions implements GestureActionsInterface {

    /**
     * Executes a single tap action on the given web element.
     *
     * @param driver     the AppiumDriver instance to interact with the device.
     * @param webElement the WebElement on which the tap action is to be performed.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-clickgesture">UiAutomator2 - clickGesture</a>
     */
    @Override
    public void tap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: clickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId()));
    }

    /**
     * Executes a double tap action on the given web element.
     *
     * @param driver     the AppiumDriver instance to interact with the device.
     * @param webElement the WebElement on which the double tap action is to be performed.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-doubleclickgesture">UiAutomator2 - doubleClickgesture</a>
     */
    @Override
    public void doubleTap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: doubleClickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId()));
    }

    /**
     * Executes a long tap action on the given web element for a specified duration.
     *
     * @param driver     the AppiumDriver instance to interact with the device.
     * @param webElement the WebElement on which the long tap action is to be performed.
     * @param duration   the Duration in seconds for which the long tap action is to be held.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-longclickgesture">UiAutomator2 - longClickGesture</a>
     */
    @Override
    public void longTap(AppiumDriver driver, WebElement webElement, Duration duration) {
        driver.executeScript("mobile: longClickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId(), "duration", duration.getSeconds() * 1000));
    }
}