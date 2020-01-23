import java.util.Scanner;

public class Opgave_2_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        int saveAmount = input.nextInt();

        double monthlyInterestRate = (1 + 0.003125);
        double firstMonth = saveAmount * monthlyInterestRate;
        double secondMonth = (saveAmount + firstMonth) * monthlyInterestRate;
        double thirdMonth = (saveAmount + secondMonth) * monthlyInterestRate;
        double fourthMonth = (saveAmount + thirdMonth) * monthlyInterestRate;
        double fifthMonth = (saveAmount + fourthMonth) * monthlyInterestRate;
        double sixthMonth = (saveAmount + fifthMonth) * monthlyInterestRate;

        System.out.println("After the first month, the account value is " + firstMonth);
        System.out.println("After the second month, the account value is " + secondMonth);
        System.out.println("After the third month, the account value is " + thirdMonth);
        System.out.println("After the fourth month, the account value is " + fourthMonth);
        System.out.println("After the fifth month, the account value is " + fifthMonth);
        System.out.println("After the sixth month, the account value is " + sixthMonth);





    }
}
