package tests;

import ai.AIDataGenerator;
import base.BaseTest;
import config.ConfigReader;
import org.testng.annotations.Test;
import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PIMPage;

public class AddEmployeeTest extends BaseTest {

    @Test
    public void addEmployeeTest() {
        page.navigate(ConfigReader.getProperty("url"));
        LoginPage loginPage = new LoginPage(page);
        loginPage.login("Admin", "admin123");
        DashboardPage dashboardPage = new DashboardPage(page);
        dashboardPage.clickPIM();
        PIMPage pimPage = new PIMPage(page);
        pimPage.clickAddEmployee();
        AddEmployeePage addEmployeePage = new AddEmployeePage(page);
        String firstName = AIDataGenerator.generateFirstName();
        addEmployeePage.addEmployee(firstName, "kumar");
    }
}