package com.sebprunier.devoxxfr.capitalize;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sebprunier.devoxxfr.Resource;

public class CapitalizeResource implements Resource {

	public static final String DATA_PARAMETER = "data";
	
	public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String data = request.getParameter(DATA_PARAMETER);
		response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter writer = response.getWriter();
        writer.println(data.toUpperCase());
        writer.close();
	}

}
