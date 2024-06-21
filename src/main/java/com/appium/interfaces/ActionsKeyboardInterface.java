package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;

public interface ActionsKeyboardInterface {
    void hideKeyboard(AppiumDriver driver);
    void hideKeyboard(AppiumDriver driver, String[] keys);
    boolean isKeyboardShown(AppiumDriver driver);
}
