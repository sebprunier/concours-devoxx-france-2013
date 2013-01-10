package com.sebprunier.devoxxfr;

import org.apache.commons.io.IOUtils;
import org.mortbay.jetty.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WebServerHandler extends AbstractHandler {

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch)
            throws IOException, ServletException {
        if ("POST".equals(request.getMethod())) {
            String body = IOUtils.toString(request.getInputStream());
            System.out.println(body);
        } else if ("GET".equals(request.getMethod()) && "/".equals(target)
                && request.getParameter(QuestionResource.QUESTION_PARAMETER) != null) {
            new QuestionResource().handle(request, response);
        } else {
            System.out.println("Unmanaged request : " + target);
        }

    }
}
