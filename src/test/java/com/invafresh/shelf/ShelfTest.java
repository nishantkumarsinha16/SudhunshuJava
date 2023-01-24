package com.invafresh.shelf;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShelfTest {

	@Test
	public void TakeValueEmpty() {
		Shelf shelf = new Shelf();
		shelf.put(null);
		shelf.put("");
		Assert.assertFalse(shelf.take(null));
		Assert.assertFalse(shelf.take(""));
	}

	@Test
	public void TakeValueOnce() {
		Shelf shelf = new Shelf();
		shelf.put("Orange");
		shelf.put("Orange");
		Assert.assertTrue(shelf.take("Orange"));
		Assert.assertTrue(shelf.take("Orange"));
	}
	@Test
	public void TakeValueTwice() {
		Shelf shelf = new Shelf();
		shelf.put("Orange");
		Assert.assertTrue(shelf.take("Orange"));
		Assert.assertTrue(shelf.take("Orange"));
	}

}
