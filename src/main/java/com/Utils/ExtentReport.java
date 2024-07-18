package com.Utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Setup ExtentReports and attach the reporter
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Optional: Additional configurations
        htmlReporter.config().setReportName("Zomato Login Test Report");
        htmlReporter.config().setDocumentTitle("Test Report");
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            { "gadgeshwetal@gmailcom", "shwetal" },
            { "user2@example.com", "password2" }
        };
    }

    @Test(dataProvider = "loginData")
    public void zomatoLoginTest(String email, String password) {
        test = extent.createTest("Zomato Login Test", "Test to validate Zomato login functionality with different credentials");

        try {
            driver.get("https://www.zomato.com/");
            test.log(Status.INFO, "Navigated to Zomato");

            // Locate and interact with login elements
            WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
            loginButton.click();
            test.log(Status.INFO, "Clicked login button");

            WebElement emailInput = driver.findElement(By.xpath("//input[@type='email']"));
            emailInput.sendKeys(email);
            test.log(Status.INFO, "Entered email: " + email);

            WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
            passwordInput.sendKeys(password);
            test.log(Status.INFO, "Entered password");

            WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
            submitButton.click();
            test.log(Status.INFO, "Clicked submit button");

            // Check for login success
            // Note: Update the success criteria based on Zomato's login success indications
            String title = driver.getTitle();
            if (title.contains("Zomato")) {
                test.log(Status.PASS, "Login successful");
            } else {
                test.log(Status.FAIL, "Login failed");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed due to exception: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        
        if (extent != null) {
            extent.flush();
        }
    }
}
