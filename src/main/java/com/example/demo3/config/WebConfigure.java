package com.example.demo3.config;

import com.example.demo3.web.FirstServlet;
import com.example.demo3.web.MyFilter;
import com.example.demo3.web.MyListener;
import com.example.demo3.web.SecondServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration

public class WebConfigure {
   @Bean("firstServlet")
    public FirstServlet firstServlet(){
        return  new FirstServlet();
    }
    @Bean("secondServlet")
    public SecondServlet secondServlet(){
        return  new SecondServlet();
    }
    @Bean
    public MyFilter myFilter(){
        return  new MyFilter();
    }
    @Bean
    public MyListener myListener(){
        return  new MyListener();
    }
}