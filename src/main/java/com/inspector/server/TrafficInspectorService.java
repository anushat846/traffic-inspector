package com.inspector.server;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class TrafficInspectorService {

	public ResponseEntity<String> processRequest(String body, HttpMethod method, HttpServletRequest request,
			HttpServletResponse response, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
