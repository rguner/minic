package com.guner.designpattern;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CalculatorFinder {
    private static final Map<String, Calculation>
            CALCULATOR_MAP;

    static {
        final Map<String, Calculation> calculations = new HashMap<>();
        calculations.put("add", (a, b) -> a + b);
        calculations.put("subtract", (a, b) -> a - b);
        calculations.put("multiply", (a, b) -> a * b);
        calculations.put("divide", (a, b) -> a / b);

        CALCULATOR_MAP = Collections.unmodifiableMap(calculations);
    }

    public static Calculation getCalculation(String calculation) {
        Calculation calculationType = CALCULATOR_MAP.get(calculation);

        if (calculationType == null) {
            throw new IllegalArgumentException("Invalid calculation type: "
                    + calculation);
        }
        return calculationType;
    }
}
