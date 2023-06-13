package org.dcsa.testdata.init;

import lombok.Data;
import lombok.extern.java.Log;
import org.dcsa.testdata.service.uploader.exception.StorageException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

@Data
@Log
@EnableConfigurationProperties
@Configuration
@ConfigurationProperties( prefix = "spring")
public class AppProperty {
    public static Connection connection = null;

    private static final String UPLOAD_CONFIG_PATH_NAME_KEY = "app.upload_config_path";
    public static String DATABASE_URL;
    public static String DATABASE_USER_NAME;
    public static String DATABASE_PASSWORD;
    public static String UPLOAD_CONFIG_PATH;
    private String upload_config_path;
    public static Path uploadPath;
    @Value("${spring.datasource.url}")
    public String url;
    @Value("${spring.datasource.password}")
    public String password;
    @Value("${spring.datasource.username}")
    public String username;

    public void init(){
        AppProperty.DATABASE_URL = url;
        String evnApiRootUri = System.getenv("DB_HOST_IP");
        if(evnApiRootUri != null){
            AppProperty.DATABASE_URL = url.replace("localhost", evnApiRootUri) ;
        }
        AppProperty.UPLOAD_CONFIG_PATH = upload_config_path;

        AppProperty.DATABASE_USER_NAME = username;
        AppProperty.DATABASE_PASSWORD = password;
        makeUploadPath();
    }

    private static void makeUploadPath(){
        uploadPath = Paths.get(AppProperty.UPLOAD_CONFIG_PATH);
        try {
            Files.createDirectories(uploadPath);
        }
        catch (IOException e) {
            throw new StorageException("Could not initialize storage ", e);
        }
    }
    public static Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(AppProperty.DATABASE_URL, AppProperty.DATABASE_USER_NAME, AppProperty.DATABASE_PASSWORD);
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Connection is initialized: "+connection);
            }
        } catch (SQLException e) {
            System.out.println("Connection init error: "+e.getMessage());
        }
        return connection;
    }
}
