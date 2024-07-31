package com.example.financialforecasting;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecastingOptimized {

    // Recursive method with memoization to predict future value
    public static double predictFutureValue(double initialValue, double growthRate, int years, Map<Integer, Double> memo) {
        // Base case: if years is 0, return the initial value
        if (years == 0) {
            return initialValue;
        }

        // Check if the result for the current number of years is already computed
        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        // Recursive case: calculate future value for the next year
        double previousYearValue = predictFutureValue(initialValue, growthRate, years - 1, memo);
        double currentValue = previousYearValue * (1 + growthRate);

        // Store the result in the memoization map
        memo.put(years, currentValue);

        return currentValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% annual growth rate
        int years = 10;

        // Create a memoization map to store intermediate results
        Map<Integer, Double> memo = new HashMap<>();

        double futureValue = predictFutureValue(initialValue, growthRate, years, memo);
        System.out.println("Future value after " + years + " years: " + futureValue);
    }
}
