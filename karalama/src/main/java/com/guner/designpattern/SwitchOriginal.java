package com.guner.designpattern;

public class SwitchOriginal {

    public static void main(String[] args) {
        SwitchOriginal switchOriginal = new SwitchOriginal();
        switchOriginal.switchMethod();
        switchOriginal.redesigned1();
        switchOriginal.redesigned2();
    }

    private void switchMethod() {
        String islem = "multiply";
        int param1 = 20;
        int param2 = 10;
        int result;

        switch (islem) {
            case "add":
                System.out.println("Calculation parameters: " + param1 + " " + param2);
                result = param1 + param2;
                break;
            case "subtract":
                System.out.println("Calculation parameters: " + param1 + " " + param2);
                result = param1 - param2;
                break;
            case "multiply":
                System.out.println("Calculation parameters: " + param1 + " " + param2);
                result = param1 * param2;
                break;
            case "divide":
                System.out.println("Calculation parameters: " + param1 + " " + param2);
                result = param1 / param2;
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("Sonuc : " + result);

    }

    private void redesigned1() {
        String islem = "multiply";
        int param1 = 20;
        int param2 = 10;
        int result;

        switch (islem) {
            case "add":
                result = calculate(param1, param2, (a, b) -> a + b);
                break;
            case "subtract":
                result = calculate(param1, param2, (a, b) -> a - b);
                break;
            case "multiply":
                result = calculate(param1, param2, (a, b) -> a * b);
                break;
            case "divide":
                result = calculate(param1, param2, (a, b) -> a / b);
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("Sonuc : " + result);

    }

    private int calculate(int param1, int param2, Calculation calculation) {
        System.out.println("Calculation parameters: " + param1 + " " + param2);
        return calculation.calculate(param1, param2);
    }


    private void redesigned2() {
        String islem = "multiply";
        int param1 = 20;
        int param2 = 10;
        int result;

        System.out.println("Calculation parameters: " + param1 + " " + param2);
        Calculation calculation = CalculatorFinder.getCalculation(islem);
        result = calculation.calculate(param1, param2);
        System.out.println("Sonuc : " + result);

    }

}
