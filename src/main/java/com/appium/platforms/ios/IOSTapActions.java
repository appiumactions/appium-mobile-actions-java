package com.appium.platforms.ios;

import com.appium.interfaces.TapActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Map;

/**
 * A class that implements the TapActionsInterface for iOS platform.
 * It provides methods to perform tap actions on an iOS device using Appium.
 */
public class IOSTapActions implements TapActionsInterface {

    /**
     * Executes a single tap action on the given web element.
     *
     * @param driver     the AppiumDriver instance to interact with the device.
     * @param webElement the WebElement on which the tap action is to be performed.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-tap">XCUITest - tap</a>
     */
    @Override
    public void tap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: tap", Map.of("x", webElement.getLocation().getX(), "y", webElement.getLocation().getY()));
    }

    /**
     * Executes a single tap action on the given coordinates.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param x      the x-coordinate on the screen where the tap action is to be performed.
     * @param y      the y-coordinate on the screen where the tap action is to be performed.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-tap">XCUITest - tap</a>
     */
    @Override
    public void tap(AppiumDriver driver, int x, int y) {
        driver.executeScript("mobile: tap", Map.of("x", x, "y", y));
    }

    /**
     * Executes a double tap action on the given web element.
     *
     * @param driver     the AppiumDriver instance to interact with the device.
     * @param webElement the WebElement on which the double tap action is to be performed.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-doubletap">XCUITest - doubleTap</a>
     */
    @Override
    public void doubleTap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: doubleTap", Map.of("elementId", ((RemoteWebElement) webElement).getId()));
    }

    /**
     * Executes a double tap action on the given coordinates.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param x      the x-coordinate on the screen where the double tap action is to be performed.
     * @param y      the y-coordinate on the screen where the double tap action is to be performed.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-doubletap">XCUITest - doubleTap</a>
     */
    @Override
    public void doubleTap(AppiumDriver driver, int x, int y) {
        driver.executeScript("mobile: doubleTap", Map.of("x", x, "y", y));
    }

    /**
     * Executes a long tap action on the given web element for a specified duration.
     *
     * @param driver     the AppiumDriver instance to interact with the device.
     * @param webElement the WebElement on which the long tap action is to be performed.
     * @param duration   the Duration in seconds for which the long tap action is to be held.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-touchandhold">XCUITest - touchAndHold</a>
     */
    @Override
    public void longTap(AppiumDriver driver, WebElement webElement, Duration duration) {
        driver.executeScript("mobile: touchAndHold", Map.of("elementId", ((RemoteWebElement) webElement).getId(), "duration", duration.getSeconds()));
    }

    /**
     * Executes a long tap action on the given coordinates for a specified duration.
     *
     * @param driver   the AppiumDriver instance to interact with the device.
     * @param x        the x-coordinate on the screen where the long tap action is to be performed.
     * @param y        the y-coordinate on the screen where the long tap action is to be performed.
     * @param duration the Duration in seconds for which the long tap action is to be held.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-touchandhold">XCUITest - touchAndHold</a>
     */
    @Override
    public void longTap(AppiumDriver driver, int x, int y, Duration duration) {
        driver.executeScript("mobile: touchAndHold", Map.of("x", x, "y", y, "duration", duration.getSeconds()));
    }
}