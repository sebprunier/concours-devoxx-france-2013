package com.sebprunier.devoxxfr.jajascript;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
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
        // Get flight demands
        String jsonDemands = IOUtils.toString(request.getReader());
        System.out.println(jsonDemands);
        List<FlightDemand> demands = new Gson().fromJson(jsonDemands, new TypeToken<List<FlightDemand>>() {
        }.getType());

        // Sort demands by departureTime
        Collections.sort(demands, new Comparator<FlightDemand>() {
            @Override
            public int compare(FlightDemand f1, FlightDemand f2) {
                return f1.getDepartureTime().compareTo(f2.getDepartureTime());
            }
        });

        // Solve !
        OptimizedPlanningSolver solver = new OptimizedPlanningSolver(demands);
        solver.solve();
        FlightPlanning optimizedPlanning = solver.getOptimizedPlanning();

        // Send optimized planning
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_CREATED);
        PrintWriter writer = response.getWriter();
        writer.println(new Gson().toJson(optimizedPlanning));
        writer.close();
    }
}
