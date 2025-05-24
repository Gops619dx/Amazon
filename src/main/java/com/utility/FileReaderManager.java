package com.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {
    private static FileInputStream fileInputStream;
    private static Properties property;

    private static void setupProperty() throws IOException {
        File file = new File("D:\\Maven\\src\\test.resources\\TestData.properties");
        try {
            fileInputStream = new FileInputStream(file);
            property = new Properties();
            property.load(fileInputStream);
        } catch (Exception e) {
            throw new IOException("ERROR: OCCURRED WHILE FILE READING");
        }
    }

    public static String getDataProperty(String keydata) throws IOException {
        setupProperty();
        return property.getProperty(keydata);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getDataProperty("url"));
    }
}