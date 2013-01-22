package com.sebprunier.devoxxfr.jajascript;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OptimizedPlanningSolver {

    private FlightPlanning optimizedPlanning;

    private List<FlightDemand> demands;

    public OptimizedPlanningSolver(List<FlightDemand> sortedDemands) {
        super();
        this.demands = sortedDemands;
    }

    public FlightPlanning getOptimizedPlanning() {
        return optimizedPlanning;
    }

    public void solve() {
        // Add fictive starting flight
        FlightDemand fictiveFlight = new FlightDemand("##fictive-flight##", -1, 0, 0);
        demands.add(fictiveFlight);

        // Sort demands by departureTime
        Collections.sort(demands, new Comparator<FlightDemand>() {
            @Override
            public int compare(FlightDemand f1, FlightDemand f2) {
                return f1.getDepartureTime().compareTo(f2.getDepartureTime());
            }
        });

        // solve !
        for (int i = demands.size() - 1; i >= 0; i--) {
            FlightDemand currentFlight = demands.get(i);
            Integer nextAvailableDepartureTime = currentFlight.getDepartureTime() + currentFlight.getFlightDuration();
            Integer maxGainForNextPossibleFlight = 0;
            FlightDemand bestNextPossibleFlight = null;
            for (int j = i + 1; j < demands.size(); j++) {
                FlightDemand nextPossibleFlight = demands.get(j);
                if (nextPossibleFlight.getDepartureTime() >= nextAvailableDepartureTime) {
                    if (nextPossibleFlight.getGainForBestNextFlightDemand() > maxGainForNextPossibleFlight) {
                        bestNextPossibleFlight = nextPossibleFlight;
                    }
                }
            }
            currentFlight.setBestNextFlightDemand(bestNextPossibleFlight);
            Integer gainForBestNextFlightDemand = currentFlight.getPrice();
            if (bestNextPossibleFlight != null) {
                gainForBestNextFlightDemand += bestNextPossibleFlight.getGainForBestNextFlightDemand();
            }
            currentFlight.setGainForBestNextFlightDemand(gainForBestNextFlightDemand);
        }

        // make solution
        optimizedPlanning = new FlightPlanning();
        FlightDemand bestFlightDemand = fictiveFlight.getBestNextFlightDemand();
        optimizedPlanning.setGain(bestFlightDemand.getGainForBestNextFlightDemand());
        List<String> bestPath = new ArrayList<String>();
        while (bestFlightDemand != null) {
            bestPath.add(bestFlightDemand.getFlightName());
            bestFlightDemand = bestFlightDemand.getBestNextFlightDemand();
        }
        optimizedPlanning.setPath(bestPath);
    }

}
