package Opgaver_til_Kapitel_2;

import java.util.Scanner;

public class Opg_2_1 {
    public static void main(String[] args) {
        System.out.println("2.1");

        double miles;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter miles:");
        miles =  in.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(miles + " miles is " + kilometers + " Kilometers");







    }
}
