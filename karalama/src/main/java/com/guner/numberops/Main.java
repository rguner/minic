package com.guner.numberops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            calculateReturn(line);
        }
    }

    private static void calculateReturn(String line) {
        String[] prices = line.split(";");
        float fpp = Float.valueOf(prices[0]);
        float fcp = Float.valueOf(prices[1]);

        float result = fcp - fpp;
        if (result < 0) {
            System.out.println("ERROR");
        } else if (result == 0) {
            System.out.println("ZERO");
        } else {
            result = round(result);
            calculateReturnBillsOrCoins(result);
        }
    }

    private static float round(float value) {
        return Math.round(value * 100.0f) / 100.0f;
    }

    private static void calculateReturnBillsOrCoins(float amount) {
        List<String> result = new ArrayList<>();
        while (amount > 0) {
            if (amount >= 100) {
                result.add("ONE HUNDRED");
                amount = round(amount - 100);
            } else if (amount >= 50) {
                result.add("FIFTY");
                amount = round(amount - 50);
            } else if (amount >= 20) {
                result.add("TWENTY");
                amount = round(amount - 20);
            } else if (amount >= 10) {
                result.add("TEN");
                amount = round(amount - 10);
            } else if (amount >= 5) {
                result.add("FIVE");
                amount = round(amount - 5);
            } else if (amount >= 2) {
                result.add("TWO");
                amount = round(amount - 2);
            } else if (amount >= 1) {
                result.add("ONE");
                amount = round(amount - 1);
            } else if (amount >= 0.5f) {
                result.add("HALF DOLLAR");
                amount = round(amount - 0.5f);
            } else if (amount >= 0.25f) {
                result.add("QUARTER");
                amount = round(amount - 0.25f);
            } else if (amount >= 0.10f) {
                result.add("DIME");
                amount = round(amount - 0.10f);
            } else if (amount >= 0.05f) {
                result.add("NICKEL");
                amount = round(amount - 0.05f);
            } else if (amount >= 0.01f) {
                result.add("PENNY");
                amount = round(amount - 0.01f);
            }
        }
        writeArrayToOutput(result);
    }

    private static void writeArrayToOutput(List<String> result) {

        StringBuilder sb = new StringBuilder();
        result.stream().sorted().forEach(f -> {
            sb.append(f);
            sb.append(",");
        });
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

}
