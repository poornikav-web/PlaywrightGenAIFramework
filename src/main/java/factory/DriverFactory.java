package factory;

import com.microsoft.playwright.*;
import config.ConfigReader;

public class DriverFactory {

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    public static Page initBrowser() {

        boolean headless =
                Boolean.parseBoolean(
                        ConfigReader.getProperty("headless"));

        playwright = Playwright.create();

        browser =
                playwright.chromium()
                        .launch(
                                new BrowserType
                                        .LaunchOptions()
                                        .setHeadless(headless));

        context = browser.newContext();

        page = context.newPage();

        return page;
    }

    public static void closeBrowser() {

        if(page!=null)
            page.close();

        if(context!=null)
            context.close();

        if(browser!=null)
            browser.close();

        if(playwright!=null)
            playwright.close();
    }
}