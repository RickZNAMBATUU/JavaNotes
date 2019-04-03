// draft

import java.util.*;

public class ArraysClass {
    public static void main(String[] args) {
        // Arrays class
        Integer myArray[] = {1, 2, 3, 4, 5, 6, 7};

        // method of the Arrays class - static method
        // Arrays.sort()
        Arrays.sort(myArray); // sort in alphabetical/numerical order
        for (int item : myArray) {
            System.out.printf("%d, ", item);
        }

        // Arrays.binarySearch()
        System.out.println(Arrays.binarySearch(myArray, 5)); // use to get the index of the value from the array

        // Arrays.asList()
        List<Integer> list = Arrays.asList(myArray); // to convert array into list
        list.forEach((i) -> {System.out.print(i);});
    }
}
