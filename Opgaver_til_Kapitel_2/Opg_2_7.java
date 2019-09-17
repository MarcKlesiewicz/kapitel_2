package Opgaver_til_Kapitel_2;

import java.util.Scanner;

public class Opg_2_7 {
    public static void main(String[] args) {
        System.out.println("2.7");

        int minutes;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        minutes = in.nextInt();

        int days = minutes / 1440;

        int years = days / 365;

        System.out.println(years);

    }
}
