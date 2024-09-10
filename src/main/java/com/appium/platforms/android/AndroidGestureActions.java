package com.appium.platforms.android;

import com.appium.arguments.Direction;
import com.appium.interfaces.GestureActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Map;

/**
 * Provides Android-specific implementations for scroll and swipe actions.
 * This class implements the {@see GestureActionsInterface} to provide methods
 * driver.executeScript method with mobile-specific gestures.
 */
public class AndroidGestureActions implements GestureActionsInterface {
    /**
     * Performs a swipe gesture in the specified direction covering a certain percentage of the screen.
     *
     * @param driver    The AppiumDriver instance used to perform the gesture.
     * @param direction The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent   The percentage of the screen the swipe should cover.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-swipegesture">UiAutomator2 - swipeGesture</a>
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
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-swipegesture">UiAutomator2 - swipeGesture</a>
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
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-swipegesture">UiAutomator2 - swipeGesture</a>
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
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-swipegesture">UiAutomator2 - swipeGesture</a>
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
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-scrollgesture">UiAutomator2 - scrollGesture</a>
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
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-scrollgesture">UiAutomator2 - scrollGesture</a>
     */
    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: scrollGesture", Map.of("direction", direction.name().toLowerCase(), "elementId", ((RemoteWebElement) webElement).getId(), "percent", percent));
    }

    /**
     * Performs a scroll gesture in the specified direction covering a certain percentage of the screen.
     *
     * @param driver    The AppiumDriver instance used to perform the gesture.
     * @param direction The direction of the scroll (UP, DOWN, LEFT, RIGHT).
     * @param percent   The percentage of the screen the scroll should cover.
     * @param left      The left coordinate of the scroll bounding area
     * @param top       The top coordinate of the scroll bounding area
     * @param width     The width of the scroll bounding area
     * @param height    The height of the scroll bounding area
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-scrollgesture">UiAutomator2 - scrollGesture</a>
     */
    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent, int left, int top, int width, int height) {
        driver.executeScript("mobile: scrollGesture", Map.of("direction", direction.name().toLowerCase(), "percent", percent, "left", left, "top", top, "width", width, "height", height));
    }

    /**
     * Performs a pinch open gesture on the screen.
     *
     * @param driver The AppiumDriver instance used to perform the gesture.
     * @param scale  The size of the pinch as a percentage of the pinch area size. Valid values must be float numbers in range 0..1, where 1.0 is 100%.
     * @param speed  The speed at which to perform this gesture in pixels per second. The value must not be negative.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-pinchopengesture">UiAutomator2 - pinchOpenGesture</a>
     */
    @Override
    public void pinchOpen(AppiumDriver driver, double scale, double speed) {
        driver.executeScript("mobile: pinchOpenGesture", Map.of("percent", scale, "speed", speed));
    }

    /**
     * Performs a pinch open gesture on a specific element.
     *
     * @param driver     The AppiumDriver instance used to perform the gesture.
     * @param scale      The size of the pinch as a percentage of the pinch area size. Valid values must be float numbers in range 0..1, where 1.0 is 100%.
     * @param speed      The speed at which to perform this gesture in pixels per second. The value must not be negative.
     * @param webElement The id of the element to be pinched. If the element id is missing then pinch bounding area must be provided. If both the element id and the pinch bounding area are provided then the area is effectively ignored.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-pinchopengesture">UiAutomator2 - pinchOpenGesture</a>
     */
    @Override
    public void pinchOpen(AppiumDriver driver, double scale, double speed, WebElement webElement) {
        driver.executeScript("mobile: pinchOpenGesture", Map.of("percent", scale, "speed", speed, "elementId", ((RemoteWebElement) webElement).getId()));
    }

    /**
     * Performs a pinch close gesture on the screen.
     *
     * @param driver The AppiumDriver instance used to perform the gesture.
     * @param scale  The size of the pinch as a percentage of the pinch area size. Valid values must be float numbers in range 0..1, where 1.0 is 100%.
     * @param speed  The speed at which to perform this gesture in pixels per second. The value must not be negative.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-pinchclosegesture">UiAutomator2 - pinchCloseGesture</a>
     */
    @Override
    public void pinchClose(AppiumDriver driver, double scale, double speed) {
        driver.executeScript("mobile: pinchCloseGesture", Map.of("percent", scale, "speed", speed));
    }

    /**
     * Performs a pinch close gesture on a specific element.
     *
     * @param driver     The AppiumDriver instance used to perform the gesture.
     * @param scale      The size of the pinch as a percentage of the pinch area size. Valid values must be float numbers in range 0..1, where 1.0 is 100%.
     * @param speed      The speed at which to perform this gesture in pixels per second. The value must not be negative.
     * @param webElement The id of the element to be pinched. If the element id is missing then pinch bounding area must be provided. If both the element id and the pinch bounding area are provided then the area is effectively ignored.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-pinchclosegesture">UiAutomator2 - pinchCloseGesture</a>
     */
    @Override
    public void pinchClose(AppiumDriver driver, double scale, double speed, WebElement webElement) {
        driver.executeScript("mobile: pinchCloseGesture", Map.of("percent", scale, "speed", speed, "elementId", ((RemoteWebElement) webElement).getId()));
    }
}
