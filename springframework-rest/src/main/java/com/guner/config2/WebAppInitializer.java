package com.guner.config2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/*
    https://www.baeldung.com/spring-controllers
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.guner")
public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext root =
                new AnnotationConfigWebApplicationContext();
        root.register(MvcConfiguration.class);

        root.refresh();
        root.setServletContext(servletContext);

        servletContext.addListener(new ContextLoaderListener(root));

        DispatcherServlet dv =
                new DispatcherServlet(new GenericWebApplicationContext());

        ServletRegistration.Dynamic appServlet = servletContext.addServlet("test-mvc", dv);
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping("/*");

    }
}