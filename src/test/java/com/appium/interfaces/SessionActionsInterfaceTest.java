package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class SessionActionsInterfaceTest {

    @Mock
    private AppiumDriver driver;

    private SessionActionsInterface sessionActions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        sessionActions = mock(SessionActionsInterface.class);
    }

    @DisplayName("Should call terminateApp method")
    @Test
    void testTerminateApp() {
        String appId = "com.example.app";
        sessionActions.terminateApp(driver, appId);
        verify(sessionActions, times(1)).terminateApp(driver, appId);
    }

    @DisplayName("Should call terminateApp method with timeout")
    @Test
    void testTerminateAppWithTimeout() {
        String appId = "com.example.app";
        int timeout = 5000;
        sessionActions.terminateApp(driver, appId, timeout);
        verify(sessionActions, times(1)).terminateApp(driver, appId, timeout);
    }

    @DisplayName("Should call activateApp method")
    @Test
    void testActivateApp() {
        String appId = "com.example.app";
        sessionActions.activateApp(driver, appId);
        verify(sessionActions, times(1)).activateApp(driver, appId);
    }

    @DisplayName("Should call isAppInstalled method")
    @Test
    void testIsAppInstalled() {
        String appId = "com.example.app";
        sessionActions.isAppInstalled(driver, appId);
        verify(sessionActions, times(1)).isAppInstalled(driver, appId);
    }

    @DisplayName("Should call removeApp method")
    @Test
    void testRemoveApp() {
        String appId = "com.example.app";
        sessionActions.removeApp(driver, appId);
        verify(sessionActions, times(1)).removeApp(driver, appId);
    }

    @DisplayName("Should call removeApp method with timeout")
    @Test
    void testRemoveAppWithTimeout() {
        String appId = "com.example.app";
        int timeout = 5000;
        sessionActions.removeApp(driver, appId, timeout);
        verify(sessionActions, times(1)).removeApp(driver, appId, timeout);
    }

    @DisplayName("Should call removeApp method with keepData")
    @Test
    void testRemoveAppKeepData() {
        String appId = "com.example.app";
        boolean keepData = true;
        sessionActions.removeApp(driver, appId, keepData);
        verify(sessionActions, times(1)).removeApp(driver, appId, keepData);
    }

    @DisplayName("Should call removeApp method with timeout and keepData")
    @Test
    void testRemoveAppWithTimeoutKeepData() {
        String appId = "com.example.app";
        int timeout = 5000;
        boolean keepData = true;
        sessionActions.removeApp(driver, appId, timeout, keepData);
        verify(sessionActions, times(1)).removeApp(driver, appId, timeout, keepData);
    }

    @DisplayName("Should call installApp method")
    @Test
    void testInstallApp() {
        String appPath = "/path/to/app";
        sessionActions.installApp(driver, appPath);
        verify(sessionActions, times(1)).installApp(driver, appPath);
    }

    @DisplayName("Should call installApp method with checkVersion")
    @Test
    void testInstallAppCheckVersion() {
        String appPath = "/path/to/app";
        boolean checkVersion = true;
        sessionActions.installApp(driver, appPath, checkVersion);
        verify(sessionActions, times(1)).installApp(driver, appPath, checkVersion);
    }

    @DisplayName("Should call installApp method with timeout")
    @Test
    void testInstallAppWithTimeout() {
        String appPath = "/path/to/app";
        int timeout = 5000;
        sessionActions.installApp(driver, appPath, timeout);
        verify(sessionActions, times(1)).installApp(driver, appPath, timeout);
    }

    @DisplayName("Should call installApp method with checkVersion and timeout")
    @Test
    void testInstallAppCheckVersionWithTimeout() {
        String appPath = "/path/to/app";
        boolean checkVersion = true;
        int timeout = 5000;
        sessionActions.installApp(driver, appPath, checkVersion, timeout);
        verify(sessionActions, times(1)).installApp(driver, appPath, checkVersion, timeout);
    }

    @DisplayName("Should call clearApp method")
    @Test
    void testClearApp() {
        String appId = "com.example.app";
        sessionActions.clearApp(driver, appId);
        verify(sessionActions, times(1)).clearApp(driver, appId);
    }
}