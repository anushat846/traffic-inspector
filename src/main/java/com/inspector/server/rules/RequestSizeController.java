package com.inspector.server.rules;

public class RequestSizeController {
	
	long MAXIMUM_REQUEST_BODY_SIZE = 100;
	

	public boolean validateRequest(long requestBodySize) {
		// check if requestBodySize is <= allowed maximum body size. If the body size is in allowed limit, then return true. Otherwise, false.
		if (requestBodySize <= MAXIMUM_REQUEST_BODY_SIZE) {
			return true;
		}
		
		return false;
	}
}
