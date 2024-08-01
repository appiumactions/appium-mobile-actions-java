package com.appium.platforms.ios;

import com.appium.interfaces.DeviceActionsInterface;
import com.appium.models.BatteryInfoModel;
import io.appium.java_client.AppiumDriver;

import java.util.Map;

/**
 * This class implements the DeviceActionsInterface for iOS devices.
 * It provides methods to perform various device actions like lock, unlock, and check if the device is locked.
 */
public class IOSDeviceActions implements DeviceActionsInterface {

    /**
     * Locks on the iOS device.
     *
     * @param driver The Appium driver instance.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-lock">XCUITest - lock</a>
     */
    @Override
    public void lock(AppiumDriver driver) {
        driver.executeScript("mobile: lock");
    }

    /**
     * Locks on the iOS device for a specified duration.
     *
     * @param driver  The Appium driver instance.
     * @param seconds The number of seconds after which to unlock the device. Set to 0 or leave it.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-lock">XCUITest - lock</a>
     */
    @Override
    public void lock(AppiumDriver driver, int seconds) {
        driver.executeScript("mobile: lock", Map.of("seconds", seconds));
    }

    /**
     * Unlocks on the iOS device. Only simple (e.g. without a password) locks are supported.
     *
     * @param driver The Appium driver instance.
     * @param key    The key to unlock the device. <b>Currently not supported on the iOS platform.</b>
     * @param type   The type of the key. <b>Currently not supported on the iOS platform.</b>
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-unlock">XCUITest - unlock</a>
     */
    @Override
    public void unlock(AppiumDriver driver, String key, String type) {
        driver.executeScript("mobile: unlock");
    }

    /**
     * Unlocks on the iOS device using a specific strategy. Only simple (e.g. without a password) locks are supported.
     *
     * @param driver   The Appium driver instance.
     * @param key      The key to unlock the device. <b>Currently not supported on the iOS platform.</b>
     * @param type     The type of the key. <b>Currently not supported on the iOS platform.</b>
     * @param strategy The strategy to use for unlocking. <b>Currently not supported on the iOS platform.</b>
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-unlock">XCUITest - unlock</a>
     */
    @Override
    public void unlock(AppiumDriver driver, String key, String type, String strategy) {
        driver.executeScript("mobile: unlock");
    }

    /**
     * Unlocks on the iOS device within a specified timeout. Only simple (e.g. without a password) locks are supported.
     *
     * @param driver    The Appium driver instance.
     * @param key       The key to unlock the device. <b>Currently not supported on the iOS platform.</b>
     * @param type      The type of the key. <b>Currently not supported on the iOS platform.</b>
     * @param timeoutMs The timeout in milliseconds. <b>Currently not supported on the iOS platform.</b>
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-unlock">XCUITest - unlock</a>
     */
    @Override
    public void unlock(AppiumDriver driver, String key, String type, int timeoutMs) {
        driver.executeScript("mobile: unlock");
    }

    /**
     * Unlocks on the iOS device using a specific strategy and within a specified timeout. Only simple (e.g. without a password) locks are supported.
     *
     * @param driver    The Appium driver instance.
     * @param key       The key to unlock the device. <b>Currently not supported on the iOS platform.</b>
     * @param type      The type of the key. <b>Currently not supported on the iOS platform.</b>
     * @param strategy  The strategy to use for unlocking. <b>Currently not supported on the iOS platform.</b>
     * @param timeoutMs The timeout in milliseconds. <b>Currently not supported on the iOS platform.</b>
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-unlock">XCUITest - unlock</a>
     */
    @Override
    public void unlock(AppiumDriver driver, String key, String type, String strategy, int timeoutMs) {
        driver.executeScript("mobile: unlock");
    }

    /**
     * Checks if on the iOS device is locked.
     *
     * @param driver The Appium driver instance.
     * @return True if the device is locked, false otherwise.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-islocked">XCUITest - isLocked</a>
     */
    @Override
    public boolean isLocked(AppiumDriver driver) {
        return (boolean) driver.executeScript("mobile: isLocked");
    }

    /**
     * Gets the battery information of the iOS device.
     *
     * @param driver The Appium driver instance.
     * @return The battery information of the device.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-batteryinfo">XCUITest - batteryInfo</a>
     */
    @Override
    public BatteryInfoModel batteryInfo(AppiumDriver driver) {
        return BatteryInfoModel.fromMap((Map) driver.executeScript("mobile: batteryInfo"));
    }

    /**
     * Gets the device information of the iOS device.
     *
     * @param driver The Appium driver instance.
     * @return The device information of the device.
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-deviceinfo">XCUITest - deviceInfo</a>
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
     * @see <a href="https://github.com/appium/appium-xcuitest-driver/blob/master/docs/reference/execute-methods.md#mobile-pushfile">XCUITest - pushFile</a>
     */
    @Override
    public void pushFile(AppiumDriver driver, String remotePath, String payload) {
        driver.executeScript("mobile: pushFile", Map.of("remotePath", remotePath, "payload", payload));
    }
}