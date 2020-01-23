import java.util.Scanner;

public class Opgave_2_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int last = num % 10;
        int second = (num / 10) % 10;
        int first = (num / 100) % 10;

        int sum = (first * second) * last;

        System.out.println("The multiplication of all digits in " + num + " is " + sum);

        System.out.println(last);
        System.out.println(second);
        System.out.println(first);




    }
}
