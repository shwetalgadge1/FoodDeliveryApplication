package com.pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

	public class ProfilePage extends BasePage{
	    WebDriver driver;

	    @FindBy(id = "profile_button")
	    WebElement profileButton;

	    @FindBy(xpath = "//div[@class='profile-details']")
	    WebElement profileDetails;

	    public ProfilePage(WebDriver driver) {
	    	 super(driver);
	        PageFactory.initElements(driver, this);
	    }

	    public void openProfile() {
	        profileButton.click();
	    }

	    public boolean isProfileDisplayed() {
	        return profileDetails.isDisplayed();
	    }
	}



