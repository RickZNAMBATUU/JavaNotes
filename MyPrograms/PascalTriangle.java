import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {

        static Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        double sumAbove = 0;
        double sumBelow = 0;

        for (int number = 0; number < row; number++) {
            sumAbove += Math.pow(2, number);
        }

        for (int anotherNumber = 0; anotherNumber < row + 2; anotherNumber++) {
            sumBelow = Math.pow(2, anotherNumber);
        }

        System.out.println("The sum of numbers above row: " + row + " is " + (int) sumAbove + ".");
        System.out.println("The sum of numbers in row: " + (row + 1) + " is " + (int) sumBelow + ".");

    }
}
