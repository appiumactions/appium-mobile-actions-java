package com.appium.actions;

import com.appium.interfaces.DeviceActionsInterface;
import com.appium.models.BatteryInfoModel;
import com.appium.platforms.android.AndroidDeviceActions;
import com.appium.platforms.ios.IOSDeviceActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

import java.util.List;
import java.util.Map;

/**
 * This class provides actions that can be performed on a device.
 * It uses the appropriate platform-specific implementation of the DeviceActionsInterface.
 *
 * @see com.appium.platforms.android.AndroidDeviceActions
 * @see com.appium.platforms.ios.IOSDeviceActions
 */
public class DeviceActions extends BaseActions {

    /**
     * The platform-specific implementation of the DeviceActionsInterface.
     */
    @VisibleForTesting
    protected final DeviceActionsInterface deviceActionsPlatform;

    /**
     * Constructs a new DeviceActions instance.
     *
     * @param driver The Appium driver instance.
     */
    public DeviceActions(AppiumDriver driver) {
        super(driver);

        deviceActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidDeviceActions()
                : new IOSDeviceActions();
    }

    /**
     * Locks the device.
     *
     * @see com.appium.platforms.android.AndroidDeviceActions#lock(AppiumDriver)
     * @see com.appium.platforms.ios.IOSDeviceActions#lock(AppiumDriver)
     */
    public void lock() {
        deviceActionsPlatform.lock(driver);
    }

    /**
     * Locks the device for a specified duration.
     *
     * @param seconds The number of seconds after which to unlock the device.
     * @see com.appium.platforms.android.AndroidDeviceActions#lock(AppiumDriver, int)
     * @see com.appium.platforms.ios.IOSDeviceActions#lock(AppiumDriver, int)
     */
    public void lock(int seconds) {
        deviceActionsPlatform.lock(driver, seconds);
    }

    /**
     * Unlocks the device.
     *
     * @param key  The key to unlock the device. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param type The type of the key. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @see com.appium.platforms.android.AndroidDeviceActions#unlock(AppiumDriver, String, String)
     * @see com.appium.platforms.ios.IOSDeviceActions#unlock(AppiumDriver, String, String)
     */
    public void unlock(String key, String type) {
        deviceActionsPlatform.unlock(driver, key, type);
    }

    /**
     * Unlocks the device using a specific strategy.
     *
     * @param key      The key to unlock the device. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param type     The type of the key. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param strategy The strategy to use for unlocking. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @see com.appium.platforms.android.AndroidDeviceActions#unlock(AppiumDriver, String, String, String)
     * @see com.appium.platforms.ios.IOSDeviceActions#unlock(AppiumDriver, String, String, String)
     */
    public void unlock(String key, String type, String strategy) {
        deviceActionsPlatform.unlock(driver, key, type, strategy);
    }

    /**
     * Unlocks the device within a specified timeout.
     *
     * @param key       The key to unlock the device. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param type      The type of the key. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param timeoutMs The timeout in milliseconds. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @see com.appium.platforms.android.AndroidDeviceActions#unlock(AppiumDriver, String, String, int)
     * @see com.appium.platforms.ios.IOSDeviceActions#unlock(AppiumDriver, String, String, int)
     */
    public void unlock(String key, String type, int timeoutMs) {
        deviceActionsPlatform.unlock(driver, key, type, timeoutMs);
    }

    /**
     * Unlocks the device using a specific strategy and within a specified timeout.
     *
     * @param key       The key to unlock the device. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param type      The type of the key. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param strategy  The strategy to use for unlocking. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param timeoutMs The timeout in milliseconds. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @see com.appium.platforms.android.AndroidDeviceActions#unlock(AppiumDriver, String, String, String, int)
     * @see com.appium.platforms.ios.IOSDeviceActions#unlock(AppiumDriver, String, String, String, int)
     */
    public void unlock(String key, String type, String strategy, int timeoutMs) {
        deviceActionsPlatform.unlock(driver, key, type, strategy, timeoutMs);
    }

    /**
     * Checks if the device is locked.
     *
     * @return True if the device is locked, false otherwise.
     * @see com.appium.platforms.android.AndroidDeviceActions#isLocked(AppiumDriver)
     * @see com.appium.platforms.ios.IOSDeviceActions#isLocked(AppiumDriver)
     */
    public boolean isLocked() {
        return deviceActionsPlatform.isLocked(driver);
    }

    /**
     * Gets the battery information of the device.
     *
     * @return The battery information of the device.
     * @see com.appium.platforms.android.AndroidDeviceActions#batteryInfo(AppiumDriver)
     * @see com.appium.platforms.ios.IOSDeviceActions#batteryInfo(AppiumDriver)
     */
    public BatteryInfoModel batteryInfo() {
        return deviceActionsPlatform.batteryInfo(driver);
    }

