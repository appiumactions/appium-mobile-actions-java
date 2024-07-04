package com.appium;

import com.appium.actions.*;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

class AppiumActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private Capabilities capabilities;

    private AppiumActions appiumActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        when(driver.getCapabilities()).thenReturn(capabilities);
        when(driver.getCapabilities().getPlatformName()).thenReturn(Platform.ANDROID);

        appiumActions = new AppiumActions(driver);
    }

    @DisplayName("Should throws a IllegalArgumentException when driver is null")
    @Test
    void testDriverNull() {
        assertThrows(IllegalArgumentException.class, () -> new AppiumActions(null));
    }

    @DisplayName("Should return a instance of DeviceActions")
    @Test
    void testDeviceActions() {
        DeviceActions deviceActions = appiumActions.device;

        assertInstanceOf(DeviceActions.class, deviceActions);
    }

    @DisplayName("Should return a instance of SessionActions")
    @Test
    void testSessionActions() {
        SessionActions sessionActions = appiumActions.session;

        assertInstanceOf(SessionActions.class, sessionActions);
    }

    @DisplayName("Should return a instance of GestureActions")
    @Test
    void testGestureActions() {
        GestureActions gestureActions = appiumActions.gesture;

        assertInstanceOf(GestureActions.class, gestureActions);
    }

    @DisplayName("Should return a instance of TapActions")
    @Test
    void testTapActions() {
        TapActions tapActions = appiumActions.tap;

        assertInstanceOf(TapActions.class, tapActions);
    }

    @DisplayName("Should return a instance of KeyboardActions")
    @Test
    void testKeyboardActions() {
        KeyboardActions keyboardActions = appiumActions.keyboard;

        assertInstanceOf(KeyboardActions.class, keyboardActions);
    }
}
