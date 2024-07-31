package com.example.financialforecasting;

public class FinancialForecasting {

    // Recursive method to predict future value
    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if years is 0, return the initial value
        if (years == 0) {
            return initialValue;
        }

        // Recursive case: calculate future value for the next year
        double previousYearValue = predictFutureValue(initialValue, growthRate, years - 1);
        return previousYearValue * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% annual growth rate
        int years = 10;

        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.println("Future value after " + years + " years: " + futureValue);
    }
}
