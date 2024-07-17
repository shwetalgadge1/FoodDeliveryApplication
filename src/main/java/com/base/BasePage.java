package com.base;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    @FindBy(id = "signup-link") // Replace with the actual locator
    protected WebElement signUpLink;

    @FindBy(id = "signin-link") // Replace with the actual locator
    protected WebElement loginLink;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToSignupPage() {
        signUpLink.click();
    }

    public void goToLoginPage() {
        loginLink.click();
    }
}

