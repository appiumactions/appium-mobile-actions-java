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

class GestureActionsInterfaceTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private WebElement webElement;

    private GestureActionsInterface gestureActionsInterface;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        gestureActionsInterface = mock(GestureActionsInterface.class);
    }

    @DisplayName("Should call swipe method with direction and percent")
    @Test
    void testSwipeWithDirectionAndPercent() {
        gestureActionsInterface.swipe(driver, Direction.UP, 0.5);
        verify(gestureActionsInterface, times(1)).swipe(driver, Direction.UP, 0.5);
    }

    @DisplayName("Should call swipe method with direction, percent and webElement")
    @Test
    void testSwipeWithDirectionPercentAndWebElement() {
        gestureActionsInterface.swipe(driver, Direction.UP, 0.5, webElement);
        verify(gestureActionsInterface, times(1)).swipe(driver, Direction.UP, 0.5, webElement);
    }

    @DisplayName("Should call swipe method with direction, percent and speed")
    @Test
    void testSwipeWithDirectionPercentAndSpeed() {
        gestureActionsInterface.swipe(driver, Direction.UP, 0.5, 100);
        verify(gestureActionsInterface, times(1)).swipe(driver, Direction.UP, 0.5, 100);
    }

    @DisplayName("Should call swipe method with direction, percent, speed and webElement")
    @Test
    void testSwipeWithDirectionPercentSpeedAndWebElement() {
        gestureActionsInterface.swipe(driver, Direction.UP, 0.5, 100, webElement);
        verify(gestureActionsInterface, times(1)).swipe(driver, Direction.UP, 0.5, 100, webElement);
    }

    @DisplayName("Should call scroll method with direction and percent")
    @Test
    void testScrollWithDirectionAndPercent() {
        gestureActionsInterface.scroll(driver, Direction.UP, 0.5);
        verify(gestureActionsInterface, times(1)).scroll(driver, Direction.UP, 0.5);
    }

    @DisplayName("Should call scroll method with direction, percent and webElement")
    @Test
    void testScrollWithDirectionPercentAndWebElement() {
        gestureActionsInterface.scroll(driver, Direction.UP, 0.5, webElement);
        verify(gestureActionsInterface, times(1)).scroll(driver, Direction.UP, 0.5, webElement);
    }

    @DisplayName("Should call scroll method with direction, percent and coordinates")
    @Test
    void testScrollWithDirectionPercentAndCoordinates() {
        gestureActionsInterface.scroll(driver, Direction.UP, 0.5, 0, 0, 100, 100);
        verify(gestureActionsInterface, times(1)).scroll(driver, Direction.UP, 0.5, 0, 0, 100, 100);
    }

    @DisplayName("Should call pinchOpen method with scale and speed")
    @Test
    void testPinchOpenWithScaleAndSpeed() {
        gestureActionsInterface.pinchOpen(driver, 0.5, 100);
        verify(gestureActionsInterface, times(1)).pinchOpen(driver, 0.5, 100);
    }

    @DisplayName("Should call pinchOpen method with scale, speed and webElement")
    @Test
    void testPinchOpenWithScaleSpeedAndWebElement() {
        gestureActionsInterface.pinchOpen(driver, 0.5, 100, webElement);
        verify(gestureActionsInterface, times(1)).pinchOpen(driver, 0.5, 100, webElement);
    }

    @DisplayName("Should call pinchClose method with scale and speed")
    @Test
    void testPinchCloseWithScaleAndSpeed() {
        gestureActionsInterface.pinchClose(driver, 0.5, 100);
        verify(gestureActionsInterface, times(1)).pinchClose(driver, 0.5, 100);
    }

    @DisplayName("Should call pinchClose method with scale, speed and webElement")
    @Test
    void testPinchCloseWithScaleSpeedAndWebElement() {
        gestureActionsInterface.pinchClose(driver, 0.5, 100, webElement);
        verify(gestureActionsInterface, times(1)).pinchClose(driver, 0.5, 100, webElement);
    }
}