import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Zero or Negative number is not allowed.");
        } else if (number > 10_000) {
            System.out.println("Number greater than 10,000 is not allowed.");
        } else {
            int total = 0;
            for (int num = 1; num < number; num++) {
                if (number % num == 0) {
                    total += num;
                }
            }

            if (total == number) {
                System.out.println(number + " is a Perfect Number");
            } else {
                System.out.println(number + " is not a Perfect Number");
            }
        }
    }
}
