package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        int principal = scanner.nextInt();
        System.out.print("Rate : ");
        float rate = scanner.nextFloat()/100/12;
        System.out.print("Number of Payments : ");
        int payments = scanner.nextInt();
        System.out.println("Mortgage payment : " + NumberFormat.getCurrencyInstance().format(principal *
                ((rate * Math.pow(1+rate, payments))/(Math.pow(1+rate, payments)-1))));
    }
}
