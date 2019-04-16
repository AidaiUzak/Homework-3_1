package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int temp = 30;
        Random age = new Random();
        for (int i = 1; i < 2; i++) ;
        System.out.println(age.nextInt(107));

        if (age.nextInt() > 20 && age.nextInt() < 45) {
            if (temp > 30 || temp < -20) {
                System.out.println("You can't go out!");
            }
        }
        else if (age.nextInt() < 20) {
            if (temp > 0 && temp < 28) {
                System.out.println("You can't go out!");
            }
        }
        else if (age.nextInt()> 45) {
            if (temp > 25 || temp < -10) {
                System.out.println("You can't go out!");
            }
        }
        else {
            System.out.println("You can visit your friend!");
        }
    }
}