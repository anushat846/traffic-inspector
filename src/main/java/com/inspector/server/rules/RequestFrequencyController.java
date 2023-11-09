package com.inspector.server.rules;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RequestFrequencyController {
	
	int MAXIMUM_ALLOWED_FREQUENCY = 10;
	
	Map<String, Integer> REQUEST_COUNTER = new HashMap<String, Integer>();
	
	public boolean validateRequest(String requestOrigin) {
		// TODO Implement logic to validate request frequency
		JedisPool pool = new JedisPool("localhost", 6379);
		Jedis jedis = pool.getResource();
		//check if request origin exists in the redis server
		if (jedis.exists(requestOrigin)) {
			jedis.incr(requestOrigin);
		}else {
			jedis.set(requestOrigin,"1");
		}
		 int currentfrequency=Integer.parseInt(jedis.get(requestOrigin));
		 if(currentfrequency<=MAXIMUM_ALLOWED_FREQUENCY) {
			 return true;
		 }
		 return false;
				
	}
}
