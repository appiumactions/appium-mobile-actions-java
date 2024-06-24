package com.appium.actions;

import com.appium.platforms.android.AndroidSessionActions;
import com.appium.platforms.ios.IOSSessionActions;
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

class SessionActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private Capabilities capabilities;

    private SessionActions sessionActions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(driver.getCapabilities()).thenReturn(capabilities);
    }

    @DisplayName("Should return a instance of AndroidSessionActions when platform is Android")
    @Test
    void testAndroidPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.ANDROID);

        sessionActions = new SessionActions(driver);

        assertInstanceOf(AndroidSessionActions.class, sessionActions.sessionActionsPlatform);
    }

    @DisplayName("Should return a instance of IOSSessionActions when platform is iOS")
    @Test
    void testIOSPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.IOS);

        sessionActions = new SessionActions(driver);

        assertInstanceOf(IOSSessionActions.class, sessionActions.sessionActionsPlatform);
    }
}