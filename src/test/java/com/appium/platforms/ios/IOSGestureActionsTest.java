package com.appium.platforms.ios;

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

class IOSGestureActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private RemoteWebElement webElement;

    private IOSGestureActions iosGestureActions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(webElement.getId()).thenReturn("elementId");

        iosGestureActions = new IOSGestureActions();
    }

    @DisplayName("Should call swipe method with direction and percent")
    @Test
    void testSwipeWithDirectionAndPercent() {
        iosGestureActions.swipe(driver, Direction.UP, 0.5);
        verify(driver, times(1)).executeScript("mobile: swipe", Map.of("direction", "up"));
    }

    @DisplayName("Should call swipe method with direction, percent and webElement")
    @Test
    void testSwipeWithDirectionPercentAndWebElement() {
        iosGestureActions.swipe(driver, Direction.UP, 0.5, webElement);
        verify(driver, times(1)).executeScript("mobile: swipe", Map.of("direction", "up", "elementId", ((RemoteWebElement) webElement).getId()));
    }

    @DisplayName("Should call swipe method with direction, percent and speed")
    @Test
    void testSwipeWithDirectionPercentAndSpeed() {
        iosGestureActions.swipe(driver, Direction.UP, 0.5, 100);
        verify(driver, times(1)).executeScript("mobile: swipe", Map.of("direction", "up", "velocity", 100));
    }

    @DisplayName("Should call swipe method with direction, percent, speed and webElement")
    @Test
    void testSwipeWithDirectionPercentSpeedAndWebElement() {
        iosGestureActions.swipe(driver, Direction.UP, 0.5, 100, webElement);
        verify(driver, times(1)).executeScript("mobile: swipe", Map.of("direction", "up", "velocity", 100, "elementId", webElement.getId()));
    }

    @DisplayName("Should call scroll method with direction and percent")
    @Test
    void testScrollWithDirectionAndPercent() {
        iosGestureActions.scroll(driver, Direction.UP, 0.5);
        verify(driver, times(1)).executeScript("mobile: scroll", Map.of("direction", "up"));
    }

    @DisplayName("Should call scroll method with direction, percent and webElement")
    @Test
    void testScrollWithDirectionPercentAndWebElement() {
        iosGestureActions.scroll(driver, Direction.UP, 0.5, webElement);
        verify(driver, times(1)).executeScript("mobile: scroll", Map.of("direction", "up", "elementId", webElement.getId()));
    }

    @DisplayName("Should call scroll method with direction, percent and coordinates")
    @Test
    void testScrollWithDirectionPercentAndCoordinates() {
        iosGestureActions.scroll(driver, Direction.UP, 0.5, 0, 0, 100, 100);
        verify(driver, times(1)).executeScript("mobile: scroll", Map.of("direction", "up"));
    }


    @DisplayName("Should call pinchOpen method with scale and speed")
    @Test
    void testPinchOpenWithScaleAndSpeed() {
        iosGestureActions.pinchOpen(driver, 0.5, 2.2);
        verify(driver, times(1)).executeScript("mobile: pinch", Map.of("scale", 1 + 0.5, "velocity", 2.2));
    }

    @DisplayName("Should call pinchOpen method with scale, speed and webElement")
    @Test
    void testPinchOpenWithScaleSpeedAndWebElement() {
        iosGestureActions.pinchOpen(driver, 0.5, 2.2, webElement);
        verify(driver, times(1)).executeScript("mobile: pinch", Map.of("scale", 1 + 0.5, "velocity", 2.2, "elementId", webElement.getId()));
    }

    @DisplayName("Should call pinchClose method with scale and speed")
    @Test
    void testPinchCloseWithScaleAndSpeed() {
        iosGestureActions.pinchClose(driver, 0.5, 2.2);
        verify(driver, times(1)).executeScript("mobile: pinch", Map.of("scale", 0.5, "velocity", 2.2));
    }

    @DisplayName("Should call pinchClose method with scale, speed and webElement")
    @Test
    void testPinchCloseWithScaleSpeedAndWebElement() {
        iosGestureActions.pinchClose(driver, 0.5, 2.2, webElement);
        verify(driver, times(1)).executeScript("mobile: pinch", Map.of("scale", 0.5, "velocity", 2.2, "elementId", webElement.getId()));
    }
}