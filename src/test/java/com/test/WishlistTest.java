package com.test;



	
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.pom.WishlistPage;

	public class WishlistTest extends BaseTest {

	    @Test
	    public void testWishlist() {
	        WishlistPage wishlistPage = new WishlistPage(driver);
	        wishlistPage.clickWishlistButton();
	        Assert.assertTrue(wishlistPage.isWishlistDisplayed(), "Wishlist is not displayed");
	    }
	}


