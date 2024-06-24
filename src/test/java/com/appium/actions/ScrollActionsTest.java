package com.appium.actions;

import com.appium.platforms.android.AndroidScrollActions;
import com.appium.platforms.ios.IOSScrollActions;
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

class ScrollActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private Capabilities capabilities;

    private ScrollActions scrollActions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(driver.getCapabilities()).thenReturn(capabilities);
    }

    @DisplayName("Should return a instance of AndroidScrollActions when platform is Android")
    @Test
    void testAndroidPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.ANDROID);

        scrollActions = new ScrollActions(driver);

        assertInstanceOf(AndroidScrollActions.class, scrollActions.scrollActionsPlatform);
    }

    @DisplayName("Should return a instance of IOSScrollActions when platform is iOS")
    @Test
    void testIOSPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.IOS);

        scrollActions = new ScrollActions(driver);

        assertInstanceOf(IOSScrollActions.class, scrollActions.scrollActionsPlatform);
    }
}