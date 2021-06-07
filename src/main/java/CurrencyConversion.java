/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // euros to u.s. dollar

        // get amount of euros
        System.out.print("How many euros are you exchanging?");
        int euros = scanner.nextInt();

        // get conversion rate
        System.out.print("What is the current conversion rate?");
        double conversionRate = scanner.nextDouble();

        // do the math
        double dollar;

        dollar = euros * conversionRate;

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        // single output statement
        System.out.println(euros + " euros at an exchange rate of " + conversionRate + " is " + df.format(dollar) + " U.S. dollars.");



    }
}
