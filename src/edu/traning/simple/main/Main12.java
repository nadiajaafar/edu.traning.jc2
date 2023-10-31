package edu.traning.simple.main;

import java.lang.Math;

public class Main12 {

    public static void main(String[] args) {

        double x1 = 1.0;
        double x2 = 2.0;
        double y1 = 3.0;
        double y2 = 4.0;
        double S = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Расстояние: " + S);
    }
}
