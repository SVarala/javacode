package com.Sample;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random numBox = new Random();

        for (int count = 1; count <= 10; count++) {
            int number = numBox.nextInt(6);
            System.out.println(number);
        }
    }
}