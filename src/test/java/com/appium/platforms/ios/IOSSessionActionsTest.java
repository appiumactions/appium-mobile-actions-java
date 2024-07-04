package com.appium.platforms.ios;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class IOSSessionActionsTest {

    @Mock
    private AppiumDriver driver;

    private IOSSessionActions iosSessionActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        iosSessionActions = new IOSSessionActions();
    }

    @DisplayName("Should execute the installApp script for iOS")
    @Test
    void testInstallApp() {
        iosSessionActions.installApp(driver, "/path/to/app.ipa");

        verify(driver).executeScript("mobile: installApp", Map.of("app", "/path/to/app.ipa"));
    }

    @DisplayName("Should execute the installApp script for iOS with checkVersion")
    @Test
    void testInstallAppWithCheckVersion() {
        iosSessionActions.installApp(driver, "/path/to/app.ipa", true);

        verify(driver).executeScript("mobile: installApp", Map.of("app", "/path/to/app.ipa", "checkVersion", true));
    }

    @DisplayName("Should execute the installApp script for iOS with timeout")
    @Test
    void testInstallAppWithTimeout() {
        iosSessionActions.installApp(driver, "/path/to/app.ipa", 5000);

        verify(driver).executeScript("mobile: installApp", Map.of("app", "/path/to/app.ipa", "timeoutMs", 5000));
    }

    @DisplayName("Should execute the installApp script for iOS with checkVersion and timeout")
    @Test
    void testInstallAppWithCheckVersionAndTimeout() {
        iosSessionActions.installApp(driver, "/path/to/app.ipa", true, 5000);

        verify(driver).executeScript("mobile: installApp", Map.of("app", "/path/to/app.ipa", "checkVersion", true, "timeoutMs", 5000));
    }

    @DisplayName("Should execute the terminateApp script for iOS")
    @Test
    void testTerminateApp() {
        iosSessionActions.terminateApp(driver, "com.example.app");

        verify(driver).executeScript("mobile: terminateApp", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the terminateApp script for iOS with timeout")
    @Test
    void testTerminateAppWithTimeout() {
        iosSessionActions.terminateApp(driver, "com.example.app", 5000);

        verify(driver).executeScript("mobile: terminateApp", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the activateApp script for iOS")
    @Test
    void testActivateApp() {
        iosSessionActions.activateApp(driver, "com.example.app");

        verify(driver).executeScript("mobile: activateApp", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the isAppInstalled script for iOS")
    @Test
    void testIsAppInstalled() {
        when(driver.executeScript("mobile: isAppInstalled", Map.of("bundleId", "com.example.app"))).thenReturn(true);

        boolean isInstalled = iosSessionActions.isAppInstalled(driver, "com.example.app");

        assertTrue(isInstalled);
        verify(driver).executeScript("mobile: isAppInstalled", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the removeApp script for iOS")
    @Test
    void testRemoveApp() {
        when(driver.executeScript("mobile: removeApp", Map.of("bundleId", "com.example.app"))).thenReturn(true);

        boolean isRemoved = iosSessionActions.removeApp(driver, "com.example.app");

        assertTrue(isRemoved);
        verify(driver).executeScript("mobile: removeApp", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the removeApp script for iOS with timeout")
    @Test
    void testRemoveAppWithTimeout() {
        when(driver.executeScript("mobile: removeApp", Map.of("bundleId", "com.example.app"))).thenReturn(true);

        boolean isRemoved = iosSessionActions.removeApp(driver, "com.example.app", 5000);

        assertTrue(isRemoved);
        verify(driver).executeScript("mobile: removeApp", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the removeApp script for iOS with keepData")
    @Test
    void testRemoveAppWithKeepData() {
        when(driver.executeScript("mobile: removeApp", Map.of("bundleId", "com.example.app"))).thenReturn(true);

        boolean isRemoved = iosSessionActions.removeApp(driver, "com.example.app", true);

        assertTrue(isRemoved);
        verify(driver).executeScript("mobile: removeApp", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the removeApp script for iOS with keepData and timeout")
    @Test
    void testRemoveAppWithKeepDataAndTimeout() {
        when(driver.executeScript("mobile: removeApp", Map.of("bundleId", "com.example.app"))).thenReturn(true);

        boolean isRemoved = iosSessionActions.removeApp(driver, "com.example.app", 5000, true);

        assertTrue(isRemoved);
        verify(driver).executeScript("mobile: removeApp", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the clearApp script for iOS")
    @Test
    void testClearApp() {
        iosSessionActions.clearApp(driver, "com.example.app");

        verify(driver).executeScript("mobile: clearApp", Map.of("bundleId", "com.example.app"));
    }

    @DisplayName("Should execute the backgroundApp script for iOS")
    @Test
    void testBackgroundApp() {
        iosSessionActions.backgroundApp(driver, 5);

        verify(driver).executeScript("mobile: backgroundApp", Map.of("seconds", 5));
    }

    @DisplayName("Should execute the acceptAlert script for iOS")
    @Test
    void testAcceptAlert() {
        iosSessionActions.acceptAlert(driver);

        verify(driver).executeScript("mobile: alert", Map.of("action", "accept"));
    }

    @DisplayName("Should execute the acceptAlert script for iOS with button label")
    @Test
    void testAcceptAlertWithButtonLabel() {
        iosSessionActions.acceptAlert(driver, "OK");

        verify(driver).executeScript("mobile: alert", Map.of("action", "accept", "buttonLabel", "OK"));
    }

    @DisplayName("Should execute the dismissAlert script for iOS")
    @Test
    void testDismissAlert() {
        iosSessionActions.dismissAlert(driver);

        verify(driver).executeScript("mobile: alert", Map.of("action", "dismiss"));
    }

    @DisplayName("Should execute the dismissAlert script for iOS with button label")
    @Test
    void testDismissAlertWithButtonLabel() {
        iosSessionActions.dismissAlert(driver, "Cancel");

        verify(driver).executeScript("mobile: alert", Map.of("action", "dismiss", "buttonLabel", "Cancel"));
    }
}
