package edu.traning.simple.main;
import java.lang.Math;


public class Main08 {
    public static void main(String[] args) {

         double a = 0.5;
         double b = 0.8;
         double c = 0.3;
         double d;
         d = (b +Math.sqrt(Math.pow(b, 2)+(4*a*c))/(2*a) - (Math.pow(a, 3)*c)+(Math.pow(b, -2)));

        System.out.println(d);
    }
}
