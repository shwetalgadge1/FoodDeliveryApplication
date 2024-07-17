package com.test;



	


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.HomePage;

public class HomePageTest extends BaseTest {
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        homePage = new HomePage(driver);
    }

    @Test
    public void testSearchRestaurant() {
        homePage.searchRestaurant("test restaurant");
        // Add assertions to verify the search results
    }
}
