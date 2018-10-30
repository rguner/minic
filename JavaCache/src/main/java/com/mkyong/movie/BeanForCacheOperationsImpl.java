package com.mkyong.movie;

import net.sf.ehcache.Ehcache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.ConcurrentMap;

@Component("beanForCacheOperations")
public class BeanForCacheOperationsImpl implements BeanForCacheOperations {

	private static final Logger log = LoggerFactory.getLogger(BeanForCacheOperationsImpl.class);

	@Autowired
	private org.springframework.cache.CacheManager cacheManager;

	@CacheEvict(beforeInvocation = false, value = {"movieFindCache"}, allEntries = true)
	public void cacheSilme() {
		log.info("--------------- cache silme çalışıyor in BeanForCacheOperationsImpl");
	}

	public void cacheBilgi() {
		System.out.println("cacheBilgi ------------------------------------");
		System.out.println(cacheManager.toString());
		System.out.println(cacheManager.getCacheNames());
		ValueWrapper a = cacheManager.getCache("movieFindCache").get("dummy");
		if (a != null) {
			Movie m = (Movie) a.get();
			System.out.println(m.getId() + " " + m.getName());
		}
		// cache key leri listeleme..
		Cache cache = cacheManager.getCache("movieFindCache");
		System.out.println("CacheManager -->" + cache.toString());
		if (cache.getNativeCache() instanceof ConcurrentMap) {
			ConcurrentMap cm = (ConcurrentMap) cache.getNativeCache();
			Set keySet = cm.keySet();
			System.out.println(keySet);
		} else {
			Ehcache cm = (Ehcache) cache.getNativeCache();
			System.out.println(cm);
		}

	}

}
