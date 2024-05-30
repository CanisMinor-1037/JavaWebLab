package org.canisminor.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(
        value = "/servlet3",
        initParams = {
                @WebInitParam(name = "k1", value = "v11"),
                @WebInitParam(name = "k2", value = "v22"),
                @WebInitParam(name = "k3", value = "v33"),
                @WebInitParam(name = "k4", value = "v44")
        }
)
public class Servlet3 extends HttpServlet {
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

        ServletContext servletContext = getServletContext();
        String path = servletContext.getRealPath("upload");
        System.out.println(path);
        String filename = "test.txt";
        //FileOutputStream fileOutputStream = new FileOutputStream(path + filename);

        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);

        System.out.println(servletContext.getAttribute("k_2"));
    }
}
