package com.appium.actions;

import com.appium.interfaces.ActionsKeyboardInterface;
import com.appium.platforms.android.AndroidKeyboardActions;
import com.appium.platforms.ios.IOSKeyboardActions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

public class KeyboardActions extends BaseActions {

    ActionsKeyboardInterface actionsKeyboardStrategy;

    public KeyboardActions(AppiumDriver driver) {
        super(driver);

        actionsKeyboardStrategy = platform.is(Platform.ANDROID)
                ? new AndroidKeyboardActions()
                : new IOSKeyboardActions();
    }

    public void hideKeyboard() {
        actionsKeyboardStrategy.hideKeyboard(driver);
    }

    public boolean isKeyboardShown() {
        return actionsKeyboardStrategy.isKeyboardShown(driver);
    }
}
