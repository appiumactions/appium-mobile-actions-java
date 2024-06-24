package com.appium.actions;

import com.appium.platforms.android.AndroidTapActions;
import com.appium.platforms.ios.IOSTapActions;
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

class TapActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private Capabilities capabilities;

    private TapActions tapActions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(driver.getCapabilities()).thenReturn(capabilities);
    }

    @DisplayName("Should return a instance of AndroidTapActions when platform is Android")
    @Test
    void testAndroidPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.ANDROID);

        tapActions = new TapActions(driver);

        assertInstanceOf(AndroidTapActions.class, tapActions.tapActionsPlatform);
    }

    @DisplayName("Should return a instance of IOSTapActions when platform is iOS")
    @Test
    void testIOSPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.IOS);

        tapActions = new TapActions(driver);

        assertInstanceOf(IOSTapActions.class, tapActions.tapActionsPlatform);
    }
}