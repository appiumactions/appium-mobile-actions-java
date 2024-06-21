package com.appium;

import com.appium.actions.KeyboardActions;
import com.appium.actions.ScrollActions;
import com.appium.actions.SessionActions;
import com.appium.actions.TapActions;
import io.appium.java_client.AppiumDriver;

public class AppiumActions {

    public final KeyboardActions keyboardActions;
    public final TapActions tapActions;
    public final ScrollActions scrollActions;
    public final SessionActions sessionActions;

    public AppiumActions(AppiumDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("AppiumDriver cannot be null.");
        }

        this.keyboardActions = new KeyboardActions(driver);
        this.tapActions = new TapActions(driver);
        this.scrollActions = new ScrollActions(driver);
        this.sessionActions = new SessionActions(driver);
    }
}
