package com.itcast.learnspringboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 连接池配置
 *
 */
@Configuration
public class ConnectionPoolConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource(){
        return  new DruidDataSource();
    }

    /**
     * 配置druid的监控
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        //配置servlet
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid");
        Map  <String,String> map=new HashMap<String, String>();
        map.put("loginUsername","root");
        map.put("loginPassword","zhangpeng");
        map.put("allow","");
        bean.setInitParameters(map);
        return bean;
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        //配置Druid的拦截器
        FilterRegistrationBean bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());
        Map  <String,String> map=new HashMap<String, String>();
        //设置放行资源
        map.put("exclusions","*.js,*.css");
        bean.setInitParameters(map);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
