package com.appium.interfaces;

import com.appium.arguments.Direction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public interface GestureActionsInterface {
    void swipe(AppiumDriver driver, Direction direction, double percent);
    void swipe(AppiumDriver driver, Direction direction, double percent, WebElement webElement);
    void swipe(AppiumDriver driver, Direction direction, double percent, int speed);
    void swipe(AppiumDriver driver, Direction direction, double percent, int speed, WebElement webElement);
    void scroll(AppiumDriver driver, Direction direction, double percent);
    void scroll(AppiumDriver driver, Direction direction, double percent, WebElement webElement);
}
