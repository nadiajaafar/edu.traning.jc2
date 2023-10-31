package edu.traning.simple.main;
import java.lang.Math;

public class Main11 {

    public static void main(String[] args) {

        double a = 1.0;
        double b = 2.0;
        double P = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double S = (a * b) / 2;
        System.out.println("P="+P+"\nS="+S);
    }

}
