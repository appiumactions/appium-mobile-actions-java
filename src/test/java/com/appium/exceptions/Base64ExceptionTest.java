package com.appium.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Base64ExceptionTest {

    @Test
    void testBase64ExceptionMessage() {
        String errorMessage = "Invalid Base64 input";
        Base64Exception exception = new Base64Exception(errorMessage);

        assertEquals(errorMessage, exception.getMessage());
    }
}