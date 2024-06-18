package com.appium.actions.actions;

import com.appium.actions.enums.Direction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Map;

public class IOSActions implements ActionsStrategy {
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

    @Override
    public void swipe(AppiumDriver driver, WebElement webElement, Direction direction) {
        driver.executeScript("mobile: swipe", Map.of("elementId", ((RemoteWebElement) webElement).getId()), "direction", direction.name());
    }

    @Override
    public void scroll(AppiumDriver driver, Direction direction, int topAreaDiscount, int bottomAreaDiscount) {
        driver.executeScript("mobile: swipe", Map.of("direction", direction.name()));
    }
}
