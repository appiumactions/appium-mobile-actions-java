package com.appium.actions;

import com.appium.interfaces.SessionActionsInterface;
import com.appium.platforms.android.AndroidSessionActions;
import com.appium.platforms.ios.IOSSessionActions;
import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;

/**
 * A class that provides methods to manage the session actions on a device.
 * The actual implementation of the session actions is platform dependent.
 * For Android, it uses the AndroidSessionActions class.
 * For iOS, it uses the IOSSessionActions class.
 *
 * @see com.appium.platforms.android.AndroidSessionActions
 * @see com.appium.platforms.ios.IOSSessionActions
 */
public class SessionActions extends BaseActions {

    /**
     * The platform specific implementation of the session actions.
     */
    @VisibleForTesting
    protected final SessionActionsInterface sessionActionsPlatform;

    /**
     * Constructs a new SessionActions instance.
     *
     * @param driver the AppiumDriver instance to interact with the device.
     */
    public SessionActions(AppiumDriver driver) {
        super(driver);

        sessionActionsPlatform = platform.is(Platform.ANDROID)
                ? new AndroidSessionActions()
                : new IOSSessionActions();
    }

    /**
     * Terminates the app on the device.
     *
     * @param appId the appPackage or bundleId of the app to be terminated.
     * @see com.appium.platforms.android.AndroidSessionActions#terminateApp(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSSessionActions#terminateApp(AppiumDriver, String)
     */
    public void terminateApp(String appId) {
        sessionActionsPlatform.terminateApp(driver, appId);
    }

    /**
     * Terminates the app on the device with a specified timeout.
     *
     * @param appId   the appPackage or bundleId of the app to be terminated.
     * @param timeout the maximum time to wait until app termination is finished. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @see com.appium.platforms.android.AndroidSessionActions#terminateApp(AppiumDriver, String, int)
     * @see com.appium.platforms.ios.IOSSessionActions#terminateApp(AppiumDriver, String, int)
     */
    public void terminateApp(String appId, int timeout) {
        sessionActionsPlatform.terminateApp(driver, appId, timeout);
    }

    /**
     * Activates the app on the device.
     *
     * @param appId the appPackage or bundleId of the app to be activated.
     * @see com.appium.platforms.android.AndroidSessionActions#activateApp(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSSessionActions#activateApp(AppiumDriver, String)
     */
    public void activateApp(String appId) {
        sessionActionsPlatform.activateApp(driver, appId);
    }

    /**
     * Checks if the app is installed on the device.
     *
     * @param appId the appPackage or bundleId of the app to be checked.
     * @return true if the app is installed, false otherwise.
     * @see com.appium.platforms.android.AndroidSessionActions#isAppInstalled(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSSessionActions#isAppInstalled(AppiumDriver, String)
     */
    public boolean isAppInstalled(String appId) {
        return sessionActionsPlatform.isAppInstalled(driver, appId);
    }

    /**
     * Removes the app from the device.
     *
     * @param appId the appPackage or bundleId of the app to be removed.
     * @return true if the app was successfully removed, false otherwise.
     * @see com.appium.platforms.android.AndroidSessionActions#removeApp(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSSessionActions#removeApp(AppiumDriver, String)
     */
    public boolean removeApp(String appId) {
        return sessionActionsPlatform.removeApp(driver, appId);
    }

    /**
     * Removes the app from the device with a specified timeout.
     *
     * @param appId   the appPackage or bundleId of the app to be removed.
     * @param timeout the maximum time to wait until app removal is finished. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @return true if the app was successfully removed, false otherwise.
     * @see com.appium.platforms.android.AndroidSessionActions#removeApp(AppiumDriver, String, int)
     * @see com.appium.platforms.ios.IOSSessionActions#removeApp(AppiumDriver, String, int)
     */
    public boolean removeApp(String appId, int timeout) {
        return sessionActionsPlatform.removeApp(driver, appId, timeout);
    }

    /**
     * Removes the app from the device with an option to keep the app data.
     *
     * @param appId    the appPackage or bundleId of the app to be removed.
     * @param keepData if set to true, the app data will be kept. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @return true if the app was successfully removed, false otherwise.
     * @see com.appium.platforms.android.AndroidSessionActions#removeApp(AppiumDriver, String, boolean)
     * @see com.appium.platforms.ios.IOSSessionActions#removeApp(AppiumDriver, String, boolean)
     */
    public boolean removeApp(String appId, boolean keepData) {
        return sessionActionsPlatform.removeApp(driver, appId, keepData);
    }

