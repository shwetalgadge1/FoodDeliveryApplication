package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.AddRestaurantPage;

public class AddRestaurantTest extends BaseTest {
    private AddRestaurantPage addRestaurantPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        addRestaurantPage = new AddRestaurantPage(driver);
    }

    @Test
    public void testAddRestaurant() {
        basePage.goToLoginPage(); // Assuming login is required before adding a restaurant
        // Add login steps here
        addRestaurantPage.addRestaurant("Test Restaurant", "123 Test Address", "1234567890");
        // Add assertions to verify successful restaurant addition
    }
}
