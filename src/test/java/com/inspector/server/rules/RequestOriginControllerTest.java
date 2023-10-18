package com.inspector.server.rules;

import org.junit.Assert;
import org.junit.Test;

public class RequestOriginControllerTest {
	@Test
	public void verifyValidRequestOriginController() {
		String ip="192.168.1.11";
		RequestOriginController roc=new RequestOriginController();
		boolean result=roc.validateRequest(ip);
		System.out.println(result);
		Assert.assertTrue(result);
	}
	@Test
	public void verifyInvalidRequestOriginController() {
		String ip="192.168.1.13";
		RequestOriginController roc=new RequestOriginController();
		boolean result=roc.validateRequest(ip);
		System.out.println(result);
		Assert.assertFalse(result);
	}

}
