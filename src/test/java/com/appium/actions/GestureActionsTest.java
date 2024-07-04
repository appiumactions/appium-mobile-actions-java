package com.appium.actions;

import com.appium.platforms.android.AndroidGestureActions;
import com.appium.platforms.ios.IOSGestureActions;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.mockito.Mockito.when;

class GestureActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private Capabilities capabilities;

    private GestureActions gestureActions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(driver.getCapabilities()).thenReturn(capabilities);
    }

    @DisplayName("Should return a instance of AndroidScrollActions when platform is Android")
    @Test
    void testAndroidPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.ANDROID);

        gestureActions = new GestureActions(driver);

        assertInstanceOf(AndroidGestureActions.class, gestureActions.gestureActionsPlatform);
    }

    @DisplayName("Should return a instance of IOSScrollActions when platform is iOS")
    @Test
    void testIOSPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.IOS);

        gestureActions = new GestureActions(driver);

        assertInstanceOf(IOSGestureActions.class, gestureActions.gestureActionsPlatform);
    }
}