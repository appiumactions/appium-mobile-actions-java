package com.appium.interfaces;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class KeyboardActionsInterfaceTest {

    @Mock
    private AppiumDriver driver;

    @Mock
    private KeyboardActionsInterface keyboardActionsInterface;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        keyboardActionsInterface = mock(KeyboardActionsInterface.class);
    }

    @DisplayName("Should call hideKeyboard method")
    @Test
    void testHideKeyboard() {
        keyboardActionsInterface.hideKeyboard(driver);
        verify(keyboardActionsInterface, times(1)).hideKeyboard(driver);
    }

    @DisplayName("Should call hideKeyboard method with keys")
    @Test
    void testHideKeyboardWithKeys() {
        String[] keys = {"key1", "key2"};
        keyboardActionsInterface.hideKeyboard(driver, keys);
        verify(keyboardActionsInterface, times(1)).hideKeyboard(driver, keys);
    }

    @DisplayName("Should call isKeyboardShown method")
    @Test
    void testIsKeyboardShown() {
        keyboardActionsInterface.isKeyboardShown(driver);
        verify(keyboardActionsInterface, times(1)).isKeyboardShown(driver);
    }
}