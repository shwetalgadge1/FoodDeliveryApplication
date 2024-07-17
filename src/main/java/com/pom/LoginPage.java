package com.pom;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BasePage;

public class LoginPage extends BasePage {

    @FindBy(id = "signin-link") // Replace with the actual locator
    WebElement loginLink;

    @FindBy(name = "username") // Replace with the actual locator
    WebElement username;

    @FindBy(name = "password") // Replace with the actual locator
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']") // Replace with the actual locator
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String pass) {
        loginLink.click();
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }
}
