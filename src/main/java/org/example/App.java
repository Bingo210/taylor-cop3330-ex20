/*
 * UCF COP3330 Fall 2021 Assignment 20 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        double tax = 0;

        System.out.println( "What is the order amount?" );
        double orderAmount = input.nextDouble();
        String newline = input.nextLine();
        System.out.println( "What state do you live in?" );
        String state = input.nextLine();
        state = state.toLowerCase();

        if (state.equals("wisconsin")) {
            tax = orderAmount * 0.05;
            System.out.println( "What county do you live in?" );
            String county = input.nextLine();
            county = county.toLowerCase();

            if (county.equals("eau claire")) {
                tax = tax * 1.005;
            }
            else if (county.equals("dunn")) {
                tax = tax * 1.004;
            }
        }
        else if (state.equals("illinois")) {
            tax = orderAmount * 0.08;
        }

        System.out.println("The tax is $" + tax + "\n" +
                "The total is $" + (orderAmount + tax));
    }
}
