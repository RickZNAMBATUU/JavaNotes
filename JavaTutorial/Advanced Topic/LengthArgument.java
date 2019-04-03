import java.util.*;

class LengthArgument {
    public static void main(String[] args) {
        // variable length argument like args in python
        // if you don't know how many arguments you'll put in the method
        average("This is the title", 78, 32, 34, 45 , 4, 56, 56 ,54 , 45, 23, 7, 34, 234, 234, 234);
    }

    // create a method
    public static void average(String title, int ... numbers) { // put ellipses before the variable name to indicate that you don't know how many arguments you would like to add
        int total = 0;
        System.out.println(title);
        for (int x: numbers) { // use the argument variable to access all the arguments you passed in
            total += x;
        }
        System.out.print(total/numbers.length);
    }
}
