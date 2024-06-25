package com.appium.platforms.ios;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class IOSKeyboardActionsTest {

    @Mock
    private AppiumDriver driver;

    private IOSKeyboardActions iosKeyboardActions;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        iosKeyboardActions = new IOSKeyboardActions();
    }

    @DisplayName("Should execute the hideKeyboard script for iOS")
    @Test
    void test() {
        iosKeyboardActions.hideKeyboard(driver);

        verify(driver, times(1)).executeScript("mobile: hideKeyboard");
    }

    @DisplayName("Should execute the hideKeyboard script for iOS with keys")
    @Test
    void testHideKeyboardWithKeys() {
        String[] keys = {"key1", "key2"};
        iosKeyboardActions.hideKeyboard(driver, keys);

        verify(driver, times(1)).executeScript("mobile: hideKeyboard", Map.of("keys", keys));
    }

    @DisplayName("Should return true when the keyboard is shown for iOS")
    @Test
    void testIsKeyboardShownTrue() {
        when(driver.executeScript("mobile: isKeyboardShown")).thenReturn(true);

        boolean keyboardShown = iosKeyboardActions.isKeyboardShown(driver);

        assertTrue(keyboardShown);
        verify(driver, times(1)).executeScript("mobile: isKeyboardShown");
    }

    @DisplayName("Should return false when the keyboard isn't shown for iOS")
    @Test
    void testIsKeyboardShownFalse() {
        when(driver.executeScript("mobile: isKeyboardShown")).thenReturn(false);

        boolean keyboardShown = iosKeyboardActions.isKeyboardShown(driver);

        assertFalse(keyboardShown);
        verify(driver, times(1)).executeScript("mobile: isKeyboardShown");
    }
}