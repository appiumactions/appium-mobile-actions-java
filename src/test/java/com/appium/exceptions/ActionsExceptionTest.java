package com.appium.exceptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActionsExceptionTest {

    @DisplayName("Should return exception message")
    @Test
    void testExceptionMessage() {
        String message = "Test exception message";
        ActionsException exception = new ActionsException(message);

        assertEquals(message, exception.getMessage());
    }
}