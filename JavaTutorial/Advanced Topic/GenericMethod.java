import java.util.*;

class GenericMethod {
    public static void main(String[] args) {
        // generic methods are able to take any type of data as an argument and doing the same thing no matter what the data is

        Integer numbers[] = {1, 2, 4, 5, 6, 7};
        String names[] = {"Fred", "Lyka", "Clarence", "Florante", "Nacu"};

        int thing = 4;
        String phone = "Iphone";

        printMe(numbers);
        printMe(names);
        anotherPrint(thing);
        anotherPrint(phone);
        anotherPrint(thing, phone);
    }

    public static <T> void printMe(T[] x) { // return any type of arrays
        for (T items : x) {
            System.out.printf("%s ", items);
        }
        System.out.println();
    }

    // overloaded generic method
    public static <T> void anotherPrint(T y) { // return any primitive type of data
        System.out.println(y);
    }

    public static <T> void anotherPrint(T y, T z) { // two argument with unknown data type
        System.out.printf("%s %s", y,z);
    }
}
