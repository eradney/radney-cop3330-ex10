/**
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        double price1, price2, price3, quan1, quan2, quan3, subtotal, tax, total1, total2, total3, grandTotal;
        final double TAXRATE = .055;

        // First Item
        System.out.print("Enter the price of item 1: ");
        price1 = scnr.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        quan1 = scnr.nextDouble();
        total1 = price1 * quan1;

        // Second Item
        System.out.print("Enter the price of item 2: ");
        price2 = scnr.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        quan2 = scnr.nextDouble();
        total2 = price2 * quan2;

        // Third Item
        System.out.print("Enter the price of item 3: ");
        price3 = scnr.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        quan3 = scnr.nextDouble();
        total3 = price3 * quan3;

        // Cost
        subtotal = total1 + total2 + total3;
        tax = subtotal * TAXRATE;
        grandTotal = subtotal + tax;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", grandTotal));

    }
}
