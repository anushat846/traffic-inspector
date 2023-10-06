package com.inspector.server.rules;

import org.junit.Assert;
import org.junit.Test;

public class RequestSizeControllerTest {

	@Test
	public void verifyRequestSizeWithinTheLimits() {
		int bodySize = 80;
		RequestSizeController rcs = new RequestSizeController();
		boolean result = rcs.validateRequest(bodySize);
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyRequestSizeAboveTheLimits() {
		int bodySize = 120;
		RequestSizeController rcs = new RequestSizeController();
		boolean result = rcs.validateRequest(bodySize);
		Assert.assertFalse(result);
	}
}
