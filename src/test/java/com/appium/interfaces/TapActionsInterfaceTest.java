package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.mockito.Mockito.*;

class TapActionsInterfaceTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private WebElement webElement;

    private TapActionsInterface gestureActions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        gestureActions = mock(TapActionsInterface.class);
    }

    @DisplayName("Should call tap method with web element")
    @Test
    void testTap() {
        gestureActions.tap(driver, webElement);
        verify(gestureActions, times(1)).tap(driver, webElement);
    }

    @DisplayName("Should call tap method with coordinates")
    @Test
    void testTapCoordinates() {
        gestureActions.tap(driver, 10, 20);
        verify(gestureActions, times(1)).tap(driver, 10, 20);
    }

    @DisplayName("Should call doubleTap method")
    @Test
    void testDoubleTap() {
        gestureActions.doubleTap(driver, webElement);
        verify(gestureActions, times(1)).doubleTap(driver, webElement);
    }

    @DisplayName("Should call doubleTap method with coordinates")
    @Test
    void testDoubleTapCoordinates() {
        gestureActions.doubleTap(driver, 10, 20);
        verify(gestureActions, times(1)).doubleTap(driver, 10, 20);
    }

    @DisplayName("Should call longTap with web element method")
    @Test
    void testLongTapWebElement() {
        gestureActions.longTap(driver, webElement, Duration.ofSeconds(3));
        verify(gestureActions, times(1)).longTap(driver, webElement, Duration.ofSeconds(3));
    }

    @DisplayName("Should call longTap method with coordinates method")
    @Test
    void testLongTapCoordinates() {
        gestureActions.longTap(driver, 10, 20, Duration.ofSeconds(3));
        verify(gestureActions, times(1)).longTap(driver, 10, 20, Duration.ofSeconds(3));
    }
}