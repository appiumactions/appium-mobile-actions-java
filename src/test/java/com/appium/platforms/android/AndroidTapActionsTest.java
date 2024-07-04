package com.appium.platforms.android;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Map;

import static org.mockito.Mockito.*;

class AndroidTapActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private RemoteWebElement webElement;

    private AndroidTapActions androidTapActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        when(webElement.getId()).thenReturn("elementId");

        androidTapActions = new AndroidTapActions();
    }

    @DisplayName("Should execute the tap with web element script for Android")
    @Test
    void testTapWebElement() {
        androidTapActions.tap(driver, webElement);

        verify(driver, times(1)).executeScript("mobile: clickGesture", Map.of("elementId", webElement.getId()));
    }

    @DisplayName("Should execute the tap with coordinates script for Android")
    @Test
    void testTapCoordinates() {
        androidTapActions.tap(driver, 10, 20);

        verify(driver, times(1)).executeScript("mobile: clickGesture", Map.of("x", 10, "y", 20));
    }

    @DisplayName("Should execute the double tap with web element script for Android")
    @Test
    void testDoubleTapWebElement() {
        androidTapActions.doubleTap(driver, webElement);

        verify(driver, times(1)).executeScript("mobile: doubleClickGesture", Map.of("elementId", webElement.getId()));
    }

    @DisplayName("Should execute the double tap with coordinates script for Android")
    @Test
    void testDoubleTapCoordinates() {
        androidTapActions.doubleTap(driver, 10, 20);

        verify(driver, times(1)).executeScript("mobile: doubleClickGesture", Map.of("x", 10, "y", 20));
    }

    @DisplayName("Should execute the long tap with web element script for Android")
    @Test
    void testLongTapWebElement() {
        Duration duration = Duration.ofSeconds(3);
        androidTapActions.longTap(driver, webElement, duration);

        verify(driver, times(1)).executeScript("mobile: longClickGesture", Map.of("elementId", webElement.getId(), "duration", duration.getSeconds() * 1000));
    }

    @DisplayName("Should execute the long tap with coordinates script for Android")
    @Test
    void testLongTapCoordinates() {
        Duration duration = Duration.ofSeconds(3);
        androidTapActions.longTap(driver, 10, 20, duration);

        verify(driver, times(1)).executeScript("mobile: longClickGesture", Map.of("x", 10, "y", 20, "duration", duration.getSeconds() * 1000));
    }
}