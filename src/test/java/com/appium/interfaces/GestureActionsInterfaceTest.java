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

class GestureActionsInterfaceTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private WebElement webElement;

    private GestureActionsInterface gestureActions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        gestureActions = mock(GestureActionsInterface.class);
    }

    @DisplayName("Should call tap method")
    @Test
    void testTap() {
        gestureActions.tap(driver, webElement);
        verify(gestureActions, times(1)).tap(driver, webElement);
    }

    @DisplayName("Should call doubleTap method")
    @Test
    void testDoubleTap() {
        gestureActions.doubleTap(driver, webElement);
        verify(gestureActions, times(1)).doubleTap(driver, webElement);
    }

    @DisplayName("Should call longTap method")
    @Test
    void testLongTap() {
        gestureActions.longTap(driver, webElement, Duration.ofSeconds(3));
        verify(gestureActions, times(1)).longTap(driver, webElement, Duration.ofSeconds(3));
    }
}