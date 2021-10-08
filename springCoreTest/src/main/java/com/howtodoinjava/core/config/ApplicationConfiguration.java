package com.howtodoinjava.core.config;

import com.example.caching.CacheRunner;
import com.example.caching.SimpleBookRepository;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.howtodoinjava.core.beans.DemoManager;
import com.howtodoinjava.core.beans.DemoManagerImpl;

@Configuration
@ComponentScan(basePackages = {"com.example","com.howtodoinjava"})
public class ApplicationConfiguration {

}
