package com.appium.actions.actions;

import com.appium.actions.enums.Direction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Map;

public class AndroidActions implements ActionsStrategy {

    @Override
    public void tap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: clickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId()));
    }

    @Override
    public void doubleTap(AppiumDriver driver, WebElement webElement) {
        driver.executeScript("mobile: doubleClickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId()));
    }

    @Override
    public void longTap(AppiumDriver driver, WebElement webElement, Duration duration) {
        driver.executeScript("mobile: longClickGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId(), "duration", duration.getSeconds() * 1000));
    }

    @Override
    public void swipe(AppiumDriver driver, WebElement webElement, Direction direction) {
        driver.executeScript("mobile: swipeGesture", Map.of("elementId", ((RemoteWebElement) webElement).getId(), "direction", direction.name()));
    }

    @Override
    public void scroll(AppiumDriver driver, Direction direction, int topAreaDiscount, int bottomAreaDiscount) {
        Window deviceWindow = driver.manage().window();
        Dimension deviceSize = deviceWindow.getSize();
        Point devicePosition = deviceWindow.getPosition();

        int height = deviceSize.getHeight() - (deviceSize.getHeight() * bottomAreaDiscount / 10);
        int width = deviceSize.getWidth();
        int left = devicePosition.getX();
        int top = devicePosition.getY() + (deviceSize.getHeight() * topAreaDiscount / 10);

        driver.executeScript("mobile: scrollGesture", Map.of("direction", direction.name(),
                "percent", 1.0,
                "left", left,
                "top", top,
                "width", width,
                "height", height
        ));
    }
}
