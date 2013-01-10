package com.sebprunier.devoxxfr;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Resource {

    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
