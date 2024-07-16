package com.appium.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
public class BatteryInfoModel {
    /**
     * The battery level.
     * <p>
     * Battery level in range [0.0, 1.0], where 1.0 means 100% charge. -1 is returned if the actual value cannot be retrieved from the system.
     */
    private Object level;

    /**
     * The battery state.
     * <p>
     * <b>UIAutomator2</b> supports the following states:
     * BATTERY_STATUS_UNKNOWN = 1
     * BATTERY_STATUS_CHARGING = 2
     * BATTERY_STATUS_DISCHARGING = 3
     * BATTERY_STATUS_NOT_CHARGING = 4
     * BATTERY_STATUS_FULL = 5
     * <p>
     * <b>XCUITest</b> supports the following states:
     * UIDeviceBatteryStateUnknown = 0
     * UIDeviceBatteryStateUnplugged = 1
     * UIDeviceBatteryStateCharging = 2
     * UIDeviceBatteryStateFull = 3
     */
    private Object state;

    /**
     * This method is used to convert a map to a BatteryInfoModel object.
     *
     * @param map A map containing the battery level and state.
     */
    public static BatteryInfoModel fromMap(Map<String, Object> map) {
        return new BatteryInfoModel(map.get("level"), map.get("state"));
    }

    /**
     * This method is used to convert a BatteryInfoModel object to a string.
     *
     * @return A string representation of the BatteryInfoModel object.
     */
    @Override
    public String toString() {
        return "BatteryInfoModel{" +
                "level=" + level +
                ", state=" + state +
                "}";
    }
}