    /**
     * Gets the device information.
     *
     * @return The device information.
     * @see com.appium.platforms.android.AndroidDeviceActions#deviceInfo(AppiumDriver)
     * @see com.appium.platforms.ios.IOSDeviceActions#deviceInfo(AppiumDriver)
     */
    public Map<String, Object> deviceInfo() {
        return deviceActionsPlatform.deviceInfo(driver);
    }

    /**
     * Pushes a file to the device.
     *
     * @param remotePath The path on the device where the file should be pushed. Examples: Android -> "/sdcard/myfile.txt", iOS -> "@com.mycompany.myapp:documents/myfile.txt".
     * @param filePath   The path to the file to be pushed. Examples: "src/test/resources/test.txt".
     * @see com.appium.platforms.android.AndroidDeviceActions#pushFile(AppiumDriver, String, String)
     * @see com.appium.platforms.ios.IOSDeviceActions#pushFile(AppiumDriver, String, String)
     */
    public void pushFile(String remotePath, String filePath) {
        deviceActionsPlatform.pushFile(driver, remotePath, filePath);
    }

    /**
     * Pulls a file from the device.
     *
     * @param remotePath The path on the device where the file should be pushed. Examples: Android -> "/sdcard/myfile.txt", iOS -> "@com.mycompany.myapp:documents/myfile.txt".
     * @return Base64-encoded string, which represents the content of the remote file.
     * @see com.appium.platforms.android.AndroidDeviceActions#pullFile(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSDeviceActions#pullFile(AppiumDriver, String)
     */
    public String pullFile(String remotePath) {
        return deviceActionsPlatform.pullFile(driver, remotePath);
    }

    /**
     * Pulls a folder from the device.
     *
     * @param remotePath The path on the device where the folder should be pushed. Examples: Android -> "/sdcard/myfolder", iOS -> "@com.mycompany.myapp:documents/myfolder".
     * @return Base64-encoded string, which represents the zipped content of the remote folder.
     * @see com.appium.platforms.android.AndroidDeviceActions#pullFolder(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSDeviceActions#pullFolder(AppiumDriver, String)
     */
    public String pullFolder(String remotePath) {
        return deviceActionsPlatform.pullFolder(driver, remotePath);
    }

    /**
     * Deletes a file from the device.
     *
     * @param remotePath The path on the device where the file should be deleted. Examples: Android -> "/sdcard/myfile.txt", iOS -> "@com.mycompany.myapp:documents/myfile.txt".
     * @see com.appium.platforms.android.AndroidDeviceActions#deleteFile(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSDeviceActions#deleteFile(AppiumDriver, String)
     */
    public void deleteFile(String remotePath) {
        deviceActionsPlatform.deleteFile(driver, remotePath);
    }

    /**
     * Sets the connectivity of the device.
     *
     * @param wifi         Either to enable or disable Wi-Fi.
     * @param data         Either to enable or disable mobile data.
     * @param airplaneMode Either to enable or disable Airplane Mode.
     * @see com.appium.platforms.android.AndroidDeviceActions#setConnectivity(AppiumDriver, boolean, boolean, boolean)
     * @see com.appium.platforms.ios.IOSDeviceActions#setConnectivity(AppiumDriver, boolean, boolean, boolean)
     */
    public void setConnectivity(boolean wifi, boolean data, boolean airplaneMode) {
        deviceActionsPlatform.setConnectivity(driver, wifi, data, airplaneMode);
    }

    /**
     * Gets the connectivity of the device.
     *
     * @return The connectivity of the device.
     * @see com.appium.platforms.android.AndroidDeviceActions#getConnectivity(AppiumDriver)
     * @see com.appium.platforms.ios.IOSDeviceActions#getConnectivity(AppiumDriver)
     */
    public Map<String, Object> getConnectivity() {
        return deviceActionsPlatform.getConnectivity(driver);
    }

    /**
     * Gets the connectivity of the device.
     *
     * @param service The service for which to get the connectivity information. Supported service names are: wifi, data, airplaneMode.
     * @return The connectivity of the device.
     * @see com.appium.platforms.android.AndroidDeviceActions#getConnectivity(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSDeviceActions#getConnectivity(AppiumDriver, String)
     */
    public Map<String, Object> getConnectivity(String service) {
        return deviceActionsPlatform.getConnectivity(driver, service);
    }

    /**
     * Gets the connectivity of the device.
     *
     * @param services The services for which to get the connectivity information. Supported service names are: wifi, data, airplaneMode.
     * @return The connectivity of the device.
     * @see com.appium.platforms.android.AndroidDeviceActions#getConnectivity(AppiumDriver, List)
     * @see com.appium.platforms.ios.IOSDeviceActions#getConnectivity(AppiumDriver, List)
     */
    public Map<String, Object> getConnectivity(List<String> services) {
        return deviceActionsPlatform.getConnectivity(driver, services);
    }
}
