package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.SignupPage;

public class SignupTest extends BaseTest {
    private SignupPage signupPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        signupPage = new SignupPage(driver);
    }

    @Test
    public void testCreateAccount() {
        basePage.goToSignupPage();
        signupPage.createAccount("testuser", "testemail@example.com", "testpassword");
        // Add assertions to verify successful account creation
    }
}
