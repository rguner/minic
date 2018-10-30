package com.mkyong.movie;

import net.sf.ehcache.Ehcache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.concurrent.ConcurrentMap;

@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {

	private static final Logger log = LoggerFactory.getLogger(MovieDaoImpl.class);

	@Autowired
	private org.springframework.cache.CacheManager cacheManager;

	@Cacheable(value = "movieFindCache", key = "#name")
	public Movie findByDirector(String name) {
		slowQuery(2000L);
		System.out.println("findByDirector is running...");
		log.info("--------------- findDirectory çalışıyor,  paramatre: " + name);
		return new Movie(1, "Forrest Gump", "Robert Zemeckis");
	}

	@CacheEvict(beforeInvocation = false, value = {"movieFindCache"}, allEntries = true)
	public void cacheSilme() {
		log.info("--------------- cache silme çalışıyor.");
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

	private void slowQuery(long seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}

}
