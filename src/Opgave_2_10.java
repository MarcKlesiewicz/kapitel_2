import java.util.Scanner;

public class Opgave_2_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();

        System.out.println("enter the initial temperature: ");
        double inTemp = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finTemp = input.nextDouble();

        double Q = water * (finTemp - inTemp) * 4184;

        System.out.println("The energy needed is " + Q );
    }
}
