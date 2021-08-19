package com.guner.config3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;


// https://www.baeldung.com/spring-controllers

public class WebAppInitializer extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext
                = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(MvcConfiguration.class);
        return annotationConfigWebApplicationContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/*" };
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        // rootApplicationContext null olabilir..
        // return null;
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext
                = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(MvcConfiguration.class);
        return annotationConfigWebApplicationContext;
    }

}
