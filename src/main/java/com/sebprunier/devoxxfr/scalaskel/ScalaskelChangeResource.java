package com.sebprunier.devoxxfr.scalaskel;

import com.sebprunier.devoxxfr.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

public class ScalaskelChangeResource implements Resource {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pathValue = request.getRequestURI().split("/")[3];
        Set<Map<String, Integer>> solutions = new ScalaskelChangeSolver().solve(Integer.valueOf(pathValue));
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        String arraySeparator = "";
        for (Map<String, Integer> solution : solutions) {
            builder.append(arraySeparator + "{");
            String solutionSeparator = "";
            for (Map.Entry<String, Integer> res : solution.entrySet()) {
                Integer value = res.getValue();
                if (value != 0) {
                    builder.append(solutionSeparator + "\"" + res.getKey() + "\":" + value);
                    solutionSeparator = ",";
                }
            }
            builder.append("}");
            arraySeparator = ",";
        }
        builder.append("]");
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter writer = response.getWriter();
        writer.println(builder.toString());
        writer.close();
    }
}
