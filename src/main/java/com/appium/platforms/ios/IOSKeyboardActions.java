package com.appium.platforms.ios;

import com.appium.interfaces.KeyboardActionsInterface;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

/**
 * A class that implements the KeyboardActionsInterface for iOS platform.
 * It provides methods to interact with the keyboard on an iOS device using Appium.
 */
public class IOSKeyboardActions implements KeyboardActionsInterface {

    /**
     * Hides the keyboard if it is displayed on the iOS device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-hidekeyboard">XCUITest - hideKeyboard</a>
     */
    @Override
    public void hideKeyboard(AppiumDriver driver) {
        driver.executeScript("mobile: hideKeyboard");
    }

    /**
     * Hides the keyboard if it is displayed on the iOS device.
     * This method uses the provided keys to hide the keyboard.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param keys   the keys to use to hide the keyboard. Example: ["done", "next"]
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-hidekeyboard">XCUITest - hideKeyboard</a>
     */
    @Override
    public void hideKeyboard(AppiumDriver driver, String[] keys) {
        driver.executeScript("mobile: hideKeyboard", Map.of("keys", keys));
    }

    /**
     * Checks if the keyboard is shown on the iOS device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @return true if the keyboard is shown, false otherwise.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-iskeyboardshown">XCUITest - isKeyboardShown</a>
     */
    @Override
    public boolean isKeyboardShown(AppiumDriver driver) {
        return (boolean) driver.executeScript("mobile: isKeyboardShown");
    }
}
