package com.sebprunier.devoxxfr.jajascript;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sebprunier.devoxxfr.Resource;

public class OptimizeResource implements Resource {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jsonDemands = IOUtils.toString(request.getReader());
        System.out.println(jsonDemands);

        List<FlightDemand> demands = new Gson().fromJson(jsonDemands, new TypeToken<List<FlightDemand>>(){}.getType());
        for (FlightDemand flightDemand : demands) {
            System.out.println(flightDemand);
        }
        
        response.setStatus(HttpServletResponse.SC_OK);
        response.flushBuffer();
    }
}
