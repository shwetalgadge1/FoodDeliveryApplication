
package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.CreateAccountPage;

public class CreateAccountTest extends BaseTest {
    private CreateAccountPage createAccountPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        createAccountPage = new CreateAccountPage(driver);
    }

    @Test
    public void testCreateAccount() {
        createAccountPage.createAccount("testuser", "testemail@example.com", "testpassword");
        // Add assertions to verify successful account creation
    }
}
