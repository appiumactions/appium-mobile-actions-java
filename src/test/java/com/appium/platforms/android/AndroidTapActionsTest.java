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

    @DisplayName("Should execute the tap script for Android")
    @Test
    void testTap() {
        androidTapActions.tap(driver, webElement);

        verify(driver, times(1)).executeScript("mobile: clickGesture", Map.of("elementId", webElement.getId()));
    }

    @DisplayName("Should execute the double tap script for Android")
    @Test
    void testDoubleTap() {
        androidTapActions.doubleTap(driver, webElement);

        verify(driver, times(1)).executeScript("mobile: doubleClickGesture", Map.of("elementId", webElement.getId()));
    }

    @DisplayName("Should execute the long tap script for Android")
    @Test
    void testLongTap() {
        Duration duration = Duration.ofSeconds(3);
        androidTapActions.longTap(driver, webElement, duration);

        verify(driver, times(1)).executeScript("mobile: longClickGesture", Map.of("elementId", webElement.getId(), "duration", duration.getSeconds() * 1000));
    }
}