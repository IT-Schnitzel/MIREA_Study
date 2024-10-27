package org.example;
import java.util.ArrayList;
import java.util.List;

public class LongArithmetic {
    public static List<Integer> divide(int[] dividend, int divisor) throws Ex {
        List<Integer> result = new ArrayList<>();
        int remainder = 0;
        for (int i = 0; i < dividend.length; i++) {
            int current = remainder*10 + dividend[i];
            int quotient = current / divisor;
            remainder = current % divisor;
            result.add(quotient);
        }
        if (remainder != 0) {
            throw new Ex(remainder, dividend.length-1);
        }
        return result;
    }
    public static int[] stringToDigits(String number) {
        int[] digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';
        }
        return digits;
    }
}
