package com.itcast.learnspringboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**将springboot 项目打成war包发布到外部tomcat
 * @Auther:zhangpeng
 * @Date:2019/5/4
 * @Description:com.itcast.learnspringboot
 * @Version:1.0
 */

public class MySpringBootInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder.sources(LearnspringbootApplication.class));
    }
}
