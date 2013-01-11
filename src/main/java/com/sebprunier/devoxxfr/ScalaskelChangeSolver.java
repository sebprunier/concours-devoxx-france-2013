package com.sebprunier.devoxxfr;

import java.util.*;

public class ScalaskelChangeSolver {

    private static final Map<String, Integer> COINS = new HashMap<String, Integer>();

    static {
        COINS.put("Foo", 1);
        COINS.put("Bar", 7);
        COINS.put("Qix", 10);
        COINS.put("Baz", 21);
    }

    private static void calculateSolution(Integer value, String[] coins, Set<Map<String, Integer>> solutions, Map<String, Integer> partialSolution) {
        if (value > 0 && coins.length > 0) {
            String coinName = coins[0];
            Integer coin = COINS.get(coinName);
            Integer quotient = value / coin;
            Integer remainder = value % coin;

            if (remainder == 0) {
                // i got a solution !
                Map<String, Integer> clonedPartialSolution = clonePartialSolution(partialSolution);
                clonedPartialSolution.put(coinName, clonedPartialSolution.get(coinName) + quotient);
                solutions.add(clonedPartialSolution);
            }

            if (coins.length > 1) {
                if (quotient > 0 && remainder != 0) {
                    // this coin is valid, store it in partial solution and continue with it.
                    Map<String, Integer> clonedPartialSolution = clonePartialSolution(partialSolution);
                    clonedPartialSolution.put(coinName, clonedPartialSolution.get(coinName) + 1);
                    calculateSolution(value - coin, coins, solutions, clonedPartialSolution);
                    // this coin is valid, store it in partial solution and continue without it.
                    Map<String, Integer> clonedPartialSolution2 = clonePartialSolution(partialSolution);
                    clonedPartialSolution2.put(coinName, clonedPartialSolution2.get(coinName) + 1);
                    calculateSolution(value - coin, popOneCoin(coins), solutions, clonedPartialSolution2);
                }
                // ignore this coin and try this others
                Map<String, Integer> clonedPartialSolution = clonePartialSolution(partialSolution);
                calculateSolution(value, popOneCoin(coins), solutions, clonedPartialSolution);
            }
        }
    }

    private static String[] popOneCoin(String[] pieces) {
        return new ArrayList<String>(Arrays.asList(pieces)).subList(1, pieces.length).toArray(
                new String[pieces.length - 1]);
    }

    private static Map<String, Integer> clonePartialSolution(Map<String, Integer> partialSolution) {
        Map<String, Integer> clonedPartialSolution = new HashMap<String, Integer>();
        clonedPartialSolution.putAll(partialSolution);
        return clonedPartialSolution;
    }

    private static Map<String, Integer> newPartialSolution() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Foo", 0);
        map.put("Bar", 0);
        map.put("Qix", 0);
        map.put("Baz", 0);
        return map;
    }

    public Set<Map<String, Integer>> solve(Integer value) {
        Set<Map<String, Integer>> solutions = new HashSet<Map<String, Integer>>();
        calculateSolution(value, new String[]{"Baz", "Qix", "Bar", "Foo"}, solutions, newPartialSolution());
        return solutions;
    }
}
