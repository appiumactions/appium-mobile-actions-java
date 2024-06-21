package com.appium.platforms.ios;

import com.appium.interfaces.ActionsKeyboardInterface;
import io.appium.java_client.AppiumDriver;

public class IOSKeyboardActions implements ActionsKeyboardInterface {
    @Override
    public void hideKeyboard(AppiumDriver driver) {

    }

    @Override
    public boolean isKeyboardShown(AppiumDriver driver) {
        return false;
    }
}
