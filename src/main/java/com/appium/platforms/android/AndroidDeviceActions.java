package com.appium.platforms.android;

import com.appium.commons.Base64Common;
import com.appium.interfaces.DeviceActionsInterface;
import com.appium.models.BatteryInfoModel;
import io.appium.java_client.AppiumDriver;

import java.util.List;
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
     * @param filePath   The path to the local file to be pushed.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-pushfile">UiAutomator2 - pushFile</a>
     */
    @Override
    public void pushFile(AppiumDriver driver, String remotePath, String filePath) {
        driver.executeScript("mobile: pushFile", Map.of("remotePath", remotePath, "payload", Base64Common.encode(filePath)));
    }

    /**
     * Pulls a file from the device.
     *
     * @param driver     The Appium driver instance.
     * @param remotePath The full path to the remote file or a specially formatted path, which points to an item inside an app bundle, for example @my.app.id/my/path. It is mandatory for the app bundle to have debugging enabled in order to use the latter remotePath format. If the file with the given name does not exist then an exception will be thrown.
     * @return Base64-encoded string, which represents the content of the remote file.
     * @see <a href="https://github.com/appium/appium-uiautomator2-driver/blob/master/README.md#mobile-pullfile">UiAutomator2 - pullFile</a>
     */
    @Override
    public String pullFile(AppiumDriver driver, String remotePath) {
        return (String) driver.executeScript("mobile: pullFile", Map.of("remotePath", remotePath));
    }

    /**
     * Sets the connectivity of the device.
     *
     * @param driver       The Appium driver instance.
     * @param wifi         Either to enable or disable Wi-Fi.
     * @param data         Either to enable or disable mobile data.
     * @param airplaneMode Either to enable or disable Airplane Mode.
     */
    @Override
    public void setConnectivity(AppiumDriver driver, boolean wifi, boolean data, boolean airplaneMode) {
        driver.executeScript("mobile: setConnectivity", Map.of("wifi", wifi, "data", data, "airplaneMode", airplaneMode));
    }

    /**
     * Gets the connectivity of the device.
     *
     * @param driver The Appium driver instance.
     * @return The connectivity information of the device.
     */
    @Override
    public Map<String, Object> getConnectivity(AppiumDriver driver) {
        return (Map<String, Object>) driver.executeScript("mobile: getConnectivity");
    }

    /**
     * Gets the connectivity of the device for a specific service.
     *
     * @param driver  The Appium driver instance.
     * @param service The service for which to get the connectivity information.
     * @return The connectivity information of the device for the specified service.
     */
    @Override
    public Map<String, Object> getConnectivity(AppiumDriver driver, String service) {
        return (Map<String, Object>) driver.executeScript("mobile: getConnectivity", Map.of("services", service));
    }

    /**
     * Gets the connectivity of the device for multiple services.
     *
     * @param driver   The Appium driver instance.
     * @param services The services for which to get the connectivity information.
     * @return The connectivity information of the device for the specified services.
     */
    @Override
    public Map<String, Object> getConnectivity(AppiumDriver driver, List<String> services) {
        return (Map<String, Object>) driver.executeScript("mobile: getConnectivity", Map.of("services", services));
    }
}