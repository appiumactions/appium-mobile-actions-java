package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

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

    @DisplayName("Should call batteryInfo method")
    @Test
    void testBatteryInfo() {
        deviceActionsInterface.batteryInfo(driver);
        verify(deviceActionsInterface, times(1)).batteryInfo(driver);
    }

    @DisplayName("Should call deviceInfo method")
    @Test
    void testDeviceInfo() {
        deviceActionsInterface.deviceInfo(driver);
        verify(deviceActionsInterface, times(1)).deviceInfo(driver);
    }

    @DisplayName("Should call pushFile method")
    @Test
    void testPushFile() {
        deviceActionsInterface.pushFile(driver, "remotePath", "payload");
        verify(deviceActionsInterface, times(1)).pushFile(driver, "remotePath", "payload");
    }

    @DisplayName("Should call pullFile method")
    @Test
    void testPullFile() {
        deviceActionsInterface.pullFile(driver, "remotePath");
        verify(deviceActionsInterface, times(1)).pullFile(driver, "remotePath");
    }

    @DisplayName("Should call pullFolder method")
    @Test
    void testPullFolder() {
        deviceActionsInterface.pullFolder(driver, "remotePath");
        verify(deviceActionsInterface, times(1)).pullFolder(driver, "remotePath");
    }

    @DisplayName("Should call deleteFile method")
    @Test
    void testDeleteFile() {
        deviceActionsInterface.deleteFile(driver, "remotePath");
        verify(deviceActionsInterface, times(1)).deleteFile(driver, "remotePath");
    }

    @DisplayName("Should call setConnectivity method")
    @Test
    void testSetConnectivity() {
        deviceActionsInterface.setConnectivity(driver, true, true, true);
        verify(deviceActionsInterface, times(1)).setConnectivity(driver, true, true, true);
    }

    @DisplayName("Should call getConnectivity method")
    @Test
    void testGetConnectivity() {
        deviceActionsInterface.getConnectivity(driver);
        verify(deviceActionsInterface, times(1)).getConnectivity(driver);
    }

    @DisplayName("Should call getConnectivity method with service")
    @Test
    void testGetConnectivityWithService() {
        deviceActionsInterface.getConnectivity(driver, "wifi");
        verify(deviceActionsInterface, times(1)).getConnectivity(driver, "wifi");
    }

    @DisplayName("Should call getConnectivity method with services")
    @Test
    void testGetConnectivityWithServices() {
        deviceActionsInterface.getConnectivity(driver, List.of("wifi", "data"));
        verify(deviceActionsInterface, times(1)).getConnectivity(driver, List.of("wifi", "data"));
    }
}