package com.appium.actions;

import com.appium.interfaces.TapActionsInterface;
import com.appium.platforms.android.AndroidTapActions;
import com.appium.platforms.ios.IOSTapActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/**
 * A class that provides methods to perform tap actions on a device.
 * The actual implementation of the tap actions is platform dependent.
 * For Android, it uses the AndroidTapActions class.
 * For iOS, it uses the IOSTapActions class.
 *
 * @see AndroidTapActions
 * @see IOSTapActions
 */
public class TapActions extends BaseActions {

    /**
     * The platform specific implementation of the tap actions.
     */
    @VisibleForTesting
    protected final TapActionsInterface tapActionsPlatform;

    /**
     * Constructs a new TapActions instance.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     */
    public TapActions(AppiumDriver driver) {
        super(driver);

        tapActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidTapActions()
                : new IOSTapActions();
    }

    /**
     * Executes a single tap action on the given web element.
     *
     * @param webElement the WebElement on which the tap action is to be performed.
     * @see AndroidTapActions#tap(AppiumDriver, WebElement)
     * @see IOSTapActions#tap(AppiumDriver, WebElement)
     */
    public void tap(WebElement webElement) {
        tapActionsPlatform.tap(driver, webElement);
    }

    /**
     * Executes a single tap action on the given coordinates.
     *
     * @param x the x-coordinate on the screen where the tap action is to be performed.
     * @param y the y-coordinate on the screen where the tap action is to be performed.
     * @see AndroidTapActions#tap(AppiumDriver, int, int)
     * @see IOSTapActions#tap(AppiumDriver, int, int)
     */
    public void tap(int x, int y) {
        tapActionsPlatform.tap(driver, x, y);
    }

    /**
     * Executes a double tap action on the given web element.
     *
     * @param webElement the WebElement on which the double tap action is to be performed.
     * @see AndroidTapActions#doubleTap(AppiumDriver, WebElement)
     * @see IOSTapActions#doubleTap(AppiumDriver, WebElement)
     */
    public void doubleTap(WebElement webElement) {
        tapActionsPlatform.doubleTap(driver, webElement);
    }

    /**
     * Executes a double tap action on the given coordinates.
     *
     * @param x the x-coordinate on the screen where the double tap action is to be performed.
     * @param y the y-coordinate on the screen where the double tap action is to be performed.
     * @see AndroidTapActions#doubleTap(AppiumDriver, int, int)
     * @see IOSTapActions#doubleTap(AppiumDriver, int, int)
     */
    public void doubleTap(int x, int y) {
        tapActionsPlatform.doubleTap(driver, x, y);
    }

    /**
     * Executes a long tap action on the given web element for a specified duration.
     *
     * @param webElement the WebElement on which the long tap action is to be performed.
     * @param duration   the Duration in seconds for which the long tap action is to be held.
     * @see AndroidTapActions#longTap(AppiumDriver, WebElement, Duration)
     * @see IOSTapActions#longTap(AppiumDriver, WebElement, Duration)
     */
    public void longTap(WebElement webElement, Duration duration) {
        tapActionsPlatform.longTap(driver, webElement, duration);
    }

    /**
     * Executes a long tap action on the given coordinates for a specified duration.
     *
     * @param x        the x-coordinate on the screen where the long tap action is to be performed.
     * @param y        the y-coordinate on the screen where the long tap action is to be performed.
     * @param duration the Duration in seconds for which the long tap action is to be held.
     * @see IOSTapActions#longTap(AppiumDriver, int, int, Duration)
     */
    public void longTap(int x, int y, Duration duration) {
        tapActionsPlatform.longTap(driver, x, y, duration);
    }
}