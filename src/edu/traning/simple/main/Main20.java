package edu.traning.simple.main;

public class Main20 {

    public static void main(String[] args){

        double length = 6.00;

        double r = length / (2 * Math.PI);
        double s = Math.PI * r * r;

        System.out.println("Для круга с R = " + r + " длина окружности равна " + length + ", площадь круга равна " + s);
        System.out.println();
    }
}
