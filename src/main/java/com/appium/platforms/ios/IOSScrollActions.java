package com.appium.platforms.ios;

import com.appium.arguments.Direction;
import com.appium.interfaces.ScrollActionsInterface;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Map;

public class IOSScrollActions implements ScrollActionsInterface {

    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent) {
        driver.executeScript("mobile: swipe", Map.of("direction", direction.name().toLowerCase()));
    }

    @Override
    public void swipe(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: swipe", Map.of("direction", direction.name().toLowerCase(), "elementId", ((RemoteWebElement) webElement).getId()));
    }

    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent) {
        driver.executeScript("mobile: scroll", Map.of("direction", direction.name().toLowerCase()));
    }

    @Override
    public void scroll(AppiumDriver driver, Direction direction, double percent, WebElement webElement) {
        driver.executeScript("mobile: scroll", Map.of("direction", direction.name().toLowerCase(), "elementId", ((RemoteWebElement) webElement).getId()));
    }
}
