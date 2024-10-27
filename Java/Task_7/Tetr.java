package org.example.calculator;

public class Tetr {
    public static double calculate(double a, int b) {
        if (b < 1) return 1;
        double result = a;
        for (int i = 1; i < b; i++) {
            result = Math.pow(a, result);
        }
        return result;
    }
}
