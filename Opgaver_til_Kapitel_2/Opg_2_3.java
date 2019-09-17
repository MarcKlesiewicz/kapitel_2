package Opgaver_til_Kapitel_2;

import java.util.Scanner;

public class Opg_2_3 {
    public static void main(String[] args) {

        double meter;
        Scanner m = new Scanner(System.in);

        System.out.println("Enter a value for meter:");
        meter = m.nextDouble();

        double feet = meter * 3.2768;

        System.out.println(meter + " meters is " + feet + " feet");





    }


}
