package Opgaver_til_Kapitel_2;

import java.util.Scanner;

public class Opg_2_4 {
    public static void main(String[] args) {
        System.out.println("2.4");

        double square;
        Scanner sqr = new Scanner(System.in);

        System.out.println("Enter a number in square meters;");
        square = sqr.nextDouble();

        double ping = square * 0.3025;

        System.out.println(square + " square meters is " + ping + " pings");


    }
}
