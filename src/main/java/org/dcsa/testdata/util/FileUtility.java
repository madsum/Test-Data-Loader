package org.dcsa.testdata.util;

import lombok.extern.java.Log;
import org.springframework.core.io.ByteArrayResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;

@Log
public class FileUtility {
        public static String loadResourceAsString(String resource) {
            try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource)) {
                return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            } catch (IOException e) {
                log.log(Level.SEVERE, e.getMessage());
            }
            return "";
        }

    public static String loadFileAsString(String resource) {
        String fileData = null;
        try{
            Path filePath = Path.of(resource);
            fileData =  Files.readString(filePath.toAbsolutePath());

        } catch (IOException e) {
            log.log(Level.SEVERE, e.getMessage());
        }
        return fileData;
    }

    public static InputStream getInputStream(String resource){
        InputStream inputStream = null;
        try{
            Path filePath = Path.of(resource);
            inputStream = Files.newInputStream(filePath.toAbsolutePath());
        } catch (IOException e) {
            log.log(Level.SEVERE, e.getMessage());
        }
        return inputStream;
    }

    public static ByteArrayResource getFile(String resource){
        ByteArrayResource byteArrayResource;
        try {
            File file = new File(resource);
            Path path = Paths.get(file.getAbsolutePath());
            byteArrayResource = new ByteArrayResource(Files.readAllBytes(path));
        } catch (Exception e)
        {
            throw new IllegalStateException("Cannot find file " + resource);
        }
        return  byteArrayResource;
    }
}
