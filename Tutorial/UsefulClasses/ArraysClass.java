// draft

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        // Arrays class
        // method of the Arrays class - static method
        // sort()
        String ranking[] = {"Castaneda", "Nacu", "Ralotin", "Roque", "Angala"};
        Arrays.sort(ranking); // sort in alphabetical/numerical order
        for (int counter = 0; counter < ranking.length; counter++) {
            System.out.println(ranking[counter]);
        }

        // binarySearch()
        int myArray[] = {1, 2, 3, 4, 5, 6, 7};
        int indexOfArray = Arrays.binarySearch(myArray, 5); // use to get the index of the value from the array
        System.out.println("\n" + indexOfArray);

        // asList()
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7); // to convert array into list
        list.forEach((i) -> {System.out.print(i);});
    }
}
