package com.inspector.server.rules;

import java.util.HashMap;
import java.util.Map;

public class RequestFrequencyController {
	
	int MAXIMUM_ALLOWED_FREQUENCY = 10;
	
	Map<String, Integer> REQUEST_COUNTER = new HashMap<String, Integer>();
	
	public boolean validateRequest(String requestOrigin) {
		// TODO Implement logic to validate request frequency
		
		// check if requestOrigin exists in the REQUEST_COUNTER map
		if(REQUEST_COUNTER.get(requestOrigin)==null) {
			REQUEST_COUNTER.put(requestOrigin, 1); // if not exists, initialize with 0
		}else {
			REQUEST_COUNTER.replace(requestOrigin, REQUEST_COUNTER.get(requestOrigin)+1); // if exists, increment the counter by 1
		}
		
		// check if the counter value is <= MAXIMUM_ALLOWED_FREQUENCY
		if(REQUEST_COUNTER.get(requestOrigin)<=MAXIMUM_ALLOWED_FREQUENCY) {
			return true; // if in the limits, return true. Otherwise, false.
		}
		return false;
		
	

	}
}
