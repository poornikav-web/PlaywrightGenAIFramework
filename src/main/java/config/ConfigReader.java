package config;

import constants.FrameworkConstants;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {

        try {

            FileInputStream fis =
                    new FileInputStream(
                            FrameworkConstants.CONFIG_PATH);

            properties = new Properties();
            properties.load(fis);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }
}