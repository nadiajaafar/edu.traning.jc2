package edu.traning.simple.main;
import java.lang.Math;

public class Main17 {
    public static void main(String[] args) {


    double number1 = 2.0;
    double number2 = -5.0;

    double avgArithmetic = (Math.pow(number1, 3) + Math.pow(number2, 3)) / 2;
    double avgGeometric = Math.sqrt(Math.abs(number1) * Math.abs(number2));

        System.out.println(avgArithmetic);
        System.out.println(avgGeometric);
        }
}
