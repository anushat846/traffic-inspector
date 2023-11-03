package com.inspector.server.rules;

import org.junit.Assert;
import org.junit.Test;

public class RequestFrequencyControllerTest {
	@Test
	public void verifyValidRequestFrequencyController() {
		String requestOrigin="192.168.1.1";
		RequestFrequencyController rfc=new RequestFrequencyController();
		boolean result=rfc.validateRequest(requestOrigin);
		Assert.assertTrue(result);
	}
	@Test
	public void verifyInvalidRequestFrequencyController() {
		String requestOrigin="192.168.1.2";
		RequestFrequencyController rfc=new RequestFrequencyController();
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		rfc.validateRequest(requestOrigin);
		boolean result=rfc.validateRequest(requestOrigin);
		Assert.assertFalse(result);
		
	}

}
