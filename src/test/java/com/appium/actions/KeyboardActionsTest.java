package com.appium.actions;

import com.appium.platforms.android.AndroidKeyboardActions;
import com.appium.platforms.ios.IOSKeyboardActions;
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

class KeyboardActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private Capabilities capabilities;

    private KeyboardActions keyboardActions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(driver.getCapabilities()).thenReturn(capabilities);
    }

    @DisplayName("Should return a instance of AndroidKeyboardActions when platform is Android")
    @Test
    void testAndroidPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.ANDROID);

        keyboardActions = new KeyboardActions(driver);

        assertInstanceOf(AndroidKeyboardActions.class, keyboardActions.keyboardActionsPlatform);
    }

    @DisplayName("Should return a instance of IOSKeyboardActions when platform is iOS")
    @Test
    void testIOSPlatformActions() {
        when(capabilities.getPlatformName()).thenReturn(Platform.IOS);

        keyboardActions = new KeyboardActions(driver);

        assertInstanceOf(IOSKeyboardActions.class, keyboardActions.keyboardActionsPlatform);
    }
}
