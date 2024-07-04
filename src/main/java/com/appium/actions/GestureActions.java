package com.appium.actions;

import com.appium.arguments.Direction;
import com.appium.interfaces.GestureActionsInterface;
import com.appium.platforms.android.AndroidGestureActions;
import com.appium.platforms.ios.IOSGestureActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

/**
 * A class that provides methods to manage the gesture actions on a device.
 * The actual implementation of the gesture actions is platform dependent.
 * For Android, it uses the AndroidGestureActions class.
 * For iOS, it uses the IOSGestureActions class.
 *
 * @see com.appium.platforms.android.AndroidGestureActions
 * @see com.appium.platforms.ios.IOSGestureActions
 */
public class GestureActions extends BaseActions {

    /**
     * The platform specific implementation of the gesture actions.
     */
    @VisibleForTesting
    protected final GestureActionsInterface gestureActionsPlatform;

    /**
     * Constructs a new GestureActions instance.
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
     * Swipes the screen in the specified direction by the specified percentage.
     *
     * @param direction the direction in which to swipe.
     * @param percent   the percentage of the screen width/height by which to swipe. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @see AndroidGestureActions#swipe(AppiumDriver, Direction, double)
     * @see IOSGestureActions#swipe(AppiumDriver, Direction, double)
     */
    public void swipe(Direction direction, double percent) {
        gestureActionsPlatform.swipe(driver, direction, percent);
    }

    /**
     * Swipes the screen in the specified direction by the specified percentage.
     *
     * @param direction  the direction in which to swipe.
     * @param percent    the percentage of the screen width/height by which to swipe. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param webElement the WebElement on which to perform the swipe action.
     * @see AndroidGestureActions#swipe(AppiumDriver, Direction, double, WebElement)
     * @see IOSGestureActions#swipe(AppiumDriver, Direction, double, WebElement)
     */
    public void swipe(Direction direction, double percent, WebElement webElement) {
        gestureActionsPlatform.swipe(driver, direction, percent, webElement);
    }

    /**
     * Swipes the screen in the specified direction by the specified percentage and speed.
     *
     * @param direction the direction in which to swipe.
     * @param percent   the percentage of the screen width/height by which to swipe. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param speed     the speed at which to perform the swipe action.
     * @see AndroidGestureActions#swipe(AppiumDriver, Direction, double, int)
     * @see IOSGestureActions#swipe(AppiumDriver, Direction, double, int)
     */
    public void swipe(Direction direction, double percent, int speed) {
        gestureActionsPlatform.swipe(driver, direction, percent, speed);
    }

    /**
     * Swipes the screen in the specified direction by the specified percentage and speed.
     *
     * @param direction  the direction in which to swipe.
     * @param percent    the percentage of the screen width/height by which to swipe. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param speed      the speed at which to perform the swipe action.
     * @param webElement the WebElement on which to perform the swipe action.
     * @see AndroidGestureActions#swipe(AppiumDriver, Direction, double, int, WebElement)
     * @see IOSGestureActions#swipe(AppiumDriver, Direction, double, int, WebElement)
     */
    public void swipe(Direction direction, double percent, int speed, WebElement webElement) {
        gestureActionsPlatform.swipe(driver, direction, percent, speed, webElement);
    }

    /**
     * Scrolls the screen in the specified direction by the specified percentage.
     *
     * @param direction the direction in which to scroll.
     * @param percent   the percentage of the screen width/height by which to scroll. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @see AndroidGestureActions#scroll(AppiumDriver, Direction, double)
     * @see IOSGestureActions#scroll(AppiumDriver, Direction, double)
     */
    public void scroll(Direction direction, double percent) {
        gestureActionsPlatform.scroll(driver, direction, percent);
    }

    /**
     * Scrolls the screen in the specified direction by the specified percentage.
     *
     * @param direction  the direction in which to scroll.
     * @param percent    the percentage of the screen width/height by which to scroll. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param webElement the WebElement on which to perform the scroll action.
     * @see AndroidGestureActions#scroll(AppiumDriver, Direction, double, WebElement)
     * @see IOSGestureActions#scroll(AppiumDriver, Direction, double, WebElement)
     */
    public void scroll(Direction direction, double percent, WebElement webElement) {
        gestureActionsPlatform.scroll(driver, direction, percent, webElement);
    }
}
