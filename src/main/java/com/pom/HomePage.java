package com.pom;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BasePage;

public class HomePage extends BasePage {

    @FindBy(id = "search-input") // Replace with the actual locator
    WebElement searchInput;

    @FindBy(id = "search-button") // Replace with the actual locator
    WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchRestaurant(String restaurant) {
        searchInput.sendKeys(restaurant);
        searchButton.click();
    }
}
