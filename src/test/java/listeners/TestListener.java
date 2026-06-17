package listeners;

import base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.ExtentManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    ExtentTest test;

    @Override
    public void onTestStart(
            ITestResult result) {

        System.out.println(
                "Listener Started");

        test =
                ExtentManager
                        .getInstance()
                        .createTest(
                                result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        test.log(
                Status.PASS,
                "Test Passed");
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        test.log(
                Status.FAIL,
                result.getThrowable());

        try {

            String screenshotPath =
                    ScreenshotUtil
                            .takeScreenshot(
                                    BaseTest.page,
                                    result.getName());

            test.addScreenCaptureFromPath(
                    "../" +
                            screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(
            ITestContext context) {
        System.out.println("Inside onFinish");
        ExtentManager
                .getInstance()
                .flush();

        System.out.println(
                "Report Generated");
    }
}