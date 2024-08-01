package com.appium.platforms.android;

import com.appium.interfaces.DeviceActionsInterface;
import com.appium.models.BatteryInfoModel;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

/**
 * This class implements the DeviceActionsInterface for Android devices.
 * It provides methods to perform various device actions like lock, unlock, and check if the device is locked.
 */
public class AndroidDeviceActions implements DeviceActionsInterface {

    /**
     * Locks the device.
     *
     * @param driver The Appium driver instance.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-lock">UiAutomator2 - lock</a>
     */
    @Override
    public void lock(AppiumDriver driver) {
        driver.executeScript("mobile: lock");
    }

    /**
     * Locks the device for a specified duration.
     *
     * @param driver  The Appium driver instance.
     * @param seconds The number of seconds after which to unlock the device. Set to 0 or leave it empty to require manual unlock.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-lock">UiAutomator2 - lock</a>
     */
    @Override
    public void lock(AppiumDriver driver, int seconds) {
        driver.executeScript("mobile: lock", Map.of("seconds", seconds));
    }

    /**
     * Unlocks the device.
     *
     * @param driver The Appium driver instance.
     * @param key    The key to unlock the device.
     * @param type   The type of the key.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-unlock">UiAutomator2 - unlock</a>
     */
    @Override
    public void unlock(AppiumDriver driver, String key, String type) {
        driver.executeScript("mobile: unlock", Map.of("key", key, "type", type));
    }

    /**
     * Unlocks the device using a specific strategy.
     *
     * @param driver   The Appium driver instance.
     * @param key      The key to unlock the device.
     * @param type     The type of the key.
     * @param strategy The strategy to use for unlocking.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-unlock">UiAutomator2 - unlock</a>
     */
    @Override
    public void unlock(AppiumDriver driver, String key, String type, String strategy) {
        driver.executeScript("mobile: unlock", Map.of("key", key, "type", type, "strategy", strategy));
    }

    /**
     * Unlocks the device within a specified timeout.
     *
     * @param driver    The Appium driver instance.
     * @param key       The key to unlock the device.
     * @param type      The type of the key.
     * @param timeoutMs The timeout in milliseconds.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-unlock">UiAutomator2 - unlock</a>
     */
    @Override
    public void unlock(AppiumDriver driver, String key, String type, int timeoutMs) {
        driver.executeScript("mobile: unlock", Map.of("key", key, "type", type, "timeoutMs", timeoutMs));
    }

    /**
     * Unlocks the device using a specific strategy and within a specified timeout.
     *
     * @param driver    The Appium driver instance.
     * @param key       The key to unlock the device.
     * @param type      The type of the key.
     * @param strategy  The strategy to use for unlocking.
     * @param timeoutMs The timeout in milliseconds.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-unlock">UiAutomator2 - unlock</a>
     */
    @Override
    public void unlock(AppiumDriver driver, String key, String type, String strategy, int timeoutMs) {
        driver.executeScript("mobile: unlock", Map.of("key", key, "type", type, "strategy", strategy, "timeoutMs", timeoutMs));
    }

    /**
     * Checks if the device is locked.
     *
     * @param driver The Appium driver instance.
     * @return True if the device is locked, false otherwise.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-islocked">UiAutomator2 - isLocked</a>
     */
    @Override
    public boolean isLocked(AppiumDriver driver) {
        return (boolean) driver.executeScript("mobile: isLocked");
    }

    /**
     * Gets the battery information of the Android device.
     *
     * @param driver The Appium driver instance.
     * @return The battery information of the device.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-batteryinfo">UiAutomator2 - batteryInfo</a>
     */
    @Override
    public BatteryInfoModel batteryInfo(AppiumDriver driver) {
        return BatteryInfoModel.fromMap((Map) driver.executeScript("mobile: batteryInfo"));
    }

    /**
     * Gets the device information of the Android device.
     *
     * @param driver The Appium driver instance.
     * @return The device information of the device.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-deviceinfo">UiAutomator2 - deviceInfo</a>
     */
    @Override
    public Map<String, Object> deviceInfo(AppiumDriver driver) {
        return (Map<String, Object>) driver.executeScript("mobile: deviceInfo");
    }

    /**
     * Pushes a local file to the device.
     *
     * @param driver     The Appium driver instance.
     * @param remotePath The path on the device to where the payload should be written. The value format is similar to the one used in pullFile extension. If the file with the same name already exists then it will be silently overridden.
     * @param payload    Base64-encoded content of the file to be pushed.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-pushfile">UiAutomator2 - pushFile</a>
     */
    @Override
    public void pushFile(AppiumDriver driver, String remotePath, String payload) {
        driver.executeScript("mobile: pushFile", Map.of("remotePath", remotePath, "payload", payload));
    }
}