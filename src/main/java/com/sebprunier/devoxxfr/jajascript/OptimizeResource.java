package com.sebprunier.devoxxfr.jajascript;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sebprunier.devoxxfr.Resource;

public class OptimizeResource implements Resource {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Get flight demands
        String jsonDemands = IOUtils.toString(request.getReader());
        System.out.println(jsonDemands);
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        List<FlightDemand> demands = gson.fromJson(jsonDemands, new TypeToken<List<FlightDemand>>() {
        }.getType());

        System.out.println("Number of flights : " + demands.size());

        // Solve !
        long start = System.currentTimeMillis();
        OptimizedPlanningSolver solver = new OptimizedPlanningSolver(demands);
        solver.solve();
        FlightPlanning optimizedPlanning = solver.getOptimizedPlanning();
        System.out.println("Jajascript flight optimization took " + (System.currentTimeMillis() - start) + " ms");

        // Send optimized planning
        String jsonData = gson.toJson(optimizedPlanning);
        System.out.println(jsonData);
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_CREATED);
        PrintWriter writer = response.getWriter();
        writer.println(jsonData);
        writer.close();
    }
}
