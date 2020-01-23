package Opgaver_til_Kapitel_2;

import java.util.Scanner;

public class Opg_2_2 {

    public static void main(String[] args) {
        System.out.println("2.2");

        double length;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of the sides and height of the Equilateral triangle:");
        length = in.nextDouble();

        double area = (((Math.sqrt(3))/4) * (Math.pow(length, 2)));

        System.out.println(" The volume of the triangular prism is " + area * length);





    }
}
