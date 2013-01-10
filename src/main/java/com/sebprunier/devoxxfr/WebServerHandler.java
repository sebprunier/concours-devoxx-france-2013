package com.sebprunier.devoxxfr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mortbay.jetty.handler.AbstractHandler;

public class WebServerHandler extends AbstractHandler {

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch)
            throws IOException, ServletException {
        if ("GET".equals(request.getMethod()) && "/".equals(target)
                && request.getParameter(QuestionResource.QUESTION_PARAMETER) != null) {
            new QuestionResource().handle(request, response);
        } else {
            dumpRequest(request);
        }

    }

    private void dumpRequest(HttpServletRequest request) throws IOException {
        System.out.println("Unknown request : " + request.toString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String bodyLine = reader.readLine();
        while (bodyLine != null) {
            System.out.println(bodyLine);
            bodyLine = reader.readLine();
        }
    }
}
