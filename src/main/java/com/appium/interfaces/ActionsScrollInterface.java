package com.appium.interfaces;

import com.appium.enums.Direction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public interface ActionsScrollInterface {
    void swipe(AppiumDriver driver, WebElement webElement, Direction direction);
    void scroll(AppiumDriver driver, Direction direction, int topAreaDiscount, int bottomAreaDiscount);
}
