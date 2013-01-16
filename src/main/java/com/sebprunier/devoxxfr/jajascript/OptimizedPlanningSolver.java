package com.sebprunier.devoxxfr.jajascript;

import java.util.List;

public class OptimizedPlanningSolver {

    private FlightPlanning optimizedPlanning;

    private List<FlightDemand> sortedDemands;

    public OptimizedPlanningSolver(List<FlightDemand> sortedDemands) {
        super();
        this.sortedDemands = sortedDemands;
        this.optimizedPlanning = new FlightPlanning();
    }

    public FlightPlanning getOptimizedPlanning() {
        return optimizedPlanning;
    }

    public void solve() {
        solvePartialPlanning(0, 0, new FlightPlanning());
    }

    private void solvePartialPlanning(Integer startTime, Integer demandIndex, FlightPlanning currentPlanning) {
        if (demandIndex >= sortedDemands.size()) {
            optimizedPlanning = max(optimizedPlanning, currentPlanning);
        } else {
            // Try with next demand
            FlightDemand demand = sortedDemands.get(demandIndex);
            FlightPlanning newFlightPlanning = new FlightPlanning(currentPlanning);
            newFlightPlanning.setGain(newFlightPlanning.getGain() + demand.getPrice());
            newFlightPlanning.getPath().add(demand.getFlightName());
            solvePartialPlanning(startTime + demand.getFlightDuration(),
                    determineNextDemandIndex(demandIndex, demand.getDepartureTime() + demand.getFlightDuration()),
                    newFlightPlanning);
            // Ignore next demand
            solvePartialPlanning(startTime, demandIndex + 1, new FlightPlanning(currentPlanning));
        }
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

    private FlightPlanning max(FlightPlanning p1, FlightPlanning p2) {
        return p1.getGain() > p2.getGain() ? p1 : p2;
    }
}
