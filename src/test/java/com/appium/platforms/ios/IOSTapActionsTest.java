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

class IOSTapActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private RemoteWebElement webElement;

    private IOSTapActions iosTapActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        when(webElement.getId()).thenReturn("elementId");
        when(webElement.getLocation()).thenReturn(new Point(10, 20));

        iosTapActions = new IOSTapActions();
    }

    @DisplayName("Should execute the tap with web element script for iOS")
    @Test
    void testTapWebElement() {
        iosTapActions.tap(driver, webElement);

        verify(driver, times(1)).executeScript("mobile: tap", Map.of("x", webElement.getLocation().getX(), "y", webElement.getLocation().getY()));
    }

    @DisplayName("Should execute the tap with coordinates script for iOS")
    @Test
    void testTapCoordinates() {
        iosTapActions.tap(driver, 10, 20);

        verify(driver, times(1)).executeScript("mobile: tap", Map.of("x", 10, "y", 20));
    }

    @DisplayName("Should execute the double tap with web element script for iOS")
    @Test
    void testDoubleTapWebElement() {
        iosTapActions.doubleTap(driver, webElement);

        verify(driver, times(1)).executeScript("mobile: doubleTap", Map.of("elementId", webElement.getId()));
    }

    @DisplayName("Should execute the double tap with coordinates script for iOS")
    @Test
    void testDoubleTapCoordinates() {
        iosTapActions.doubleTap(driver, 10, 20);

        verify(driver, times(1)).executeScript("mobile: doubleTap", Map.of("x", 10, "y", 20));
    }

    @DisplayName("Should execute the long tap with web element script for iOS")
    @Test
    void testLongTapWebElement() {
        Duration duration = Duration.ofSeconds(3);
        iosTapActions.longTap(driver, webElement, duration);

        verify(driver, times(1)).executeScript("mobile: touchAndHold", Map.of("elementId", webElement.getId(), "duration", duration.getSeconds()));
    }

    @DisplayName("Should execute the long tap with coordinates script for iOS")
    @Test
    void testLongTapCoordinates() {
        Duration duration = Duration.ofSeconds(3);
        iosTapActions.longTap(driver, 10, 20, duration);

        verify(driver, times(1)).executeScript("mobile: touchAndHold", Map.of("x", 10, "y", 20, "duration", duration.getSeconds()));
    }
}