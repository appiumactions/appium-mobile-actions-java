package com.appium.platforms.android;

import com.appium.arguments.Direction;
import com.appium.interfaces.GestureActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Map;

/**
 * Provides Android-specific implementations for scroll and swipe actions.
 * This class implements the {@link GestureActionsInterface} to provide methods
 * driver.executeScript method with mobile-specific gestures.
 */
public class AndroidGestureActions implements GestureActionsInterface {
    /**
     * Performs a swipe gesture in the specified direction covering a certain percentage of the screen.
     *
     * @param driver    The AppiumDriver instance used to perform the gesture.
     * @param direction The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent   The percentage of the screen the swipe should cover.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-swipegesture">UiAutomator2 - swipeGesture</a>
     */
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent) {
        driver.executeScript("mobile: swipeGesture", Map.of("direction", direction.name().toLowerCase(), "percent", percent));
    }

    /**
     * Performs a swipe gesture on a specific element in the specified direction covering a certain percentage of the screen.
     *
     * @param driver     The AppiumDriver instance used to perform the gesture.
     * @param direction  The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent    The percentage of the screen the swipe should cover.
     * @param webElement The WebElement on which the swipe gesture should be performed.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-swipegesture">UiAutomator2 - swipeGesture</a>
     */
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: swipeGesture", Map.of("direction", direction.name().toLowerCase(), "percent", percent, "elementId", ((RemoteWebElement) webElement).getId()));
    }

    /**
     * Performs a swipe gesture in the specified direction covering a certain percentage of the screen with a specific speed.
     *
     * @param driver    The AppiumDriver instance used to perform the gesture.
     * @param direction The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent   The percentage of the screen the swipe should cover.
     * @param speed     The speed of the swipe gesture.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-swipegesture">UiAutomator2 - swipeGesture</a>
     */
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent, int speed) {
        driver.executeScript("mobile: swipeGesture", Map.of("direction", direction.name().toLowerCase(), "percent", percent, "speed", speed));
    }

    /**
     * Performs a swipe gesture on a specific element in the specified direction covering a certain percentage of the screen with a specific speed.
     *
     * @param driver     The AppiumDriver instance used to perform the gesture.
     * @param direction  The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent    The percentage of the screen the swipe should cover.
     * @param speed      The speed of the swipe gesture.
     * @param webElement The WebElement on which the swipe gesture should be performed.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-swipegesture">UiAutomator2 - swipeGesture</a>
     */
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent, int speed, WebElement webElement) {
        driver.executeScript("mobile: swipeGesture", Map.of("direction", direction.name().toLowerCase(), "percent", percent, "speed", speed, "elementId", ((RemoteWebElement) webElement).getId()));
    }

    /**
     * Performs a scroll gesture in the specified direction covering a certain percentage of the screen.
     *
     * @param driver    The AppiumDriver instance used to perform the gesture.
     * @param direction The direction of the scroll (UP, DOWN, LEFT, RIGHT).
     * @param percent   The percentage of the screen the scroll should cover.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-scrollgesture">UiAutomator2 - scrollGesture</a>
     */
    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent) {
        driver.executeScript("mobile: scrollGesture", Map.of("direction", direction.name().toLowerCase(), "percent", percent));
    }

    /**
     * Performs a scroll gesture on a specific element in the specified direction covering a certain percentage of the screen.
     *
     * @param driver     The AppiumDriver instance used to perform the gesture.
     * @param direction  The direction of the scroll (UP, DOWN, LEFT, RIGHT).
     * @param percent    The percentage of the screen the scroll should cover.
     * @param webElement The WebElement on which the scroll gesture should be performed.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-scrollgesture">UiAutomator2 - scrollGesture</a>
     */
    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: scrollGesture", Map.of("direction", direction.name().toLowerCase(), "elementId", ((RemoteWebElement) webElement).getId(), "percent", percent));
    }
}
