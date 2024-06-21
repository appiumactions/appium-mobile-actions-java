package com.appium.platforms.ios;

import com.appium.interfaces.TapActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Map;

public class IOSTapActions implements TapActionsInterface {
    @Override
    public void tap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: tap", Map.of("x", webElement.getLocation().getX(), "y", webElement.getLocation().getY()));
    }

    @Override
    public void doubleTap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: doubleTap", Map.of("elementId", ((RemoteWebElement) webElement).getId()));
    }

    @Override
    public void longTap(AppiumDriver driver, WebElement webElement, Duration duration) {
        driver.executeScript("mobile: touchAndHold", Map.of("elementId", ((RemoteWebElement) webElement).getId(), "duration", duration.getSeconds()));
    }
}
