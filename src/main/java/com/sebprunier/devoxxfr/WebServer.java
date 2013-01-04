package com.sebprunier.devoxxfr;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WebServer {

    public static void main(String[] args) throws Exception {
        int port = Integer.parseInt(System.getenv("PORT"));
        Server server = new Server(port);
        server.setHandler(new WebServerHandler());
        server.start();
        server.join();
    }

    private static class WebServerHandler extends AbstractHandler {

        private static final String QUERY_PARAMETER = "q";

        @Override
        public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch) throws IOException, ServletException {
            String question = request.getParameter(QUERY_PARAMETER);
            String answer = "Bad question ...";
            if ("Quelle est ton adresse email".equals(question)) {
                answer = "sebastien.prunier@gmail.com";
            }
            response.setContentType("text/plain;charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);
            PrintWriter writer = response.getWriter();
            writer.println(answer);
            writer.close();
        }
    }
}