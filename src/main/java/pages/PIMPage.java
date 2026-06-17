package pages;

import com.microsoft.playwright.Page;

public class PIMPage extends BasePage {

    public PIMPage(Page page) {
        super(page);
    }

    private final String pimMenu = "//span[text()='PIM']";

    private final String addEmployeeBtn = "//a[text()='Add Employee']";

    public void clickPIM() {
        click(pimMenu);
    }

    public void clickAddEmployee() {
        click(addEmployeeBtn);
    }
}