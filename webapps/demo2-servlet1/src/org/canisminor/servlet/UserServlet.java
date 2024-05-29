package org.canisminor.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String responseInfo = "<h1>YES</h1>";
        if ("admin".equals(username)) {
            responseInfo = "<h1>NO</h1>";
        }

        resp.setHeader("Content-Type", "text/html");

        PrintWriter writer = resp.getWriter();
        writer.write(responseInfo);
    }
}
