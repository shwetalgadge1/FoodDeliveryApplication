package com.test;



	
	


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.LoginPage;

public class LoginPageTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.login("testuser", "testpassword");
        // Add assertions to verify successful login
    }
}
