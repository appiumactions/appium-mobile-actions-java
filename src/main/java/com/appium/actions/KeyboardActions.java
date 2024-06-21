package com.appium.actions;

import com.appium.interfaces.KeyboardActionsInterface;
import com.appium.platforms.android.AndroidKeyboardActions;
import com.appium.platforms.ios.IOSKeyboardActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class KeyboardActions extends BaseActions {

    KeyboardActionsInterface keyboardActions;

    public KeyboardActions(AppiumDriver driver) {
        super(driver);

        keyboardActions = platform.is(Platform.ANDROID)
                ? new AndroidKeyboardActions()
                : new IOSKeyboardActions();
    }

    public void hideKeyboard() {
        keyboardActions.hideKeyboard(driver);
    }

    public void hideKeyboard(String[] keys) {
        keyboardActions.hideKeyboard(driver, keys);
    }

    public boolean isKeyboardShown() {
        return keyboardActions.isKeyboardShown(driver);
    }
}
