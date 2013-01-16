package com.sebprunier.devoxxfr.statement;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.sebprunier.devoxxfr.Resource;

public class StatementResource implements Resource {

    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String enonce = IOUtils.toString(request.getReader());
        System.out.println(enonce);
        String enonceId = request.getRequestURI().split("/")[2];
        boolean published = new GistPublisher().publish(enonceId, enonce);
        if (published) {
            response.setStatus(HttpServletResponse.SC_CREATED);
        } else {
            System.err.println("Error while pushing Gist !");
            response.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
        }
        response.flushBuffer();
    }

}
