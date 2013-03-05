package com.sebprunier.devoxxfr.scalaskel;

import java.util.*;

public class ScalaskelChangeSolver {

    private static void calculateSolution(Integer value, Coin coin, Set<Map<Coin, Integer>> solutions,
            Map<Coin, Integer> partialSolution) {
        if (value > 0 && coin != null) {
            Integer coinValue = coin.getValue();
            Integer quotient = value / coinValue;
            Integer remainder = value % coinValue;

            if (remainder == 0) {
                // i got a solution !
                Map<Coin, Integer> clonedPartialSolution = clonePartialSolution(partialSolution);
                clonedPartialSolution.put(coin, clonedPartialSolution.get(coin) + quotient);
                solutions.add(clonedPartialSolution);
            }

            if (quotient > 0) {
                // this coin is valid, store it in partial solution and continue with it.
                Map<Coin, Integer> clonedPartialSolution = clonePartialSolution(partialSolution);
                clonedPartialSolution.put(coin, clonedPartialSolution.get(coin) + 1);
                calculateSolution(value - coinValue, coin, solutions, clonedPartialSolution);
                // this coin is valid, store it in partial solution and continue without it.
                Map<Coin, Integer> clonedPartialSolution2 = clonePartialSolution(partialSolution);
                clonedPartialSolution2.put(coin, clonedPartialSolution2.get(coin) + 1);
                calculateSolution(value - coinValue, nextCoin(coin), solutions, clonedPartialSolution2);
            }
            // ignore this coin and try this others
            Map<Coin, Integer> clonedPartialSolution = clonePartialSolution(partialSolution);
            calculateSolution(value, nextCoin(coin), solutions, clonedPartialSolution);
        }
    }

    private static Coin nextCoin(Coin coin) {
        switch (coin) {
        case BAZ:
            return Coin.QIX;
        case QIX:
            return Coin.BAR;
        case BAR:
            return Coin.FOO;
        case FOO:
            return null;
        default:
            return null;
        }
    }

    private static Map<Coin, Integer> clonePartialSolution(Map<Coin, Integer> partialSolution) {
        Map<Coin, Integer> clonedPartialSolution = new HashMap<Coin, Integer>();
        clonedPartialSolution.putAll(partialSolution);
        return clonedPartialSolution;
    }

    private static Map<Coin, Integer> newPartialSolution() {
        Map<Coin, Integer> map = new HashMap<Coin, Integer>();
        map.put(Coin.FOO, 0);
        map.put(Coin.BAR, 0);
        map.put(Coin.QIX, 0);
        map.put(Coin.BAZ, 0);
        return map;
    }

    public Set<Map<Coin, Integer>> solve(Integer value) {
        Set<Map<Coin, Integer>> solutions = new HashSet<Map<Coin, Integer>>();
        calculateSolution(value, Coin.BAZ, solutions, newPartialSolution());
        return solutions;
    }
}
