package com.itcast.learnspringboot.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
public class MySpringMvcConfig {
    /**
     * 自定义webmvc配置
     *
     * @return
     */
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //添加拦截器
                InterceptorRegistration interceptor = registry.addInterceptor(new MyHandlerInterceptor());
                //配置拦截路径和放行路径
                interceptor.addPathPatterns("/**");
                interceptor.excludePathPatterns("/myServlet");
            }

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                //添加视图处理器
                registry.addViewController("/success").setViewName("success");
            }
        };

    }
}
