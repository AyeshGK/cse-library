package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands) {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

//    this part is added by Vinojith
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

//    this part is added by Nipun bro
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

//    this part is added by Ayesh bro
    public static int sumOfIntegers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
