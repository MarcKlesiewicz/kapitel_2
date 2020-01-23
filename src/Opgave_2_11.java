import java.util.Scanner;

public class Opgave_2_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentPopulation = 312032486;

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        int birthPerYear = (((24 * 60) * 60) / 7) * 365 * years;
        int deathPerYear = (((24 * 60) * 60) / 13) * 365 * years;
        int immigrantsPerYear = (((24 * 60) * 60) / 45) * 365 * years;

        System.out.println("The population in " + years + " years is " + (currentPopulation + birthPerYear + immigrantsPerYear - deathPerYear));



    }
}
