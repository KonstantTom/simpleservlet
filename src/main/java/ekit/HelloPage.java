/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ekit;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Konstant
 */
public class HelloPage  extends HttpServlet {
    private String responseTemplate;
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }
 
    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        setPage(request);
        response.setStatus(200);
        response.getWriter().write(responseTemplate);
    }
    private void setPage(HttpServletRequest request)
    {
        responseTemplate = "<!doctype html>\n" +
        "<html>\n" +
        "<body>\n" +
        "<pre><font color=\"#6405FD\" size=\"20\">Hello, " + request.getParameter("name") + " !</font></pre>\n" +
        "</body>\n" +
        "</html>" ;
    }
}
