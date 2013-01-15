package com.sebprunier.devoxxfr;

import com.sebprunier.devoxxfr.jajascript.OptimizeResource;
import com.sebprunier.devoxxfr.scalaskel.ScalaskelChangeResource;
import org.mortbay.jetty.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WebServerHandler extends AbstractHandler {

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch)
            throws IOException, ServletException {
        if ("POST".equals(request.getMethod()) && target.startsWith("/enonce/")) {
            new StatementResource().handle(request, response);
        } else if ("POST".equals(request.getMethod()) && target.equals("/jajascript/optimize")) {
            new OptimizeResource().handle(request, response);
        } else if ("GET".equals(request.getMethod()) && "/".equals(target)
                && request.getParameter(QuestionResource.QUESTION_PARAMETER) != null) {
            new QuestionResource().handle(request, response);
        } else if ("GET".equals(request.getMethod()) && target.startsWith("/scalaskel/change/")) {
            new ScalaskelChangeResource().handle(request, response);
        } else {
            System.out.println("Unmanaged request : " + target);
            response.setContentType("text/plain");
            response.setStatus(HttpServletResponse.SC_OK);
            PrintWriter writer = response.getWriter();
            writer.println("Nothing here ...");
            writer.close();
        }

    }
}
