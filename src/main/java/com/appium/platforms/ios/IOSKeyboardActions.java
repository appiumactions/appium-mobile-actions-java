package com.appium.platforms.ios;

import com.appium.interfaces.KeyboardActionsInterface;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

public class IOSKeyboardActions implements KeyboardActionsInterface {
    @Override
    public void hideKeyboard(AppiumDriver driver) {
        driver.executeScript("mobile: hideKeyboard");
    }

    @Override
    public void hideKeyboard(AppiumDriver driver, String[] keys) {
        driver.executeScript("mobile: hideKeyboard", Map.of("keys", keys));
    }

    @Override
    public boolean isKeyboardShown(AppiumDriver driver) {
        return (boolean) driver.executeScript("mobile: isKeyboardShown");
    }
}
