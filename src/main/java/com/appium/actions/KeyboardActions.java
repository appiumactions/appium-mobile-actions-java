package com.appium.actions;

import com.appium.interfaces.KeyboardActionsInterface;
import com.appium.platforms.android.AndroidKeyboardActions;
import com.appium.platforms.ios.IOSKeyboardActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class KeyboardActions extends BaseActions {
    @VisibleForTesting
    protected final KeyboardActionsInterface keyboardActionsPlatform;

    public KeyboardActions(AppiumDriver driver) {
        super(driver);

        keyboardActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidKeyboardActions()
                : new IOSKeyboardActions();
    }

    public void hideKeyboard() {
        keyboardActionsPlatform.hideKeyboard(driver);
    }

    public void hideKeyboard(String[] keys) {
        keyboardActionsPlatform.hideKeyboard(driver, keys);
    }

    public boolean isKeyboardShown() {
        return keyboardActionsPlatform.isKeyboardShown(driver);
    }
}
