package com.appium.platforms.android;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class AndroidKeyboardActionsTest {

    @Mock
    private AppiumDriver driver;

    private AndroidKeyboardActions androidKeyboardActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        androidKeyboardActions = new AndroidKeyboardActions();
    }

    @DisplayName("Should execute the hideKeyboard script for Android")
    @Test
    void test() {
        androidKeyboardActions.hideKeyboard(driver);

        verify(driver, times(1)).executeScript("mobile: hideKeyboard");
    }

    @DisplayName("Should execute the hideKeyboard script for Android with keys")
    @Test
    void testHideKeyboardWithKeys() {
        String[] keys = {"key1", "key2"};
        androidKeyboardActions.hideKeyboard(driver, keys);

        verify(driver, times(1)).executeScript("mobile: hideKeyboard");
    }

    @DisplayName("Should return true when the keyboard is shown for Android")
    @Test
    void testIsKeyboardShownTrue() {
        when(driver.executeScript("mobile: isKeyboardShown")).thenReturn(true);

        boolean keyboardShown = androidKeyboardActions.isKeyboardShown(driver);

        assertTrue(keyboardShown);
        verify(driver, times(1)).executeScript("mobile: isKeyboardShown");
    }

    @DisplayName("Should return false when the keyboard isn't shown for Android")
    @Test
    void testIsKeyboardShownFalse() {
        when(driver.executeScript("mobile: isKeyboardShown")).thenReturn(false);

        boolean keyboardShown = androidKeyboardActions.isKeyboardShown(driver);

        assertFalse(keyboardShown);
        verify(driver, times(1)).executeScript("mobile: isKeyboardShown");
    }
}
