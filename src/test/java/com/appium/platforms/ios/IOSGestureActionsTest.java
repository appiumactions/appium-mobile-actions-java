package com.appium.platforms.ios;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Map;

import static org.mockito.Mockito.*;

class IOSGestureActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private RemoteWebElement webElement;

    private IOSGestureActions iosGestureActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        when(webElement.getId()).thenReturn("elementId");
        when(webElement.getLocation()).thenReturn(new Point(10, 20));

        iosGestureActions = new IOSGestureActions();
    }

    @DisplayName("Should execute the tap script for iOS")
    @Test
    void testTap() {
        iosGestureActions.tap(driver, webElement);

        verify(driver, times(1)).executeScript("mobile: tap", Map.of("x", webElement.getLocation().getX(), "y", webElement.getLocation().getY()));
    }

    @DisplayName("Should execute the double tap script for iOS")
    @Test
    void testDoubleTap() {
        iosGestureActions.doubleTap(driver, webElement);

        verify(driver, times(1)).executeScript("mobile: doubleTap", Map.of("elementId", webElement.getId()));
    }

    @DisplayName("Should execute the long tap script for iOS")
    @Test
    void testLongTap() {
        Duration duration = Duration.ofSeconds(3);
        iosGestureActions.longTap(driver, webElement, duration);

        verify(driver, times(1)).executeScript("mobile: touchAndHold", Map.of("elementId", webElement.getId(), "duration", duration.getSeconds()));
    }
}