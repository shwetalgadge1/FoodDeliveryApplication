package com.pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

	public class WishlistPage extends BasePage{
	    WebDriver driver;

	    @FindBy(id = "wishlist_button")
	    WebElement wishlistButton;

	    @FindBy(xpath = "//div[@class='wishlist-items']")
	    WebElement wishlistItems;

	   
	        public WishlistPage(WebDriver driver) {
	            super(driver);
	            PageFactory.initElements(driver, this);
	    }

	    public void clickWishlistButton() {
	        wishlistButton.click();
	    }

	    public boolean isWishlistDisplayed() {
	        return wishlistItems.isDisplayed();
	    }
	}


