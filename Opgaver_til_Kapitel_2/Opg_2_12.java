package Opgaver_til_Kapitel_2;

import java.util.Scanner;

public class Opg_2_12 {
    public static void main(String[] args) {
        System.out.println("2.12");

        int v = 60; //speed
        double a = 3.5; //acceleration
        Scanner in = new Scanner(System.in);

        System.out.println("Enter speed and acceleration:");
        v = in.nextInt();
        a = in.nextDouble();

        double length = Math.pow(v, 2)/(2 * a);

        System.out.println( " The minimum runway length for this airplane is " + length);








    }
}
