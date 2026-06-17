package pages;

import com.microsoft.playwright.Page;

public class DashboardPage extends BasePage {

    public DashboardPage(Page page) {
        super(page);
    }

    private final String pimMenu = "//span[text()='PIM']";

    public boolean isDashboardDisplayed() {

        return page.locator("//h6[text()='Dashboard']").isVisible();
    }

    public void clickPIM() {

        click(pimMenu);
    }
}