package com.sebprunier.devoxxfr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mortbay.jetty.handler.AbstractHandler;

import com.sebprunier.devoxxfr.capitalize.CapitalizeResource;
import com.sebprunier.devoxxfr.jajascript.OptimizeResource;
import com.sebprunier.devoxxfr.question.QuestionResource;
import com.sebprunier.devoxxfr.scalaskel.ScalaskelChangeResource;
import com.sebprunier.devoxxfr.statement.StatementResource;

public class WebServerHandler extends AbstractHandler {

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch)
            throws IOException, ServletException {
        String method = request.getMethod();
        // Handle statements post requests
        if ("POST".equals(method) && target.startsWith("/enonce/")) {
            new StatementResource().handle(request, response);
        }
        // Handle flight optimization requests (Statement 2 - Jajascript)
        else if ("POST".equals(method) && target.equals("/jajascript/optimize")) {
            new OptimizeResource().handle(request, response);
        }
        // Handle questions
        else if ("GET".equals(method) && "/".equals(target)
                && request.getParameter(QuestionResource.QUESTION_PARAMETER) != null) {
            new QuestionResource().handle(request, response);
        }
        // Handle change requests (Statement 1 - Scalaskel)
        else if ("GET".equals(method) && target.startsWith("/scalaskel/change/")) {
            new ScalaskelChangeResource().handle(request, response);
        }
        else if ("GET".equals(method) && target.startsWith("/capitalize")) {
        	new CapitalizeResource().handle(request, response);
        }
        // Unknown request ...
        else {
            System.out.println("Unmanaged request : " + target);
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.flushBuffer();
        }

    }
}
