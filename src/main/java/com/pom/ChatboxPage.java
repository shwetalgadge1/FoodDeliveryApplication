package com.pom;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

	public class ChatboxPage extends BasePage {
	    WebDriver driver;

	    @FindBy(id = "chatbox_button")
	    WebElement chatboxButton;

	    @FindBy(id = "chatbox_input")
	    WebElement chatboxInput;

	    @FindBy(id = "chatbox_send")
	    WebElement chatboxSendButton;

	    public ChatboxPage(WebDriver driver) {
	    	 super(driver);
	        PageFactory.initElements(driver, this);
	    }

	    public void openChatbox() {
	        chatboxButton.click();
	    }

	    public void sendMessage(String message) {
	        chatboxInput.sendKeys(message);
	        chatboxSendButton.click();
	    }

	    public boolean isChatboxOpen() {
	        return chatboxInput.isDisplayed();
	    }
	}



