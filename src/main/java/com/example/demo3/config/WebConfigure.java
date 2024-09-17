package com.example.demo3.config;

import com.example.demo3.web.FirstServlet;
import com.example.demo3.web.MyFilter;
import com.example.demo3.web.MyListener;
import com.example.demo3.web.SecondServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration

public class WebConfigure {
    @Bean
    public ServletRegistrationBean fistServlet(){
        return  new ServletRegistrationBean(new FirstServlet(),"/first");
    }
    @Bean
    public ServletRegistrationBean secondServlet(){
        return  new ServletRegistrationBean(new SecondServlet(),"/second");
    }
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/first"));
        return  filterRegistrationBean;
    }
    @Bean
    public ServletListenerRegistrationBean myListener(){
        return  new ServletListenerRegistrationBean(new MyListener());
    }
}