package com.inspector.server.rules;

import java.util.ArrayList;
import java.util.List;

/*
 * Goal: Validate request origin against allowed list of IPs
 * 
 */

public class RequestOriginController {
	
	public RequestOriginController() {
		List<String> ALLOWED_IPS = new ArrayList<String>();
		ALLOWED_IPS.add("192.168.1.11");
		ALLOWED_IPS.add("192.168.1.12");
	}
	
	public boolean validateRequest(String requestOrigin) {
		// TODO Implement logic to validate request origin
		
		// check if requestOrigin is in the ALLOWED_IPS array list
		
		// if exists return true. Otherwise, false.
		
		return true;
	}
}
