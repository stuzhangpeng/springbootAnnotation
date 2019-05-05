package com.itcast.learnspringboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.logging.Filter;

@Configuration
public class MyServerConfig {
    /**
     * 配置servlet、listener、filter三大组件
     *
     * @return
     */
   /* @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        //配置servlet
       return new ServletRegistrationBean(new MyServlet(), "/myServlet","/aa");
    }*/

    /*@Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        *//*
         * 配置linstener
         *
         *
         *
         *//*
        return new ServletListenerRegistrationBean<MyListener>(new MyListener());
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        *//*
         * 配置filter
         *
         *
         *
         *//*
        FilterRegistrationBean myFilterFilterRegistrationBean = new FilterRegistrationBean<>();
        myFilterFilterRegistrationBean.setFilter(new MyFilter());
        myFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/aa","/myServlet"));
        return myFilterFilterRegistrationBean;
    }*/

}
