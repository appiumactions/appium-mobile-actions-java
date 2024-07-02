package com.appium;

import com.appium.actions.*;
import io.appium.java_client.AppiumDriver;

public class AppiumActions {

    public final KeyboardActions keyboardActions;
    public final GestureActions gestureActions;
    public final ScrollActions scrollActions;
    public final SessionActions sessionActions;
    public final DeviceActions deviceActions;

    public AppiumActions(AppiumDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("AppiumDriver cannot be null.");
        }

        keyboardActions = new KeyboardActions(driver);
        gestureActions = new GestureActions(driver);
        scrollActions = new ScrollActions(driver);
        sessionActions = new SessionActions(driver);
        deviceActions = new DeviceActions(driver);
    }
}
