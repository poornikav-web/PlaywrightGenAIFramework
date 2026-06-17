package tests;

import config.ConfigReader;

public class TestConfig {
    public static void main(String[] args) {

        System.out.println(ConfigReader.getProperty("browser"));
    }
}
