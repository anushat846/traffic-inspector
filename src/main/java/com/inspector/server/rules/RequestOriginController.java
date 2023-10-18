package com.inspector.server.rules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Goal: Validate request origin against allowed list of IPs
 * 
 */

public class RequestOriginController {
	
	List<String> ALLOWED_IPS;
	
	public RequestOriginController() {
		ALLOWED_IPS = new ArrayList<String>();
		ALLOWED_IPS.add("192.168.1.11");
		ALLOWED_IPS.add("192.168.1.12");
	}
	
	public boolean validateRequest(String requestOrigin) {
		// TODO Implement logic to validate request origin
		
		/* check if requestOrigin is in the ALLOWED_IPS array list
		int index=ALLOWED_IPS.indexOf(requestOrigin);
		
		// if exists return true. Otherwise, false.
		if(index>=0) {
			return true;
		}
		return false;
		*/
		Iterator<String>it=ALLOWED_IPS.iterator();
		while(it.hasNext()) {
			
			if(it.next()==requestOrigin) {
				return true;
			}
		}
		return false;
		
				
	}
}
