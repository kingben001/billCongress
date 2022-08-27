package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many representatives are voting for the bill");
        int houseOfReps = keyboard.nextInt();

        if (houseOfReps >= 218) {
            System.out.println("How many senators are voting for the bill");
            int senate = keyboard.nextInt();
            if (senate >= 51) {
                System.out.println(" 1 for yes or 2 for no President?");
                int pres = keyboard.nextInt();
                if (pres == 1) {
                    System.out.println("We have a new bill");
                } else if (pres == 2) {
                    System.out.println("How many representatives are voting for the bill");
                    houseOfReps = keyboard.nextInt();
                    if (houseOfReps >= 290) {
                        System.out.println("How many senators are voting for the bill");
                        senate = keyboard.nextInt();
                        if (senate >= 67) {
                            System.out.println(" 1 for yes or 2 for no President?");
                            pres = keyboard.nextInt();
                            if (pres == 1) {
                                System.out.println("We have a new bill");
                            }
                            System.out.println("This bill wont pass");
                        } else            System.out.println("This bill wont pass");

                    } else            System.out.println("This bill wont pass");

                } else            System.out.println("This bill wont pass");

            }  else            System.out.println("This bill wont pass");

        }                else            System.out.println("This bill wont pass");

    }
}