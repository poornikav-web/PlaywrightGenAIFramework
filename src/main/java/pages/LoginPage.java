package pages;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {

    public LoginPage(Page page) {
        super(page);
    }

    // Locators
    private final String txtUsername = "input[name='username']";
    private final String txtPassword = "input[name='password']";
    private final String btnLogin = "button[type='submit']";

    public void login(String username, String password) {

        type(txtUsername, username);
        type(txtPassword, password);
        click(btnLogin);
    }
}