package com.appium.platforms.android;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Duration;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AndroidSessionActionsTest {

    @Mock
    private AppiumDriver driver;

    private AndroidSessionActions androidSessionActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        androidSessionActions = new AndroidSessionActions();
    }

    @DisplayName("Should execute the installApp script for Android")
    @Test
    void testInstallApp() {
        androidSessionActions.installApp(driver, "/path/to/app.apk");

        verify(driver).executeScript("mobile: installApp", Map.of("appPath", "/path/to/app.apk"));
    }

    @DisplayName("Should execute the installApp script for Android with checkVersion")
    @Test
    void testInstallAppWithCheckVersion() {
        androidSessionActions.installApp(driver, "/path/to/app.apk", true);

        verify(driver).executeScript("mobile: installApp", Map.of("appPath", "/path/to/app.apk", "checkVersion", true));
    }

    @DisplayName("Should execute the installApp script for Android with timeout")
    @Test
    void testInstallAppWithTimeout() {
        androidSessionActions.installApp(driver, "/path/to/app.apk", 5000);

        verify(driver).executeScript("mobile: installApp", Map.of("appPath", "/path/to/app.apk", "timeout", 5000));
    }

    @DisplayName("Should execute the installApp script for Android with checkVersion and timeout")
    @Test
    void testInstallAppWithCheckVersionAndTimeout() {
        androidSessionActions.installApp(driver, "/path/to/app.apk", true, 5000);

        verify(driver).executeScript("mobile: installApp", Map.of("appPath", "/path/to/app.apk", "checkVersion", true, "timeout", 5000));
    }

    @DisplayName("Should execute the terminateApp script for Android")
    @Test
    void testTerminateApp() {
        androidSessionActions.terminateApp(driver, "com.example");

        verify(driver).executeScript("mobile: terminateApp", Map.of("appId", "com.example"));
    }

    @DisplayName("Should execute the terminateApp script for Android with timeout")
    @Test
    void testTerminateAppWithTimeout() {
        androidSessionActions.terminateApp(driver, "com.example", 5000);

        verify(driver).executeScript("mobile: terminateApp", Map.of("appId", "com.example", "timeout", 5000));
    }

    @DisplayName("Should execute the activateApp script for Android")
    @Test
    void testActivateApp() {
        androidSessionActions.activateApp(driver, "com.example");

        verify(driver).executeScript("mobile: activateApp", Map.of("appId", "com.example"));
    }

    @DisplayName("Should execute the isAppInstalled script for Android")
    @Test
    void testIsAppInstalled() {
        when(driver.executeScript("mobile: isAppInstalled", Map.of("appId", "com.example"))).thenReturn(true);

        boolean isInstalled = androidSessionActions.isAppInstalled(driver, "com.example");

        assertTrue(isInstalled);
        verify(driver).executeScript("mobile: isAppInstalled", Map.of("appId", "com.example"));
    }

    @DisplayName("Should execute the removeApp script for Android")
    @Test
    void testRemoveApp() {
        when(driver.executeScript("mobile: removeApp", Map.of("appId", "com.example"))).thenReturn(true);

        boolean isRemoved = androidSessionActions.removeApp(driver, "com.example");

        assertTrue(isRemoved);
        verify(driver).executeScript("mobile: removeApp", Map.of("appId", "com.example"));
    }

    @DisplayName("Should execute the removeApp script for Android with timeout")
    @Test
    void testRemoveAppWithTimeout() {
        when(driver.executeScript("mobile: removeApp", Map.of("appId", "com.example", "timeout", 5000))).thenReturn(true);

        boolean isRemoved = androidSessionActions.removeApp(driver, "com.example", 5000);

        assertTrue(isRemoved);
        verify(driver).executeScript("mobile: removeApp", Map.of("appId", "com.example", "timeout", 5000));
    }

    @DisplayName("Should execute the removeApp script for Android with keepData")
    @Test
    void testRemoveAppWithKeepData() {
        when(driver.executeScript("mobile: removeApp", Map.of("appId", "com.example", "keepData", true))).thenReturn(true);

        boolean isRemoved = androidSessionActions.removeApp(driver, "com.example", true);

        assertTrue(isRemoved);
        verify(driver).executeScript("mobile: removeApp", Map.of("appId", "com.example", "keepData", true));
    }

    @DisplayName("Should execute the removeApp script for Android with keepData and timeout")
    @Test
    void testRemoveAppWithKeepDataAndTimeout() {
        when(driver.executeScript("mobile: removeApp", Map.of("appId", "com.example", "timeout", 5000, "keepData", true))).thenReturn(true);

        boolean isRemoved = androidSessionActions.removeApp(driver, "com.example", 5000, true);

        assertTrue(isRemoved);
        verify(driver).executeScript("mobile: removeApp", Map.of("appId", "com.example", "timeout", 5000, "keepData", true));
    }

    @DisplayName("Should execute the clearApp script for Android")
    @Test
    void testClearApp() {
        androidSessionActions.clearApp(driver, "com.example");

        verify(driver).executeScript("mobile: clearApp", Map.of("appId", "com.example"));
    }

    @DisplayName("Should execute the backgroundApp script for Android")
    @Test
    void testBackgroundApp() {
        androidSessionActions.backgroundApp(driver, 5);

        verify(driver).executeScript("mobile: backgroundApp", Map.of("seconds", 5));
    }

    @DisplayName("Should execute the acceptAlert script for Android")
    @Test
    void testAcceptAlert() {
        androidSessionActions.acceptAlert(driver);

        verify(driver).executeScript("mobile: acceptAlert");
    }

    @DisplayName("Should execute the acceptAlert script for Android with button label")
    @Test
    void testAcceptAlertWithButtonLabel() {
        androidSessionActions.acceptAlert(driver, "OK");

        verify(driver).executeScript("mobile: acceptAlert", Map.of("buttonLabel", "OK"));
    }

    @DisplayName("Should execute the dismissAlert script for Android")
    @Test
    void testDismissAlert() {
        androidSessionActions.dismissAlert(driver);

        verify(driver).executeScript("mobile: dismissAlert");
    }

    @DisplayName("Should execute the dismissAlert script for Android with button label")
    @Test
    void testDismissAlertWithButtonLabel() {
        androidSessionActions.dismissAlert(driver, "Cancel");

        verify(driver).executeScript("mobile: dismissAlert", Map.of("buttonLabel", "Cancel"));
    }

    @DisplayName("Should execute the deepLink script for Android")
    @Test
    void testDeepLink() {
        androidSessionActions.deepLink(driver, "example://path", "com.mycompany.myapp");

        verify(driver).executeScript("mobile: deepLink", Map.of("url", "example://path", "package", "com.mycompany.myapp"));
    }

    @DisplayName("Should execute the deepLink script for Android with waitForLaunch")
    @Test
    void testDeepLinkWithWaitForLaunch() {
        androidSessionActions.deepLink(driver, "example://path", "com.mycompany.myapp", true);

        verify(driver).executeScript("mobile: deepLink", Map.of("url", "example://path", "package", "com.mycompany.myapp", "waitForLaunch", true));
    }
}