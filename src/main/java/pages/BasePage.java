package pages;

import com.microsoft.playwright.Page;

public abstract class BasePage {

    protected Page page;

    public BasePage(Page page){

        this.page=page;
    }

    protected void click(String locator){

        page.locator(locator).click();
    }

    protected void type(String locator, String text){

        page.locator(locator).fill(text);
    }

    protected String getText(String locator){

        return page.locator(locator)
                .textContent();
    }
    protected void waitForElement(String locator) {

        page.waitForSelector(locator);
    }
}