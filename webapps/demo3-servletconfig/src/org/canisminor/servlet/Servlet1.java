package org.canisminor.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

public class Servlet1 extends HttpServlet {
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

        ServletContext servletContext1 = servletConfig.getServletContext();
        ServletContext servletContext2 = req.getServletContext();
        ServletContext servletContext3 = getServletContext();
        System.out.println(servletContext1 == servletContext2);
        System.out.println(servletContext2 == servletContext3);

        Enumeration<String> initParameterNames1 = servletContext1.getInitParameterNames();
        while (initParameterNames1.hasMoreElements()) {
            String parameterName = initParameterNames1.nextElement();
            System.out.println(parameterName + ": " + servletContext1.getInitParameter(parameterName));
        }

        servletContext1.setAttribute("k_1", "v_1");
        servletContext1.setAttribute("k_2", "v_2");
    }
}
