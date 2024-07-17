package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class SignupPage extends BasePage {

    @FindBy(name = "username") // Replace with the actual locator
    WebElement username;

    @FindBy(name = "email") // Replace with the actual locator
    WebElement email;

    @FindBy(name = "password") // Replace with the actual locator
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']") // Replace with the actual locator
    WebElement signUpButton;

    public SignupPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void createAccount(String user, String userEmail, String userPassword) {
        username.sendKeys(user);
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        signUpButton.click();
    }
}
