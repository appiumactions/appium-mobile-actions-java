package com.appium.platforms.ios;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class IOSDeviceActionsTest {

    @Mock
    private AppiumDriver driver;

    private IOSDeviceActions iosDeviceActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        iosDeviceActions = new IOSDeviceActions();
    }

    @DisplayName("Should call lock method")
    @Test
    void testLockWithoutSeconds() {
        iosDeviceActions.lock(driver);
        verify(driver, times(1)).executeScript("mobile: lock");
    }

    @DisplayName("Should call lock method with seconds")
    @Test
    void testLockWithSeconds() {
        iosDeviceActions.lock(driver, 10);
        verify(driver, times(1)).executeScript("mobile: lock", Map.of("seconds", 10));
    }

    @DisplayName("Should call unlock method")
    @Test
    void testUnlock() {
        iosDeviceActions.unlock(driver, "1234", "pin");
        verify(driver, times(1)).executeScript("mobile: unlock");
    }

    @DisplayName("Should call unlock with strategy method")
    @Test
    void testUnlockStrategy() {
        iosDeviceActions.unlock(driver, "1234", "pin", "simple");
        verify(driver, times(1)).executeScript("mobile: unlock");
    }

    @DisplayName("Should call unlock with timeoutMs method")
    @Test
    void testUnlockTimeoutMs() {
        iosDeviceActions.unlock(driver, "1234", "pin", 1000);
        verify(driver, times(1)).executeScript("mobile: unlock");
    }

    @DisplayName("Should call unlock with strategy and timeout method")
    @Test
    void testUnlockStrategyTimeoutMs() {
        iosDeviceActions.unlock(driver, "1234", "pin", "simple", 1000);
        verify(driver, times(1)).executeScript("mobile: unlock");
    }

    @DisplayName("Should return true if device is locked")
    @Test
    void testIsLockedTrue() {
        when(driver.executeScript("mobile: isLocked")).thenReturn(true);
        assertTrue(iosDeviceActions.isLocked(driver));
        verify(driver, times(1)).executeScript("mobile: isLocked");
    }

    @DisplayName("Should return false if device is not locked")
    @Test
    void testIsLockedFalse() {
        when(driver.executeScript("mobile: isLocked")).thenReturn(false);
        assertFalse(iosDeviceActions.isLocked(driver));
        verify(driver, times(1)).executeScript("mobile: isLocked");
    }
}