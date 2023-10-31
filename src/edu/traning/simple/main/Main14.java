package edu.traning.simple.main;
import java.lang.Math;

public class Main14 {

    public static void main(String[] args) {

        int R = 3;
        int P = (int) (Math.PI * (2 * R));
        int S = (int) (Math.PI * Math.pow(R, 2));
        System.out.println("Длина окружности: " + P+" Площадь круга:"+ S);
    }
}
