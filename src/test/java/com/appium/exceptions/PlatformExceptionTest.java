package com.appium.exceptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlatformExceptionTest {

    @DisplayName("Should return exception message")
    @Test
    void testExceptionMessage() {
        String message = "Test platform exception message";
        PlatformException exception = new PlatformException(message);

        assertEquals(message, exception.getMessage());
    }
}