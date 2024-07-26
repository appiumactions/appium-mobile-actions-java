package com.appium.platforms.android;

import com.appium.interfaces.SessionActionsInterface;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

/**
 * A class that provides methods to manage the session actions on an Android device.
 * The actual implementation of the session actions is platform dependent.
 * This class implements the SessionActionsInterface for Android.
 */
public class AndroidSessionActions implements SessionActionsInterface {

    /**
     * Terminates an app on the device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the appPackage to be terminated.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-terminateapp">UiAutomator2 - terminateApp</a>
     */
    @Override
    public void terminateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: terminateApp", Map.of("appId", appId));
    }

    /**
     * Terminates an app on the device with a specified timeout
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param appId   the appPackage to be terminated.
     * @param timeout the timeout in milliseconds to wait until the app is terminated. 500ms by default.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-terminateapp">UiAutomator2 - terminateApp</a>
     */
    @Override
    public void terminateApp(AppiumDriver driver, String appId, int timeout) {
        driver.executeScript("mobile: terminateApp", Map.of("appId", appId, "timeout", timeout));
    }

    /**
     * Activates an app on the device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the appPackage to be activated.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-activateapp">UiAutomator2 - activateApp</a>
     */
    @Override
    public void activateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: activateApp", Map.of("appId", appId));
    }

    /**
     * Checks if an app is installed on the device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the appPackage to be checked.
     * @return true if the app is installed, false otherwise.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-isappinstalled">UiAutomator2 - isAppInstalled</a>
     */
    @Override
    public boolean isAppInstalled(AppiumDriver driver, String appId) {
        return (boolean) driver.executeScript("mobile: isAppInstalled", Map.of("appId", appId));
    }

    /**
     * Removes an app from the device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the appPackage to be removed.
     * @return true if the app is removed, false otherwise.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-removeapp">UiAutomator2 - removeApp</a>
     */
    @Override
    public boolean removeApp(AppiumDriver driver, String appId) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("appId", appId));
    }

    /**
     * Removes an app from the device with a specified timeout.
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param appId   the appPackage to be removed.
     * @param timeout the timeout in milliseconds to wait until the app is terminated. 20000ms by default.
     * @return true if the app is removed, false otherwise.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-removeapp">UiAutomator2 - removeApp</a>
     */
    @Override
    public boolean removeApp(AppiumDriver driver, String appId, int timeout) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("appId", appId, "timeout", timeout));
    }

    /**
     * Removes an app from the device with an option to keep the app data.
     *
     * @param driver   the AppiumDriver instance to interact with the device.
     * @param appId    the appPackage to be removed.
     * @param keepData set to true in order to keep the application data and cache folders after uninstall.
     * @return true if the app is removed, false otherwise.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-removeapp">UiAutomator2 - removeApp</a>
     */
    @Override
    public boolean removeApp(AppiumDriver driver, String appId, boolean keepData) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("appId", appId, "keepData", keepData));
    }

    /**
     * Removes an app from the device with a specified timeout and an option to keep the app data.
     *
     * @param driver   the AppiumDriver instance to interact with the device.
     * @param appId    the appPackage to be removed.
     * @param timeout  the timeout in milliseconds to wait until the app is terminated. 20000ms by default.
     * @param keepData set to true in order to keep the application data and cache folders after uninstall.
     * @return true if the app is removed, false otherwise.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-removeapp">UiAutomator2 - removeApp</a>
     */
    @Override
    public boolean removeApp(AppiumDriver driver, String appId, int timeout, boolean keepData) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("appId", appId, "timeout", timeout, "keepData", keepData));
    }

    /**
     * Installs an app on the device.
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param appPath the local .apk(s) path on the server filesystem or a remote url.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-installapp">UiAutomator2 - installApp</a>
     */
    @Override
    public void installApp(AppiumDriver driver, String appPath) {
        driver.executeScript("mobile: installApp", Map.of("appPath", appPath));
    }

    /**
     * Installs an app on the device with an option to check the app version.
     *
     * @param driver       the AppiumDriver instance to interact with the device.
     * @param appPath      the local .apk(s) path on the server filesystem or a remote url.
     * @param checkVersion set to true, in order to skip the application installation if the device under test has a greater or equal to the application version.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-installapp">UiAutomator2 - installApp</a>
     */
    @Override
    public void installApp(AppiumDriver driver, String appPath, boolean checkVersion) {
        driver.executeScript("mobile: installApp", Map.of("appPath", appPath, "checkVersion", checkVersion));
    }

    /**
     * Installs an app on the device with a specified timeout.
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param appPath the local .apk(s) path on the server filesystem or a remote url.
     * @param timeout the timeout in milliseconds to wait until the app is installed. 6000ms by default.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-installapp">UiAutomator2 - installApp</a>
     */
    @Override
    public void installApp(AppiumDriver driver, String appPath, int timeout) {
        driver.executeScript("mobile: installApp", Map.of("appPath", appPath, "timeout", timeout));
    }

    /**
     * Installs an app on the device with an option to check the app version and a specified timeout.
     *
     * @param driver       the AppiumDriver instance to interact with the device.
     * @param appPath      the local .apk(s) path on the server filesystem or a remote url.
     * @param checkVersion set to true, in order to skip the application installation if the device under test has a greater or equal to the application version.
     * @param timeout      the timeout in milliseconds to wait until the app is installed. 6000ms by default.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-installapp">UiAutomator2 - installApp</a>
     */
    @Override
    public void installApp(AppiumDriver driver, String appPath, boolean checkVersion, int timeout) {
        driver.executeScript("mobile: installApp", Map.of("appPath", appPath, "checkVersion", checkVersion, "timeout", timeout));
    }

    /**
     * Clears the app data on the device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the appPackage to be cleared.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-clearapp">UiAutomator2 - clearApp</a>
     */
    @Override
    public void clearApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: clearApp", Map.of("appId", appId));
    }

    /**
     * Backgrounds the app on the device.
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param seconds the amount of seconds to wait between putting the app to background and restoring it.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-backgroundapp">UiAutomator2 - backgroundApp</a>
     */
    @Override
    public void backgroundApp(AppiumDriver driver, int seconds) {
        driver.executeScript("mobile: backgroundApp", Map.of("seconds", seconds));
    }

    /**
     * Accepts an alert on the device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-acceptalert">UiAutomator2 - acceptAlert</a>
     */
    @Override
    public void acceptAlert(AppiumDriver driver) {
        driver.executeScript("mobile: acceptAlert");
    }

    /**
     * Accepts an alert on the device with a specified button label.
     *
     * @param driver      the AppiumDriver instance to interact with the device.
     * @param buttonLabel The name/text of the alert button to click in order to accept it.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-acceptalert">UiAutomator2 - acceptAlert</a>
     */
    @Override
    public void acceptAlert(AppiumDriver driver, String buttonLabel) {
        driver.executeScript("mobile: acceptAlert", Map.of("buttonLabel", buttonLabel));
    }

    /**
     * Dismisses an alert on the device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-dismissalert">UiAutomator2 - dismissAlert</a>
     */
    @Override
    public void dismissAlert(AppiumDriver driver) {
        driver.executeScript("mobile: dismissAlert");
    }

    /**
     * Dismisses an alert on the device with a specified button label.
     *
     * @param driver      the AppiumDriver instance to interact with the device.
     * @param buttonLabel The name/text of the alert button to click in order to dismiss it.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-dismissalert">UiAutomator2 - dismissAlert</a>
     */
    @Override
    public void dismissAlert(AppiumDriver driver, String buttonLabel) {
        driver.executeScript("mobile: dismissAlert", Map.of("buttonLabel", buttonLabel));
    }

    /**
     * Opens a deep link on the device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param url    the deep link to open.
     * @param appId  the name of the package to start the URI with.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-deeplink">UiAutomator2 - deepLink</a>
     */
    @Override
    public void deepLink(AppiumDriver driver, String url, String appId) {
        driver.executeScript("mobile: deepLink", Map.of("url", url, "package", appId));
    }

    /**
     * Opens a deep link on the device with an option to wait for the app to launch.
     *
     * @param driver        the AppiumDriver instance to interact with the device.
     * @param url           the deep link to open.
     * @param appId         the name of the package to start the URI with.
     * @param waitForLaunch if false then ADB won't wait for the started activity to return the control. true by default.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-deeplink">UiAutomator2 - deepLink</a>
     */
    @Override
    public void deepLink(AppiumDriver driver, String url, String appId, boolean waitForLaunch) {
        driver.executeScript("mobile: deepLink", Map.of("url", url, "package", appId, "waitForLaunch", waitForLaunch));
    }
}
