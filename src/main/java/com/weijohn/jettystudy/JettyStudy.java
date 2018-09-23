package com.weijohn.jettystudy;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by vincent on 24/09/2018.
 */
public class JettyStudy extends AbstractHandler {


    public static void main(String[] args) throws Exception

    {

        Server server = new Server(8080);

        server.setHandler(new JettyStudy());

        server.start();

        server.join();

    }


    @Override
    public void handle(String target,

                       Request baseRequest,

                       HttpServletRequest request,

                       HttpServletResponse response) throws IOException, ServletException

    {


        response.setContentType("text/html;charset=utf-8");

        response.setStatus(HttpServletResponse.SC_OK);

        baseRequest.setHandled(true);

        String name = request.getParameter("name");
        System.out.println("name=" + name);
        System.out.println("-------------------------------------");

        String name1 = baseRequest.getParameter("name");
        System.out.println("name1=" + name1);

        response.getWriter().println(name);


    }
}


