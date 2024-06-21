package com.appium.platforms.android;

import com.appium.interfaces.KeyboardActionsInterface;
import io.appium.java_client.AppiumDriver;

public class AndroidKeyboardActions implements KeyboardActionsInterface {
    @Override
    public void hideKeyboard(AppiumDriver driver) {
        driver.executeScript("mobile: hideKeyboard");
    }

    @Override
    public void hideKeyboard(AppiumDriver driver, String[] keys) {
        driver.executeScript("mobile: hideKeyboard");
    }

    @Override
    public boolean isKeyboardShown(AppiumDriver driver) {
        return (boolean) driver.executeScript("mobile: isKeyboardShown");
    }
}
