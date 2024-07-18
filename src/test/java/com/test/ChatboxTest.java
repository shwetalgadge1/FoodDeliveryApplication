package com.test;



	
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.pom.ChatboxPage;

	public class ChatboxTest extends BaseTest {

	    @Test
	    public void testChatbox() {
	        ChatboxPage chatboxPage = new ChatboxPage(driver);
	        chatboxPage.openChatbox();
	        Assert.assertTrue(chatboxPage.isChatboxOpen(), "Chatbox is not open");
	        chatboxPage.sendMessage("Hello, this is a test message!");
	    }
	}


