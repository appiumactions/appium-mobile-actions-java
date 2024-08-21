package com.appium.commons;

import com.appium.exceptions.Base64Exception;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Base64Common {

    /**
     * Encodes a file to base64
     *
     * @param filePath path to the file to be encoded
     * @return base64 string
     */
    public static String encode(String filePath) {
        byte[] inFileBytes;

        try {
            inFileBytes = Files.readAllBytes(Paths.get(filePath));
        } catch (IOException e) {
            throw new Base64Exception("Error reading file: " + e.getMessage());
        }
        return java.util.Base64.getEncoder().encodeToString(inFileBytes);
    }

    /**
     * Decodes a base64 string to a file
     *
     * @param base64 base64 string
     * @return file
     */
    public static File decode(String base64) {
        byte[] decodedBytes;
        File tempFile;

        try {
            decodedBytes = java.util.Base64.getDecoder().decode(base64);
            tempFile = File.createTempFile("decodedFile", null);
            Files.write(tempFile.toPath(), decodedBytes);
        } catch (IOException | IllegalArgumentException e) {
            throw new Base64Exception("Error decoding file: " + e.getMessage());
        }

        return tempFile;
    }
}
