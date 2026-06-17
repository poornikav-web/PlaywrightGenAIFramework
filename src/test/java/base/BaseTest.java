package base;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;

    public static Page page;

    @BeforeMethod
    public void setup() {

        playwright = Playwright.create();

        browser =
                playwright.chromium()
                        .launch(
                                new BrowserType
                                        .LaunchOptions()
                                        .setHeadless(false));

        page = browser.newPage();
    }

    @AfterMethod
    public void tearDown() {

        browser.close();
        playwright.close();
    }
}