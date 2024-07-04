package com.appium.platforms.android;

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

class AndroidDeviceActionsTest {

    @Mock
    private AppiumDriver driver;

    private AndroidDeviceActions androidDeviceActions;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        androidDeviceActions = new AndroidDeviceActions();
    }

    @DisplayName("Should call lock method")
    @Test
    void testLockWithoutSeconds() {
        androidDeviceActions.lock(driver);
        verify(driver, times(1)).executeScript("mobile: lock");
    }

    @DisplayName("Should call lock method with seconds")
    @Test
    void testLockWithSeconds() {
        androidDeviceActions.lock(driver, 10);
        verify(driver, times(1)).executeScript("mobile: lock", Map.of("seconds", 10));
    }

    @DisplayName("Should call unlock method")
    @Test
    void testUnlock() {
        androidDeviceActions.unlock(driver, "1234", "pin");
        verify(driver, times(1)).executeScript("mobile: unlock", Map.of("key", "1234", "type", "pin"));
    }

    @DisplayName("Should call unlock method with strategy")
    @Test
    void testUnlockWithStrategy() {
        androidDeviceActions.unlock(driver, "1234", "pin", "strategy");
        verify(driver, times(1)).executeScript("mobile: unlock", Map.of("key", "1234", "type", "pin", "strategy", "strategy"));
    }

    @DisplayName("Should call unlock method with timeout")
    @Test
    void testUnlockWithTimeout() {
        androidDeviceActions.unlock(driver, "1234", "pin", 5000);
        verify(driver, times(1)).executeScript("mobile: unlock", Map.of("key", "1234", "type", "pin", "timeoutMs", 5000));
    }

    @DisplayName("Should call unlock method with strategy and timeout")
    @Test
    void testUnlockWithStrategyAndTimeout() {
        androidDeviceActions.unlock(driver, "1234", "pin", "strategy", 5000);
        verify(driver, times(1)).executeScript("mobile: unlock", Map.of("key", "1234", "type", "pin", "strategy", "strategy", "timeoutMs", 5000));
    }

    @DisplayName("Should return true if device is locked")
    @Test
    void testIsLockedTrue() {
        when(driver.executeScript("mobile: isLocked")).thenReturn(true);
        assertTrue(androidDeviceActions.isLocked(driver));
        verify(driver, times(1)).executeScript("mobile: isLocked");
    }

    @DisplayName("Should return false if device is locked")
    @Test
    void testIsLockedFalse() {
        when(driver.executeScript("mobile: isLocked")).thenReturn(false);
        assertFalse(androidDeviceActions.isLocked(driver));
        verify(driver, times(1)).executeScript("mobile: isLocked");
    }
}