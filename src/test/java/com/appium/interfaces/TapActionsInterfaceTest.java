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

    private TapActionsInterface tapActions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        tapActions = mock(TapActionsInterface.class);
    }

    @DisplayName("Should call tap method")
    @Test
    void testTap() {
        tapActions.tap(driver, webElement);
        verify(tapActions, times(1)).tap(driver, webElement);
    }

    @DisplayName("Should call doubleTap method")
    @Test
    void testDoubleTap() {
        tapActions.doubleTap(driver, webElement);
        verify(tapActions, times(1)).doubleTap(driver, webElement);
    }

    @DisplayName("Should call longTap method")
    @Test
    void testLongTap() {
        tapActions.longTap(driver, webElement, Duration.ofSeconds(3));
        verify(tapActions, times(1)).longTap(driver, webElement, Duration.ofSeconds(3));
    }
}