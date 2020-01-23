import java.util.Scanner;

public class Opgave_2_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the time zone offset to GMT: ");
        int GMT = input.nextInt();



        long totalMillisecondss = System.currentTimeMillis();

        long totalSeconds = totalMillisecondss / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.println("The current time is " + (currentHour + GMT) + ":" + currentMinutes + ":" + currentSecond);
    }
}
