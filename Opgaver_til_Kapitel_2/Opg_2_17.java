package Opgaver_til_Kapitel_2;

import java.util.Scanner;


public class Opg_2_17 {
    public static void main(String[] args) {
        System.out.println("2.17");

        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F:");
        temperature = in.nextDouble();

        double windSpeed;
        Scanner wi = new Scanner(System.in);

        System.out.println("Enter the wind speed (=> 2) in miles per hour:");
        windSpeed = wi.nextDouble();

        double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        System.out.println("The wind Chill index is " + windChill);







    }
}
