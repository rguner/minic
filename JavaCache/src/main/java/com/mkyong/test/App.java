package com.mkyong.test;

import com.mkyong.movie.BeanForCacheOperations;
import com.mkyong.movie.MovieDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MovieDao obj = (MovieDao) context.getBean("movieDao");
		BeanForCacheOperations beanForCacheOperations = (BeanForCacheOperations) context.getBean("beanForCacheOperations");

		log.debug("Result : {}", obj.findByDirector("dummy"));
		log.debug("Result : {}", obj.findByDirector("dummy"));
		log.debug("Result : {}", obj.findByDirector("dummy2"));
		log.debug("Result : {}", obj.findByDirector("dummy2"));
		obj.cacheBilgi();
		beanForCacheOperations.cacheBilgi();
		obj.cacheSilme();
		log.debug("Result : {}", obj.findByDirector("dummy"));
		log.debug("Result : {}", obj.findByDirector("dummy2"));

		// iki ayri web uygulaması gibi iki ayrı app contextde nasıl davranır?..
		// sonuc --> CacheManager instance'lar farkli...
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		MovieDao obj2 = (MovieDao) context2.getBean("movieDao");
		BeanForCacheOperations beanForCacheOperations2 = (BeanForCacheOperations) context2.getBean("beanForCacheOperations");
		obj2.cacheBilgi();
		log.debug("Result : {}", obj2.findByDirector("dummy"));
		log.debug("Result : {}", obj2.findByDirector("dummy3"));
		obj2.cacheBilgi();

		beanForCacheOperations.cacheSilme();
		beanForCacheOperations2.cacheSilme();

		obj.cacheBilgi();
		obj2.cacheBilgi();

		// shut down the Spring context so that Ehcache got chance to shut down as well
		((ConfigurableApplicationContext) context2).close();

		// shut down the Spring context so that Ehcache got chance to shut down as well
		((ConfigurableApplicationContext) context).close();

	}

}
