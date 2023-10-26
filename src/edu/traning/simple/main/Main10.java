package edu.traning.simple.main;

public class Main10 {
    public static void main(String[] args) {
        double x;
        double y;

        x = 1.0;

        y= 2.0;

        double v = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))*(Math.tan(x*y));

        System.out.println(v);
    }
}
