package com.sebprunier.devoxxfr.jajascript;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class OptimizedPlanningSolver {

    private FlightPlanning optimizedPlanning;

    private List<FlightDemand> sortedDemands;

    private Integer optimizedGain = 0;

    private String optimizedPath = "";

    public OptimizedPlanningSolver(List<FlightDemand> sortedDemands) {
        super();
        this.sortedDemands = sortedDemands;
    }

    public FlightPlanning getOptimizedPlanning() {
        return optimizedPlanning;
    }

    public void solve() {
        Stack<SolvingContext> stack = new Stack<SolvingContext>();
        stack.push(new SolvingContext(0, 0, 0, ""));
        while (!stack.isEmpty()) {
            SolvingContext context = stack.pop();
            Integer demandIndex = context.getDemandIndex();
            if (demandIndex >= sortedDemands.size()) {
                //optimizedPlanning = max(optimizedPlanning, currentPlanning);
                if (context.getGain() > optimizedGain) {
                    optimizedGain = context.getGain();
                    optimizedPath = context.getPath();
                }
            } else {
                // Try with next demand
                FlightDemand demand = sortedDemands.get(demandIndex);
                stack.push(new SolvingContext(context.getStartTime()+ demand.getFlightDuration(),
                        determineNextDemandIndex(demandIndex, demand.getDepartureTime() + demand.getFlightDuration()),
                        context.getGain() + demand.getPrice(),
                        context.getPath() + demandIndex + "|"));
                // Ignore next demand
                stack.push(new SolvingContext(context.getStartTime(), demandIndex + 1, context.getGain(), context.getPath()));
            }
            context = null;
        }
        optimizedPlanning = new FlightPlanning();
        optimizedPlanning.setGain(optimizedGain);
        String[] pathElements = optimizedPath.split("\\|");
        optimizedPlanning.setPath(Lists.transform(Arrays.asList(pathElements), new Function<String, String>() {
            @Override
            public String apply(String s) {
                return sortedDemands.get(Integer.parseInt(s)).getFlightName();
            }
        }));
        stack = null;
    }

    private Integer determineNextDemandIndex(Integer demandIndex, Integer nextAvailableDeparture) {
        Integer nextDemandIndex = demandIndex + 1;
        Boolean candidateFound = false;
        while (!candidateFound && nextDemandIndex < sortedDemands.size()) {
            candidateFound = sortedDemands.get(nextDemandIndex).getDepartureTime() >= nextAvailableDeparture;
            if (!candidateFound) {
                nextDemandIndex++;
            }
        }
        return nextDemandIndex;
    }

    private class SolvingContext {
        private Integer startTime;
        private Integer demandIndex;
        private Integer gain;
        private String path;

        private SolvingContext(Integer startTime, Integer demandIndex, Integer gain, String path) {
            this.startTime = startTime;
            this.demandIndex = demandIndex;
            this.gain = gain;
            this.path = path;
        }

        public Integer getStartTime() {
            return startTime;
        }

        public Integer getDemandIndex() {
            return demandIndex;
        }

        public Integer getGain() {
            return gain;
        }

        public String getPath() {
            return path;
        }
    }
}
