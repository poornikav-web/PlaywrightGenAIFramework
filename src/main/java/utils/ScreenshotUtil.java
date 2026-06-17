package utils;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class ScreenshotUtil {

    public static String takeScreenshot(
            Page page,
            String testName) {

        String path =
                "screenshots/" +
                        testName +
                        ".png";

        page.screenshot(
                new Page.ScreenshotOptions()
                        .setPath(Paths.get(path)));

        return path;
    }
}