package com.test;



	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import com.Utils.RestaurantListPage;
import com.pom.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

	import static org.testng.Assert.assertTrue;

	public class RestaurantListTest {
	    WebDriver driver;
	    HomePage homePage;
	    RestaurantListPage restaurantListPage;

	    @BeforeClass
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.zomato.com/");
	        homePage = new HomePage(driver);
	        restaurantListPage = new RestaurantListPage(driver);
	    }

	    @Test
	    public void testRestaurantList() {
	        homePage.searchRestaurant("test restaurant");
	        List<WebElement> restaurants = restaurantListPage.getRestaurants();
	        assertTrue(restaurants.size() > 0, "No restaurants found");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}



