package Opgaver_til_Kapitel_2;

import java.util.Scanner;

public class Opg_2_5 {
    public static void main(String[] args) {
        System.out.println("2.5");

        double subtotal;
        double gratuity;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the subtal and a gratuity rate:");
        subtotal = in.nextDouble();
        gratuity = in.nextDouble();

        double gratRate = gratuity / subtotal;

        double total = gratRate + subtotal;

        System.out.println(" The gratuity is " + "$" + gratRate + " and total is " + "$" + total);






    }
}
