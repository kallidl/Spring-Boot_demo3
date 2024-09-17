package com.example.demo3.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebFilter("/first")

public class MyFilter  implements Filter {
    @Override
    public void doFilter(ServletRequest requ, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("处理请求前的处理");
        filterChain.doFilter(requ,resp);
        System.out.println("处理请求后的处理");
    }
}
