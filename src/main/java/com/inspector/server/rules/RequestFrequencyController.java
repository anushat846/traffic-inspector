package com.inspector.server.rules;

import java.util.HashMap;
import java.util.Map;

public class RequestFrequencyController {
	
	int MAXIMUM_ALLOWED_FREQUENCY = 10;
	
	Map<String, Integer> REQUEST_COUNTER = new HashMap<String, Integer>();
	
	public boolean validateRequest(String requestOrigin) {
		// TODO Implement logic to validate request frequency
		
		// check if requestOrigin exists in the REQUEST_COUNTER map
		
			// if not exists, initialize with 0
		
			// if exists, increment the counter by 1
		
		// check if the counter value is <= MAXIMUM_ALLOWED_FREQUENCY
		
		// if in the limits, return true. Otherwise, false.
		
		return true;
	}
}
