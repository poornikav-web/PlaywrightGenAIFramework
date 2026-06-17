package utils;

import com.microsoft.playwright.Page;

public class WaitUtil {

    public static void waitForElement(Page page, String locator) {
        page.waitForSelector(locator);
    }
}