package com.Utils;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import java.util.List;

	public class RestaurantListPage {
	    WebDriver driver;

	    @FindBy(css = ".restaurant-list .restaurant-item") // Replace with the actual locator
	    List<WebElement> restaurantList;

	    public RestaurantListPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public List<WebElement> getRestaurants() {
	        return restaurantList;
	    }
	}



