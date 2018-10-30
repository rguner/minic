package com.mkyong.test;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableCaching
@ComponentScan({"com.mkyong.*"})
public class AppConfig {

	@Bean
	public EhCacheCacheManager cacheManager() {
		return new EhCacheCacheManager(ehCacheCacheManager().getObject());
	}

	@Bean
	public EhCacheManagerFactoryBean ehCacheCacheManager() {
		EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
		cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
		cmfb.setShared(true);

		return cmfb;
	}

	// public static ConcurrentMapCacheManager concurrentMapCacheManager;
	//
	// @Bean
	// public CacheManager defaultCacheManager() {
	// // return new ConcurrentMapCacheManager("movieFindCache");
	//
	// // tek cache manager ile farklı contextlerde aynı cache manager kullanilması saglandi.. ( SOL mobile yansımama sorunu çözümü)
	// // ornekte obj ile obj2 aynı cache sahip olmus oldu.
	// if (concurrentMapCacheManager == null)
	// concurrentMapCacheManager = new ConcurrentMapCacheManager("movieFindCache");
	// return concurrentMapCacheManager;
	//
	// }

}
