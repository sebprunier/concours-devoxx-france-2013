package com.sebprunier.devoxxfr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Resource {

    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
