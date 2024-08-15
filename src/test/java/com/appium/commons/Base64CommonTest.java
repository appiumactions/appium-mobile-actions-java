package com.appium.commons;

import com.appium.exceptions.Base64Exception;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class Base64CommonTest {

    @Test
    @DisplayName("Should return a string encoded in base64")
    void testEncode() {
        File file = new File("src/test/resources/test.txt");
        String base64 = Base64Common.encode(file.getPath());

        assertEquals("anVzdCBhIHRlc3Qh", base64);
    }

    @Test
    @DisplayName("Should return a file decoded from base64")
    void testDecode() {
        String base64 = "anVzdCBhIHRlc3Qh";
        File file = Base64Common.decode(base64);

        assertTrue(file.exists());
    }

    @Test
    @DisplayName("Should throw an exception when trying to encode a non-existent file")
    void testEncodeNonExistentFile() {
        File file = new File("src/test/resources/nonExistentFile.txt");

        Base64Exception exception = assertThrows(Base64Exception.class, () -> {
            Base64Common.encode(file.getPath());
        });

        assertEquals("Error reading file: src/test/resources/nonExistentFile.txt", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw an exception when trying to decode an invalid base64 string")
    void testDecodeInvalidBase64() {
        String invalidBase64 = "invalid_base64";

        Base64Exception exception = assertThrows(Base64Exception.class, () -> {
            Base64Common.decode(invalidBase64);
        });

        assertEquals("Error decoding file: Illegal base64 character 5f", exception.getMessage());
    }

    @Test
    @DisplayName("Should return an empty file when decoding an empty base64 string")
    void testDecodeEmptyBase64() throws IOException {
        String emptyBase64 = "";
        File file = Base64Common.decode(emptyBase64);

        assertTrue(file.exists());
        assertEquals(0, Files.size(file.toPath()));
    }

    @Test
    @DisplayName("Should create a temporary file when decoding a valid base64 string")
    void testDecodeCreatesTempFile() throws IOException {
        String base64 = "anVzdCBhIHRlc3Qh";
        File file = Base64Common.decode(base64);

        assertTrue(file.exists());
        assertEquals("just a test!", new String(Files.readAllBytes(file.toPath())));
    }
}
