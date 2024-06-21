package com.appium.actions;

import com.appium.exceptions.PlatformException;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

class BaseActionsTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private Capabilities capabilities;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(driver.getCapabilities()).thenReturn(capabilities);
    }

    @DisplayName("Should throws a PlatformException when the platform is Windows")
    @Test()
    void testBaseActionsConstructorSetsPlatformWindows() {
        when(capabilities.getPlatformName()).thenReturn(Platform.WINDOWS);

        assertThrows(PlatformException.class, () -> new BaseActions(driver));
    }

    @DisplayName("Should throws a PlatformException when the platform is Mac")
    @Test()
    void testBaseActionsConstructorSetsPlatformMac() {
        when(capabilities.getPlatformName()).thenReturn(Platform.MAC);

        assertThrows(PlatformException.class, () -> new BaseActions(driver));
    }

    @DisplayName("Should return a BaseActions object when the platform is Android")
    @Test
    void testBaseActionsConstructorSetsPlatformAndroid() {
        when(capabilities.getPlatformName()).thenReturn(Platform.ANDROID);

        BaseActions baseActions = new BaseActions(driver);

        assertEquals(Platform.ANDROID, baseActions.platform);
    }

    @DisplayName("Should return a BaseActions object when the platform is iOS")
    @Test
    void testBaseActionsConstructorSetsPlatformIOS() {
        when(capabilities.getPlatformName()).thenReturn(Platform.IOS);

        BaseActions baseActions = new BaseActions(driver);

        assertEquals(Platform.IOS, baseActions.platform);
    }
}