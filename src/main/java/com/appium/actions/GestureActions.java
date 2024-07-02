package com.appium.actions;

import com.appium.interfaces.GestureActionsInterface;
import com.appium.platforms.android.AndroidGestureActions;
import com.appium.platforms.ios.IOSGestureActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/**
 * A class that provides methods to perform tap actions on a device.
 * The actual implementation of the tap actions is platform dependent.
 * For Android, it uses the AndroidGestureActions class.
 * For iOS, it uses the IOSGestureActions class.
 *
 * @see AndroidGestureActions
 * @see IOSGestureActions
 */
public class GestureActions extends BaseActions {

    /**
     * The platform specific implementation of the tap actions.
     */
    @VisibleForTesting
    protected final GestureActionsInterface gestureActionsPlatform;

    /**
     * Constructs a new TapActions instance.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     */
    public GestureActions(AppiumDriver driver) {
        super(driver);

        gestureActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidGestureActions()
                : new IOSGestureActions();
    }

    /**
     * Executes a single tap action on the given web element.
     *
     * @param webElement the WebElement on which the tap action is to be performed.
     * @see AndroidGestureActions#tap(AppiumDriver, WebElement)
     * @see IOSGestureActions#tap(AppiumDriver, WebElement)
     */
    public void tap(WebElement webElement) {
        gestureActionsPlatform.tap(driver, webElement);
    }

    /**
     * Executes a double tap action on the given web element.
     *
     * @param webElement the WebElement on which the double tap action is to be performed.
     * @see AndroidGestureActions#doubleTap(AppiumDriver, WebElement)
     * @see IOSGestureActions#doubleTap(AppiumDriver, WebElement)
     */
    public void doubleTap(WebElement webElement) {
        gestureActionsPlatform.doubleTap(driver, webElement);
    }

    /**
     * Executes a long tap action on the given web element for a specified duration.
     *
     * @param webElement the WebElement on which the long tap action is to be performed.
     * @param duration   the Duration in seconds for which the long tap action is to be held.
     * @see AndroidGestureActions#longTap(AppiumDriver, WebElement, Duration)
     * @see IOSGestureActions#longTap(AppiumDriver, WebElement, Duration)
     */
    public void longTap(WebElement webElement, Duration duration) {
        gestureActionsPlatform.longTap(driver, webElement, duration);
    }
}