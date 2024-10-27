package org.example;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        try {
            boolean zero = true;
            String dividendStr = "2000";
            int divisor = 13;
            //System.out.println(2000%13);
            int[] dividend = LongArithmetic.stringToDigits(dividendStr);
            //System.out.println(dividend[0]);
            //System.out.println(dividend[1]);
            var result = LongArithmetic.divide(dividend, divisor);
            System.out.print("Result: ");
            for (int digit : result) {
                if (zero == true){
                    if ((int)digit != 0){
                        zero = false;
                        System.out.print(digit);
                    }
                }
                else {
                    System.out.print(digit);
                }
            }
            System.out.println();
        } catch (Ex e) {
            System.out.println(e.getRem());
        } catch (ArithmeticException a){
            System.out.println("Div by zero");
        }
    }
}


