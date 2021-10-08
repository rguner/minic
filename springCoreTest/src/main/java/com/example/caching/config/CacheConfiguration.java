package com.example.caching.config;

import com.google.common.cache.CacheBuilder;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

@EnableCaching
@Configuration
public class CacheConfiguration extends CachingConfigurerSupport {

	@Bean
	@Override
	public CacheManager cacheManager() {

		return new ConcurrentMapCacheManager() {

			@Override
			protected Cache createConcurrentMapCache(final String name) {
				ConcurrentMap<Object, Object> map = CacheBuilder.newBuilder().expireAfterWrite(15, TimeUnit.MINUTES).maximumSize(10000).build().asMap();
				return new ConcurrentMapCache(name, map, false);
			}
		};
	}

	@Override
	public KeyGenerator keyGenerator() {
		return new CacheKeyGenerator();
	}

}
