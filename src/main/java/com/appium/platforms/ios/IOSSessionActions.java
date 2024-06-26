package com.appium.platforms.ios;

import com.appium.interfaces.SessionActionsInterface;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

/**
 * A class that implements the SessionActionsInterface for iOS platform.
 * It provides methods to manage the app session on an iOS device using Appium.
 */
public class IOSSessionActions implements SessionActionsInterface {

    /**
     * Terminates the app on the iOS device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the bundleId of the app to be terminated.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-terminateapp">XCUITest - terminateApp</a>
     */
    @Override
    public void terminateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: terminateApp", Map.of("bundleId", appId));
    }

    /**
     * Terminates the app on the iOS device with a specified timeout.
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param appId   the bundleId of the app to be terminated.
     * @param timeout the timeout in seconds after which the app will be terminated. <b>Currently not supported on the iOS platform.</b>
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-terminateapp">XCUITest - terminateApp</a>
     */
    @Override
    public void terminateApp(AppiumDriver driver, String appId, int timeout) {
        driver.executeScript("mobile: terminateApp", Map.of("bundleId", appId));
    }

    /**
     * Activates the app on the iOS device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the bundleId of the app to be activated.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-activateapp">XCUITest - activateApp</a>
     */
    @Override
    public void activateApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: activateApp", Map.of("bundleId", appId));
    }

    /**
     * Checks if the app is installed on the iOS device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the bundleId of the app to be checked.
     * @return true if the app is installed, false otherwise.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-isappinstalled">XCUITest - isAppInstalled</a>
     */
    @Override
    public boolean isAppInstalled(AppiumDriver driver, String appId) {
        return (boolean) driver.executeScript("mobile: isAppInstalled", Map.of("bundleId", appId));
    }

    /**
     * Removes the app from the iOS device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the bundleId of the app to be removed.
     * @return true if the app was successfully removed, false otherwise.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-removeapp">XCUITest - removeApp</a>
     */
    @Override
    public boolean removeApp(AppiumDriver driver, String appId) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("bundleId", appId));
    }

    /**
     * Removes the app from the iOS device with a specified timeout.
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param appId   the bundleId of the app to be removed.
     * @param timeout the timeout in seconds after which the app will be removed. <b>Currently not supported on the iOS platform.</b>
     * @return true if the app was successfully removed, false otherwise.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-removeapp">XCUITest - removeApp</a>
     */
    @Override
    public boolean removeApp(AppiumDriver driver, String appId, int timeout) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("bundleId", appId));
    }

    /**
     * Removes the app from the iOS device with an option to keep the app data.
     *
     * @param driver   the AppiumDriver instance to interact with the device.
     * @param appId    the bundleId of the app to be removed.
     * @param keepData a boolean value indicating whether to keep the app data or not. <b>Currently not supported on the iOS platform.</b>
     * @return true if the app was successfully removed, false otherwise.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-removeapp">XCUITest - removeApp</a>
     */
    @Override
    public boolean removeApp(AppiumDriver driver, String appId, boolean keepData) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("bundleId", appId));
    }

    /**
     * Removes the app from the iOS device with a specified timeout and an option to keep the app data.
     *
     * @param driver   the AppiumDriver instance to interact with the device.
     * @param appId    the bundleId of the app to be removed.
     * @param timeout  the timeout in seconds after which the app will be removed. <b>Currently not supported on the iOS platform.</b>
     * @param keepData a boolean value indicating whether to keep the app data or not. <b>Currently not supported on the iOS platform.</b>
     * @return true if the app was successfully removed, false otherwise.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-removeapp">XCUITest - removeApp</a>
     */
    @Override
    public boolean removeApp(AppiumDriver driver, String appId, int timeout, boolean keepData) {
        return (boolean) driver.executeScript("mobile: removeApp", Map.of("bundleId", appId));
    }

    /**
     * Installs the app on the iOS device.
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param appPath the path of the app to be installed.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-installapp">XCUITest - installApp</a>
     */
    @Override
    public void installApp(AppiumDriver driver, String appPath) {
        driver.executeScript("mobile: installApp", Map.of("app", appPath));
    }

    /**
     * Installs the app on the iOS device with an option to check the app version.
     *
     * @param driver       the AppiumDriver instance to interact with the device.
     * @param appPath      the path of the app to be installed.
     * @param checkVersion if set to true, it will make xcuitest driver to verify whether the app version currently installed on the device under test is older than the one, which is provided as app value.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-installapp">XCUITest - installApp</a>
     */
    @Override
    public void installApp(AppiumDriver driver, String appPath, boolean checkVersion) {
        driver.executeScript("mobile: installApp", Map.of("app", appPath, "checkVersion", checkVersion));
    }

    /**
     * Installs the app on the iOS device with a specified timeout.
     *
     * @param driver  the AppiumDriver instance to interact with the device.
     * @param appPath the path of the app to be installed.
     * @param timeout The maximum time to wait until app install is finished in milliseconds on real devices. If the capability is not provided then equals to 240000ms.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-installapp">XCUITest - installApp</a>
     */
    @Override
    public void installApp(AppiumDriver driver, String appPath, int timeout) {
        driver.executeScript("mobile: installApp", Map.of("app", appPath, "timeoutMs", timeout));
    }

    /**
     * Installs the app on the iOS device with a specified timeout and an option to check the app version.
     *
     * @param driver       the AppiumDriver instance to interact with the device.
     * @param appPath      the path of the app to be installed.
     * @param checkVersion if set to true, it will make xcuitest driver to verify whether the app version currently installed on the device under test is older than the one, which is provided as app value.
     * @param timeout      The maximum time to wait until app install is finished in milliseconds on real devices. If the capability is not provided then equals to 240000ms.
     * @link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-installapp">XCUITest - installApp</a>
     */
    @Override
    public void installApp(AppiumDriver driver, String appPath, boolean checkVersion, int timeout) {
        driver.executeScript("mobile: installApp", Map.of("app", appPath, "checkVersion", checkVersion, "timeoutMs", timeout));
    }

    /**
     * Clears the app data on the iOS device.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     * @param appId  the bundleId of the app to be cleared.
     * @link <a href="@link <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-installapp">XCUITest - installApp</a>">XCUITest - clearApp</a>
     */
    @Override
    public void clearApp(AppiumDriver driver, String appId) {
        driver.executeScript("mobile: clearApp", Map.of("bundleId", appId));
    }
}