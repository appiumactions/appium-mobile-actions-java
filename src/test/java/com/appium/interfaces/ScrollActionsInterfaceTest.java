package com.appium.interfaces;

import com.appium.arguments.Direction;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.WebElement;

import static org.mockito.Mockito.*;

class ScrollActionsInterfaceTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private WebElement webElement;

    private ScrollActionsInterface scrollActionsInterface;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        scrollActionsInterface = mock(ScrollActionsInterface.class);
    }

    @DisplayName("Should call swipe method")
    @Test
    void testSwipe() {
        scrollActionsInterface.swipe(driver, webElement, Direction.UP);
        verify(scrollActionsInterface, times(1)).swipe(driver, webElement, Direction.UP);
    }

    @DisplayName("Should call scroll method with direction and percent")
    @Test
    void testScrollWithDirectionAndPercent() {
        scrollActionsInterface.scroll(driver, Direction.UP, 0.5);
        verify(scrollActionsInterface, times(1)).scroll(driver, Direction.UP, 0.5);
    }

    @DisplayName("Should call scroll method with direction, percent and webElement")
    @Test
    void testScrollWithDirectionPercentAndWebElement() {
        scrollActionsInterface.scroll(driver, Direction.UP, 0.5, webElement);
        verify(scrollActionsInterface, times(1)).scroll(driver, Direction.UP, 0.5, webElement);
    }
}