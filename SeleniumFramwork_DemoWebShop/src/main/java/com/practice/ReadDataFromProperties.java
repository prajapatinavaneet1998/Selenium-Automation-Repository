package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

    public static void main(String[] args) throws IOException {

        // 1. Create File object and provide the complete path of the properties file
        File file = new File("C:\\Users\\praja\\Downloads\\data.property");
   
        // 2. Create FileInputStream object
        FileInputStream fis = new FileInputStream(file);

        // 3. Create Properties object
        Properties property = new Properties();

        // 4. Load the properties file
        property.load(fis);

        // 5. Read values using property keys
        String writtenBrowser = property.getProperty("browser");
        String url = property.getProperty("applicationUrl");

        // 6. Print the values
        System.out.println(writtenBrowser);
        System.out.println(url);

        // 7. Close the FileInputStream
        fis.close();
    }
}
 