    /**
     * Removes the app from the device with a specified timeout and an option to keep the app data.
     *
     * @param appId    the appPackage or bundleId of the app to be removed.
     * @param timeout  the maximum time to wait until app removal is finished. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @param keepData if set to true, the app data will be kept. Parameter supported <b>only in UiAutomator2 - Android</b>.
     * @return true if the app was successfully removed, false otherwise.
     * @see com.appium.platforms.android.AndroidSessionActions#removeApp(AppiumDriver, String, int, boolean)
     * @see com.appium.platforms.ios.IOSSessionActions#removeApp(AppiumDriver, String, int, boolean)
     */
    public boolean removeApp(String appId, int timeout, boolean keepData) {
        return sessionActionsPlatform.removeApp(driver, appId, timeout, keepData);
    }

    /**
     * Installs the app on the device.
     *
     * @param appPath the path of the app to be installed.
     * @see com.appium.platforms.android.AndroidSessionActions#installApp(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSSessionActions#installApp(AppiumDriver, String)
     */
    public void installApp(String appPath) {
        sessionActionsPlatform.installApp(driver, appPath);
    }

    /**
     * Installs the app on the device with an option to check the app version.
     *
     * @param appPath      the path of the app to be installed.
     * @param checkVersion if set to true, it will make the driver to verify whether the app version currently installed on the device is older than the one, which is provided as app value.
     * @see com.appium.platforms.android.AndroidSessionActions#installApp(AppiumDriver, String, boolean)
     * @see com.appium.platforms.ios.IOSSessionActions#installApp(AppiumDriver, String, boolean)
     */
    public void installApp(String appPath, boolean checkVersion) {
        sessionActionsPlatform.installApp(driver, appPath, checkVersion);
    }

    /**
     * Installs the app on the device with a specified timeout.
     *
     * @param appPath the path of the app to be installed.
     * @param timeout the maximum time to wait until app install is finished.
     * @see com.appium.platforms.android.AndroidSessionActions#installApp(AppiumDriver, String, int)
     * @see com.appium.platforms.ios.IOSSessionActions#installApp(AppiumDriver, String, int)
     */
    public void installApp(String appPath, int timeout) {
        sessionActionsPlatform.installApp(driver, appPath, timeout);
    }

    /**
     * Installs the app on the device with a specified timeout and an option to check the app version.
     *
     * @param appPath      the path of the app to be installed.
     * @param checkVersion if set to true, it will make the driver to verify whether the app version currently installed on the device is older than the one, which is provided as app value.
     * @param timeout      the maximum time to wait until app install is finished.
     * @see com.appium.platforms.android.AndroidSessionActions#installApp(AppiumDriver, String, boolean, int)
     * @see com.appium.platforms.ios.IOSSessionActions#installApp(AppiumDriver, String, boolean, int)
     */
    public void installApp(String appPath, boolean checkVersion, int timeout) {
        sessionActionsPlatform.installApp(driver, appPath, checkVersion, timeout);
    }

    /**
     * Clears the app data on the device.
     *
     * @param appId the bundleId of the app to be cleared.
     * @see com.appium.platforms.android.AndroidSessionActions#clearApp(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSSessionActions#clearApp(AppiumDriver, String)
     */
    public void clearApp(String appId) {
        sessionActionsPlatform.clearApp(driver, appId);
    }

    /**
     * Accept alert on the device.
     *
     * @see com.appium.platforms.android.AndroidSessionActions#acceptAlert(AppiumDriver)
     * @see com.appium.platforms.ios.IOSSessionActions#acceptAlert(AppiumDriver)
     */
    public void acceptAlert() {
        sessionActionsPlatform.acceptAlert(driver);
    }

    /**
     * Accept alert on the device with a specified button label.
     *
     * @param buttonLabel the label of the button to be clicked.
     * @see com.appium.platforms.android.AndroidSessionActions#acceptAlert(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSSessionActions#acceptAlert(AppiumDriver, String)
     */
    public void acceptAlert(String buttonLabel) {
        sessionActionsPlatform.acceptAlert(driver, buttonLabel);
    }

    /**
     * Dismiss alert on the device.
     *
     * @see com.appium.platforms.android.AndroidSessionActions#dismissAlert(AppiumDriver)
     * @see com.appium.platforms.ios.IOSSessionActions#dismissAlert(AppiumDriver)
     */
    public void dismissAlert() {
        sessionActionsPlatform.dismissAlert(driver);
    }

    /**
     * Dismiss alert on the device with a specified button label.
     *
     * @param buttonLabel the label of the button to be clicked.
     * @see com.appium.platforms.android.AndroidSessionActions#dismissAlert(AppiumDriver, String)
     * @see com.appium.platforms.ios.IOSSessionActions#dismissAlert(AppiumDriver, String)
     */
    public void dismissAlert(String buttonLabel) {
        sessionActionsPlatform.dismissAlert(driver, buttonLabel);
    }
}