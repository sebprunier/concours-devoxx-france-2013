package com.sebprunier.devoxxfr.jajascript;

import com.sebprunier.devoxxfr.Resource;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OptimizeResource implements Resource {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String demands = IOUtils.toString(request.getReader());
        System.out.println(demands);
    }
}
