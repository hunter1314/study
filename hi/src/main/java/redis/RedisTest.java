package redis;

//import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {

//	@Test
	public void redisT() {
		Jedis js = new Jedis("127.0.0.1", 6379);
		js.set("string01", "my first redis value");
		
		System.out.println(js.get("string01"));
	}
}
