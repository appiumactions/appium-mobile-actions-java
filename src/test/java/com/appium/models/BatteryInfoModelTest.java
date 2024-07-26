package com.appium.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BatteryInfoModelTest {

    @DisplayName("Should return the BatteryInfoModel instance with level as double")
    @Test
    void testBatteryInfoModelInstanceLevelDouble() {
        BatteryInfoModel batteryInfoModel = new BatteryInfoModel(0.5, 2);

        assertEquals(0.5, batteryInfoModel.getLevel());
        assertEquals(2, batteryInfoModel.getState());
    }

    @DisplayName("Should return the BatteryInfoModel instance with level as integer")
    @Test
    void testBatteryInfoModelInstanceLevelInteger() {
        BatteryInfoModel batteryInfoModel = new BatteryInfoModel(1, 4);

        assertEquals(1, batteryInfoModel.getLevel());
        assertEquals(4, batteryInfoModel.getState());
    }

    @DisplayName("Should return the BatteryInfoModel instance with fromMap method")
    @Test
    void testBatteryInfoModelInstanceFromMap() {
        BatteryInfoModel batteryInfoModel = BatteryInfoModel.fromMap(Map.of("level", 0.5, "state", 2));

        assertEquals(0.5, batteryInfoModel.getLevel());
        assertEquals(2, batteryInfoModel.getState());
    }

    @DisplayName("Should return the string representation of the BatteryInfoModel instance")
    @Test
    void testBatteryInfoModelInstanceToString() {
        BatteryInfoModel batteryInfoModel = new BatteryInfoModel(0.5, 2);

        assertEquals("BatteryInfoModel{level=0.5, state=2}", batteryInfoModel.toString());
    }
}
