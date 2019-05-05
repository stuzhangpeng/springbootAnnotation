package com.itcast.learnspringboot.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * 写linstener
 *
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("fuwuqi启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
