package com.appium.actions;

import com.appium.platforms.android.AndroidDeviceActions;
import com.appium.platforms.ios.IOSDeviceActions;
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

class DeviceActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private Capabilities capabilities;

    private DeviceActions deviceActions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(driver.getCapabilities()).thenReturn(capabilities);
    }

    @DisplayName("Should return a instance of AndroidDeviceActions when platform is Android")
    @Test
    void testAndroidPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.ANDROID);

        deviceActions = new DeviceActions(driver);

        assertInstanceOf(AndroidDeviceActions.class, deviceActions.deviceActionsPlatform);
    }

    @DisplayName("Should return a instance of IOSDeviceActions when platform is iOS")
    @Test
    void testIOSPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.IOS);

        deviceActions = new DeviceActions(driver);

        assertInstanceOf(IOSDeviceActions.class, deviceActions.deviceActionsPlatform);
    }
}