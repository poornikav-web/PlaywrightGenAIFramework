package tests;

import base.BaseTest;
import config.ConfigReader;
import listeners.Retry;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void verifyLogin() {

        page.navigate(ConfigReader.getProperty("url"));
        LoginPage loginPage = new LoginPage(page);
        loginPage.login("Admin", "admin123");
        System.out.println(page.url());
        System.out.println(page.title());
        DashboardPage dashboardPage = new DashboardPage(page);
        Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard is not displayed");
    }
}