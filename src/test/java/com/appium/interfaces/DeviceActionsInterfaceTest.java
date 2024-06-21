package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class DeviceActionsInterfaceTest {

    @Mock
    private AppiumDriver driver;

    private DeviceActionsInterface deviceActionsInterface;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        deviceActionsInterface = mock(DeviceActionsInterface.class);
    }

    @DisplayName("Should call lock method")
    @Test
    void testLock() {
        deviceActionsInterface.lock(driver);
        verify(deviceActionsInterface, times(1)).lock(driver);
    }

    @DisplayName("Should call lock method with seconds")
    @Test
    void testLockWithSeconds() {
        deviceActionsInterface.lock(driver, 10);
        verify(deviceActionsInterface, times(1)).lock(driver, 10);
    }

    @DisplayName("Should call unlock method")
    @Test
    void testUnlock() {
        deviceActionsInterface.unlock(driver, "key", "type");
        verify(deviceActionsInterface, times(1)).unlock(driver, "key", "type");
    }

    @DisplayName("Should call unlock method with strategy")
    @Test
    void testUnlockWithStrategy() {
        deviceActionsInterface.unlock(driver, "key", "type", "strategy");
        verify(deviceActionsInterface, times(1)).unlock(driver, "key", "type", "strategy");
    }

    @DisplayName("Should call unlock method with timeout")
    @Test
    void testUnlockWithTimeout() {
        deviceActionsInterface.unlock(driver, "key", "type", 1000);
        verify(deviceActionsInterface, times(1)).unlock(driver, "key", "type", 1000);
    }

    @DisplayName("Should call unlock method with strategy and timeout")
    @Test
    void testUnlockWithStrategyAndTimeout() {
        deviceActionsInterface.unlock(driver, "key", "type", "strategy", 1000);
        verify(deviceActionsInterface, times(1)).unlock(driver, "key", "type", "strategy", 1000);
    }

    @DisplayName("Should call isLocked method")
    @Test
    void testIsLocked() {
        deviceActionsInterface.isLocked(driver);
        verify(deviceActionsInterface, times(1)).isLocked(driver);
    }
}