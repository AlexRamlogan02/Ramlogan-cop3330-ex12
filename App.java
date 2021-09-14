package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Simple interest -> A = P(1+rt)
        Scanner scan = new Scanner(System.in);
        double A, P, t, r, percent;
        NumberFormat round = NumberFormat.getCurrencyInstance(); //round in dollar format

        System.out.print("Enter the principle: "); //P
        P= scan.nextDouble();
        System.out.print("Enter the rate of interest: ");//r
        r= scan.nextDouble();
        percent = r/100; //convert to a percentage
        System.out.print("Enter the number of years: "); //t
        t = scan.nextDouble();
        A= P * ( 1 + (percent * t));
        System.out.print("After "+t +" years at " +r +"%, the investment will be "+round.format(A));

    }
}
