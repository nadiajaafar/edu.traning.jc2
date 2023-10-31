package edu.traning.simple.main;

import java.lang.Math;

public class Main13 {

    public static void main(String[] args) {

        double x1 = 1.0;
        double x2 = 2.0;
        double y1 = 3.0;
        double y2 = 4.0;
        double x3 = 5.0;
        double y3 = 6.0;

        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        double P = a + b + c;
        double p = P / 2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(" S= " + S);
    }
}
