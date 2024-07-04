package com.appium.platforms.ios;

import com.appium.arguments.Direction;
import com.appium.interfaces.GestureActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Map;

/**
 * Provides gesture actions specific to iOS platforms using Appium.
 * This class implements the {@link GestureActionsInterface} to provide swipe and scroll functionalities
 * on iOS devices. It utilizes Appium's mobile commands for executing these gestures.
 */
public class IOSGestureActions implements GestureActionsInterface {

    /**
     * Performs a swipe gesture in the specified direction covering a certain percentage of the screen.
     *
     * @param driver    The AppiumDriver instance used to perform the gesture.
     * @param direction The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent   The percentage of the screen the swipe should cover. <b>Currently not supported on the iOS platform.</b>
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-swipe">XCUITest - swipe</a>
     */
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent) {
        driver.executeScript("mobile: swipe", Map.of("direction", direction.name().toLowerCase()));
    }

    /**
     * Performs a swipe gesture on a specific element in the specified direction covering a certain percentage of the screen.
     *
     * @param driver     The AppiumDriver instance used to perform the gesture.
     * @param direction  The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent    The percentage of the screen the swipe should cover. <b>Currently not supported on the iOS platform.</b>
     * @param webElement The WebElement on which the swipe gesture should be performed.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-swipe">XCUITest - swipe</a>
     */
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: swipe", Map.of("direction", direction.name().toLowerCase(), "elementId", ((RemoteWebElement) webElement).getId()));
    }

    /**
     * Performs a swipe gesture in the specified direction covering a certain percentage of the screen with a specific speed.
     *
     * @param driver    The AppiumDriver instance used to perform the gesture.
     * @param direction The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent   The percentage of the screen the swipe should cover. <b>Currently not supported on the iOS platform.</b>
     * @param speed     The speed of the swipe gesture, represented as velocity.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-swipe">XCUITest - swipe</a>
     */
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent, int speed) {
        driver.executeScript("mobile: swipe", Map.of("direction", direction.name().toLowerCase(), "velocity", speed));
    }

    /**
     * Performs a swipe gesture on a specific element in the specified direction covering a certain percentage of the screen with a specific speed.
     *
     * @param driver     The AppiumDriver instance used to perform the gesture.
     * @param direction  The direction of the swipe (UP, DOWN, LEFT, RIGHT).
     * @param percent    The percentage of the screen the swipe should cover. <b>Currently not supported on the iOS platform.</b>
     * @param speed      The speed of the swipe gesture, represented as velocity.
     * @param webElement The WebElement on which the swipe gesture should be performed.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-swipe">XCUITest - swipe</a>
     */
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent, int speed, WebElement webElement) {
        driver.executeScript("mobile: swipe", Map.of("direction", direction.name().toLowerCase(), "velocity", speed, "elementId", ((RemoteWebElement) webElement).getId()));
    }

    /**
     * Performs a scroll gesture in the specified direction covering a certain percentage of the screen.
     *
     * @param driver    The AppiumDriver instance used to perform the gesture.
     * @param direction The direction of the scroll (UP, DOWN, LEFT, RIGHT).
     * @param percent   The percentage of the screen the scroll should cover. <b>Currently not supported on the iOS platform.</b>
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-scroll">XCUITest - scroll</a>
     */
    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent) {
        driver.executeScript("mobile: scroll", Map.of("direction", direction.name().toLowerCase()));
    }

    /**
     * Performs a scroll gesture on a specific element in the specified direction covering a certain percentage of the screen.
     *
     * @param driver     The AppiumDriver instance used to perform the gesture.
     * @param direction  The direction of the scroll (UP, DOWN, LEFT, RIGHT).
     * @param percent    The percentage of the screen the scroll should cover. <b>Currently not supported on the iOS platform.</b>
     * @param webElement The WebElement on which the scroll gesture should be performed.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-scroll">XCUITest - scroll</a>
     */
    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: scroll", Map.of("direction", direction.name().toLowerCase(), "elementId", ((RemoteWebElement) webElement).getId()));
    }
}