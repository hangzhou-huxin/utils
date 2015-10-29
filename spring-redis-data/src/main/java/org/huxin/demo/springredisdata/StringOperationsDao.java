package org.huxin.demo.springredisdata;

import java.util.Iterator;
import java.util.Set;

import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

public class StringOperationsDao {
	
	private StringRedisTemplate redisTemplate ;
	
	
	
	
	public void setRedisTemplate(StringRedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	
	

	public StringRedisTemplate getRedisTemplate() {
		return redisTemplate;
	}




	public void add(String key , String value){
		redisTemplate.boundValueOps(key).set(value); 
	}
	
	public String find(String key){
		return redisTemplate.boundValueOps(key).get() ;
	}
	
	public void keys(){
		Set<String> set = redisTemplate.keys( "*") ;
		Iterator<String> iterator = set.iterator() ;
		while(iterator.hasNext()){
			final String  key = iterator.next() ;
			
			
			System.out.println(key);
			// redisTemplate.delete(key);
		}
	}
	
	
	public void delete(){
		Set<String> set = redisTemplate.keys( "*") ;
		Iterator<String> iterator = set.iterator() ;
		while(iterator.hasNext()){
			final String  key = iterator.next() ;
			 redisTemplate.execute(new RedisCallback<Object>() {  
			        public Object doInRedis(RedisConnection connection) {  
			            connection.del(redisTemplate.getStringSerializer().serialize(  
			                    key));  
			            return null;  
			        }  
			    });  
			
			System.out.println(key);
			// redisTemplate.delete(key);
		}
	}

}
