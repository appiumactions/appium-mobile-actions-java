package com.appium.interfaces;

import com.appium.arguments.Direction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public interface ScrollActionsInterface {
    void swipe(AppiumDriver driver, WebElement webElement, Direction direction);
    void scroll(AppiumDriver driver, Direction direction, double percent);
    void scroll(AppiumDriver driver, Direction direction, double percent, WebElement webElement);
}
