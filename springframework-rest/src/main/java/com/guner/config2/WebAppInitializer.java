package com.guner.config2;

/*
INITILALIZE YOMTEM2

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


     // https://www.baeldung.com/spring-controllers

@Configuration
@EnableWebMvc
@ComponentScan("com.guner")
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
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext
                = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(WebAppInitializer.class);
        return annotationConfigWebApplicationContext;
    }
}
 */
public class WebAppInitializer {
}
