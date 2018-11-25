// draft
// search for Scanner Class
import java.util.Scanner; // import to use the Scanner

class ScannerClass {
    public static void main (String[] args) {
        // to ask an input from a user
    	Scanner userInp = new Scanner(System.in); // create object name for the scanner
    	double first_number, second_number, sum;
    	System.out.print("Enter first number: ");
    	first_number = userInp.nextDouble(); // to use the scanner, use nextDouble method if the variables are in double
    	System.out.print("Enter second number: ");
    	second_number = userInp.nextDouble();
    	sum = first_number + second_number;
    	System.out.println("The sum of two numbers is: " + (int) (sum));

    }
}
