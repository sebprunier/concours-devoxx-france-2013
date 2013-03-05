package com.sebprunier.devoxxfr.scalaskel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.sebprunier.devoxxfr.Resource;

public class ScalaskelChangeResource implements Resource {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pathValue = request.getRequestURI().split("/")[3];

        Set<Map<Coin, Integer>> solutions = new ScalaskelChangeSolver().solve(Integer.valueOf(pathValue));

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        List<String> jsonSolutions = new ArrayList<String>();
        for (Map<Coin, Integer> solution : solutions) {
            String jsonSolution = "{";
            List<String> coins = new ArrayList<String>();
            for (Map.Entry<Coin, Integer> res : solution.entrySet()) {
                String s = new SolutionElementToStringFunction().apply(res);
                if (s != null) {
                    coins.add(s);
                }
            }
            jsonSolution += Joiner.on(',').join(coins.iterator());
            jsonSolution += "}";
            jsonSolutions.add(jsonSolution);
        }
        builder.append(Joiner.on(',').join(jsonSolutions.iterator()));

        builder.append("]");

        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter writer = response.getWriter();
        writer.println(builder.toString());
        writer.close();
    }

    private static class SolutionElementToStringFunction implements Function<Map.Entry<Coin, Integer>, String> {
        @Override
        public String apply(Entry<Coin, Integer> input) {
            Coin coin = input.getKey();
            Integer numberOfCoins = input.getValue();
            if (numberOfCoins != 0) {
                return "\"" + coin.toString().toLowerCase() + "\":" + numberOfCoins;
            }
            return null;
        }
    }
}
