package com.appium;

import com.appium.actions.*;
import io.appium.java_client.AppiumDriver;

public class AppiumActions {

    public final KeyboardActions keyboard;
    public final TapActions tap;
    public final GestureActions gesture;
    public final SessionActions session;
    public final DeviceActions device;

    public AppiumActions(AppiumDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("AppiumDriver cannot be null.");
        }

        keyboard = new KeyboardActions(driver);
        tap = new TapActions(driver);
        gesture = new GestureActions(driver);
        session = new SessionActions(driver);
        device = new DeviceActions(driver);
    }
}
