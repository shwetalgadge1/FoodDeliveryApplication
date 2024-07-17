package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class AddRestaurantPage extends BasePage {

    @FindBy(id = "add-restaurant-link") // Replace with the actual locator
    WebElement addRestaurantLink;

    @FindBy(name = "restaurantName") // Replace with the actual locator
    WebElement restaurantName;

    @FindBy(name = "restaurantAddress") // Replace with the actual locator
    WebElement restaurantAddress;

    @FindBy(name = "restaurantPhone") // Replace with the actual locator
    WebElement restaurantPhone;

    @FindBy(xpath = "//button[@type='submit']") // Replace with the actual locator
    WebElement addRestaurantButton;

    public AddRestaurantPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addRestaurant(String name, String address, String phone) {
        addRestaurantLink.click();
        restaurantName.sendKeys(name);
        restaurantAddress.sendKeys(address);
        restaurantPhone.sendKeys(phone);
        addRestaurantButton.click();
    }
}
