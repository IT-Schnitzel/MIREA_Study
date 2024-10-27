package org.example;

import com.sun.source.util.SourcePositions;
import org.example.calculator.Calculator;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add 5 3: " + calculator.add(5, 3));
        System.out.println("Sub 5 3: " + calculator.subtract(5, 3));
        System.out.println("Mult 5 3: " + calculator.multiply(5, 3));
        System.out.println("Div 10 2: " + calculator.divide(10, 2));
        System.out.println("Pow 2 3: " + calculator.power(2, 3));
        System.out.println("Bin 10: " + calculator.toBinary(10));
        System.out.println("Hex 225: " + calculator.toHex(225));
        System.out.println("Tetr 2 3: " + calculator.tetration(2, 3));
    }
}


