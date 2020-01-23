package Opgaver_til_Kapitel_2;

import java.util.Scanner;

public class Opg_2_23 {

    public static void main(String[] args) {
        System.out.println("2.23");


        double distance;
        Scanner dis = new Scanner(System.in);

        System.out.println("Enter driving distance:");
        distance = dis.nextDouble();

        double milesPerGallon;
        Scanner mpg = new Scanner(System.in);

        System.out.println("Enter miles per gallon:");
        milesPerGallon = mpg.nextDouble();

        double pricePerGallon;
        Scanner ppg = new Scanner(System.in);

        System.out.println("Enter price per gallon:");
        pricePerGallon = ppg.nextDouble();

        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving is $" + costOfDriving);



    }
}
