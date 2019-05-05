package com.itcast.learnspringboot.config;

import javax.servlet.*;
import java.io.IOException;
/**
 *
 * 过滤器
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进过滤器了");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
