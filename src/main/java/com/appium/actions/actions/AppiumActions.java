package com.appium.actions.actions;

import com.appium.actions.enums.Direction;
import com.appium.actions.exceptions.PlatformException;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AppiumActions {

    private final AppiumDriver driver;
    private final ActionsStrategy actionsStrategy;

    public AppiumActions(AppiumDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("AppiumDriver cannot be null.");
        }

        this.driver = driver;

        if (driver.getCapabilities().getPlatformName().is(Platform.IOS)) {
            this.actionsStrategy = new IOSActions();
        } else if (driver.getCapabilities().getPlatformName().is(Platform.ANDROID)) {
            this.actionsStrategy = new AndroidActions();
        } else {
            throw new PlatformException("This platform is not supported: " + driver.getCapabilities().getPlatformName().name());
        }
    }

    public void tap(WebElement webElement) {
        actionsStrategy.tap(driver, webElement);
    }

    public void doubleTap(WebElement webElement) {
        actionsStrategy.doubleTap(driver, webElement);
    }

    public void longTap(WebElement webElement, Duration duration) {
        actionsStrategy.longTap(driver, webElement, duration);
    }

    public void swipe(WebElement webElement, Direction direction) {
        actionsStrategy.swipe(driver, webElement, direction);
    }

    public void scroll(Direction direction, int topAreaDiscount, int bottomAreaDiscount) {
        actionsStrategy.scroll(driver, direction, topAreaDiscount, bottomAreaDiscount);
    }

    public void hideKeyboard() {
        driver.executeScript("mobile: hideKeyboard");
    }

    public boolean isKeyboardShown() {
        return (boolean) driver.executeScript("mobile: isKeyboardShown");
    }

    public boolean isBiometricEnrolled() {
        return (boolean) driver.executeScript("mobile: isBiometricEnrolled");
    }


}
