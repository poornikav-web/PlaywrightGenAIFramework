package pages;

import com.microsoft.playwright.Page;

public class AddEmployeePage extends BasePage {

    public AddEmployeePage(Page page) {
        super(page);
    }

    private final String firstName = "input[name='firstName']";

    private final String lastName = "input[name='lastName']";

    private final String saveBtn = "//button[@type='submit']";

    public void addEmployee(String fname, String lname) {

        type(firstName, fname);
        type(lastName, lname);
        click(saveBtn);
    }
}