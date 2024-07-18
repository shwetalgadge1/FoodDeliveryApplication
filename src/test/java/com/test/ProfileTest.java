package com.test;


	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.pom.ProfilePage;

	public class ProfileTest extends BaseTest {

	    @Test
	    public void testProfile() {
	        ProfilePage profilePage = new ProfilePage(driver);
	        profilePage.openProfile();
	        Assert.assertTrue(profilePage.isProfileDisplayed(), "Profile is not displayed");
	    }
	}

