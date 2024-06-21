package com.appium.platforms.android;

import com.appium.arguments.Direction;
import com.appium.interfaces.ScrollActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Map;

public class AndroidScrollActions implements ScrollActionsInterface {
    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent) {
        driver.executeScript("mobile: swipeGesture", Map.of("direction", direction.name().toLowerCase(), "percent", percent));
    }

    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: swipeGesture", Map.of("direction", direction.name().toLowerCase(), "elementId", ((RemoteWebElement) webElement).getId(), "percent", percent));
    }

    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent) {
        driver.executeScript("mobile: scrollGesture", Map.of("direction", direction.name().toLowerCase(), "percent", percent));
    }

    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: scrollGesture", Map.of("direction", direction.name().toLowerCase(), "elementId", ((RemoteWebElement) webElement).getId(), "percent", percent));
    }
}
