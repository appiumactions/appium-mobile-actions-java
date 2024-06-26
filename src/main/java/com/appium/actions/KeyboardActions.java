package com.appium.actions;

import com.appium.interfaces.KeyboardActionsInterface;
import com.appium.platforms.android.AndroidKeyboardActions;
import com.appium.platforms.ios.IOSKeyboardActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

/**
 * A class that provides methods to perform keyboard actions on a device.
 * The actual implementation of the keyboard actions is platform dependent.
 * For Android, it uses the AndroidKeyboardActions class.
 * For iOS, it uses the IOSKeyboardActions class.
 *
 * @see com.appium.platforms.android.AndroidKeyboardActions
 * @see com.appium.platforms.ios.IOSKeyboardActions
 */
public class KeyboardActions extends BaseActions {

    /**
     * The platform specific implementation of the keyboard actions.
     */
    @VisibleForTesting
    protected final KeyboardActionsInterface keyboardActionsPlatform;

    /**
     * Constructs a new KeyboardActions instance.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     */
    public KeyboardActions(AppiumDriver driver) {
        super(driver);

        keyboardActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidKeyboardActions()
                : new IOSKeyboardActions();
    }

    /**
     * Hides the keyboard if it is displayed.
     *
     * @see com.appium.platforms.android.AndroidKeyboardActions#hideKeyboard(AppiumDriver)
     * @see com.appium.platforms.ios.IOSKeyboardActions#hideKeyboard(AppiumDriver)
     */
    public void hideKeyboard() {
        keyboardActionsPlatform.hideKeyboard(driver);
    }

    /**
     * Hides the keyboard if it is displayed by pressing the specified keys.
     *
     * @param keys the keys to press to hide the keyboard. Parameter supported <b>only in XCUITest - iOS</b>.
     * @see com.appium.platforms.android.AndroidKeyboardActions#hideKeyboard(AppiumDriver, String[])
     * @see com.appium.platforms.ios.IOSKeyboardActions#hideKeyboard(AppiumDriver, String[])
     */
    public void hideKeyboard(String[] keys) {
        keyboardActionsPlatform.hideKeyboard(driver, keys);
    }

    /**
     * Checks if the keyboard is displayed.
     *
     * @return true if the keyboard is displayed, false otherwise.
     * @see com.appium.platforms.android.AndroidKeyboardActions#isKeyboardShown(AppiumDriver)
     * @see com.appium.platforms.ios.IOSKeyboardActions#isKeyboardShown(AppiumDriver)
     */
    public boolean isKeyboardShown() {
        return keyboardActionsPlatform.isKeyboardShown(driver);
    }
}