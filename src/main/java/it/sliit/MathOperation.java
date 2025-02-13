package it.sliit;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int sqrt(int n){
        return  n^2;
    }

    public static double divide(double no1, double no2)
    {
        return no1 / no2;
    }

    public static int multiply(int a, int b){
        return  a * b;
    }

}
