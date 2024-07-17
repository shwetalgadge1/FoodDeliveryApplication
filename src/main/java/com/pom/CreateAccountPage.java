package com.pom;

	


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BasePage;

public class CreateAccountPage extends BasePage {

    @FindBy(id = "signup-link") // Replace with the actual locator
    WebElement signUpLink;

    @FindBy(name = "username") // Replace with the actual locator
    WebElement username;

    @FindBy(name = "email") // Replace with the actual locator
    WebElement email;

    @FindBy(name = "password") // Replace with the actual locator
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']") // Replace with the actual locator
    WebElement signUpButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void createAccount(String user, String userEmail, String userPassword) {
        signUpLink.click();
        username.sendKeys(user);
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        signUpButton.click();
    }
}
