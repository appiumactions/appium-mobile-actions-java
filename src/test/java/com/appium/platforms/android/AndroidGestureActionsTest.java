package com.appium.platforms.android;

import com.appium.arguments.Direction;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Map;

import static org.mockito.Mockito.*;

class AndroidGestureActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private RemoteWebElement webElement;

    private AndroidGestureActions androidGestureActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        when(webElement.getId()).thenReturn("elementId");

        androidGestureActions = new AndroidGestureActions();
    }

    @DisplayName("Should call swipe method with direction and percent")
    @Test
    void testSwipeWithDirectionAndPercent() {
        androidGestureActions.swipe(driver, Direction.UP, 0.5);
        verify(driver, times(1)).executeScript("mobile: swipeGesture", Map.of("direction", "up", "percent", 0.5));
    }

    @DisplayName("Should call swipe method with direction, percent, and webElement")
    @Test
    void testSwipeWithDirectionPercentAndWebElement() {
        androidGestureActions.swipe(driver, Direction.UP, 0.5, webElement);
        verify(driver, times(1)).executeScript("mobile: swipeGesture", Map.of("direction", "up", "percent", 0.5, "elementId", webElement.getId()));
    }

    @DisplayName("Should call swipe method with direction, percent, and speed")
    @Test
    void testSwipeWithDirectionPercentAndSpeed() {
        androidGestureActions.swipe(driver, Direction.UP, 0.5, 100);
        verify(driver, times(1)).executeScript("mobile: swipeGesture", Map.of("direction", "up", "percent", 0.5, "speed", 100));
    }

    @DisplayName("Should call swipe method with direction, percent, speed, and webElement")
    @Test
    void testSwipeWithDirectionPercentSpeedAndWebElement() {
        androidGestureActions.swipe(driver, Direction.UP, 0.5, 100, webElement);
        verify(driver, times(1)).executeScript("mobile: swipeGesture", Map.of("direction", "up", "percent", 0.5, "speed", 100, "elementId", webElement.getId()));
    }

    @DisplayName("Should call scroll method with direction and percent")
    @Test
    void testScrollWithDirectionAndPercent() {
        androidGestureActions.scroll(driver, Direction.UP, 0.5);
        verify(driver, times(1)).executeScript("mobile: scrollGesture", Map.of("direction", "up", "percent", 0.5));
    }

    @DisplayName("Should call scroll method with direction, percent, and webElement")
    @Test
    void testScrollWithDirectionPercentAndWebElement() {
        androidGestureActions.scroll(driver, Direction.UP, 0.5, webElement);
        verify(driver, times(1)).executeScript("mobile: scrollGesture", Map.of("direction", "up", "percent", 0.5, "elementId", webElement.getId()));
    }

    @DisplayName("Should call pinchOpen method with scale and speed")
    @Test
    void testPinchOpenWithScaleAndSpeed() {
        androidGestureActions.pinchOpen(driver, 0.5, 2.2);
        verify(driver, times(1)).executeScript("mobile: pinchOpenGesture", Map.of("percent", 0.5, "speed", 2.2));
    }

    @DisplayName("Should call pinchOpen method with scale, speed, and webElement")
    @Test
    void testPinchOpenWithScaleSpeedAndWebElement() {
        androidGestureActions.pinchOpen(driver, 0.5, 2.2, webElement);
        verify(driver, times(1)).executeScript("mobile: pinchOpenGesture", Map.of("percent", 0.5, "speed", 2.2, "elementId", webElement.getId()));
    }

    @DisplayName("Should call pinchClose method with scale and speed")
    @Test
    void testPinchCloseWithScaleAndSpeed() {
        androidGestureActions.pinchClose(driver, 0.5, 2.2);
        verify(driver, times(1)).executeScript("mobile: pinchCloseGesture", Map.of("percent", 0.5, "speed", 2.2));
    }

    @DisplayName("Should call pinchClose method with scale, speed, and webElement")
    @Test
    void testPinchCloseWithScaleSpeedAndWebElement() {
        androidGestureActions.pinchClose(driver, 0.5, 2.2, webElement);
        verify(driver, times(1)).executeScript("mobile: pinchCloseGesture", Map.of("percent", 0.5, "speed", 2.2, "elementId", webElement.getId()));
    }
}
