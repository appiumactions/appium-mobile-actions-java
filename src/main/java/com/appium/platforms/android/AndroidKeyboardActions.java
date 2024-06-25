package com.appium.platforms.android;

import com.appium.interfaces.KeyboardActionsInterface;
import io.appium.java_client.AppiumDriver;

/**
 * A class that implements the KeyboardActionsInterface for Android platform.
 * It provides methods to interact with the keyboard on an Android device using Appium.
 */
public class AndroidKeyboardActions implements KeyboardActionsInterface {

    /**
     * Hides the keyboard if it is displayed on the Android device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-hidekeyboard">UiAutomator2 - hideKeyboard</a>
     */
    @Override
    public void hideKeyboard(AppiumDriver driver) {
        driver.executeScript("mobile: hideKeyboard");
    }

    /**
     * Hides the keyboard if it is displayed on the Android device.
     * This method is currently identical to the one without parameters, as Android does not support hiding the keyboard with specific keys.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param keys   the keys to use to hide the keyboard. <b>Currently not supported on the Android platform.</b>
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-hidekeyboard">UiAutomator2 - hideKeyboard</a>
     */
    @Override
    public void hideKeyboard(AppiumDriver driver, String[] keys) {
        driver.executeScript("mobile: hideKeyboard");
    }

    /**
     * Checks if the keyboard is shown on the Android device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @return true if the keyboard is shown, false otherwise.
     * @link <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-iskeyboardshown">UiAutomator2 - isKeyboardShown</a>
     */
    @Override
    public boolean isKeyboardShown(AppiumDriver driver) {
        return (boolean) driver.executeScript("mobile: isKeyboardShown");
    }
}