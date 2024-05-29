package org.canisminor.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        // 获取所有初始参数名
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();

        // 根据参数名获取参数值
        while (initParameterNames.hasMoreElements()) {
            String parameterName = initParameterNames.nextElement();
            System.out.println(parameterName + ": " + servletConfig.getInitParameter(parameterName));
        }
    }
}
