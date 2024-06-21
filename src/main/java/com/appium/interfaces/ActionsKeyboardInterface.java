package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;

public interface ActionsKeyboardInterface {
    void hideKeyboard(AppiumDriver driver);
    boolean isKeyboardShown(AppiumDriver driver);
}
