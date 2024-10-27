package org.example.calculator;

import org.example.calculator.*;

public class Calculator {

    public double add(double a, double b) {
        return Add.calculate(a, b);
    }

    public double subtract(double a, double b) {
        return Sub.calculate(a, b);
    }

    public double multiply(double a, double b) {
        return Mult.calculate(a, b);
    }

    public double divide(double a, double b) {
        return Div.calculate(a, b);
    }

    public double power(double base, double exponent) {
        return Pow.calculate(base, exponent);
    }

    public String toBinary(int number) {
        return Bin.calculate(number);
    }

    public String toHex(int number) {
        return Hex.calculate(number);
    }

    public double tetration(double a, int b) {
        return Tetr.calculate(a, b);
    }
}
