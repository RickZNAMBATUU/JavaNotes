import java.util.*;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // multidimensional array
        int distance[][]; // creating an multidimensional array

        // creating a multidimensional array of primitive and initialize them at the same time
        int books[][] = {{132, 32, 34}, {23, 7, 8}, {8,0}};

        // creating number of elements to store in a multidimensional array
        int coordinates[][] = new int[10][10];

        // real application of multidimensional array
        int firstArray[][] = {{5, 8, 12, 65}, {8, 31, 56, 78}, {96, 46, 97, 21}, {64, 54, 72, 66}};
        displayArray(firstArray);

        // to retrieve the elements in an multidimensional array
        // first bracket is the outside curly braces, second bracket is the inside curly braces
        System.out.println(firstArray[2][2]); // 97
    }

    public static void displayArray(int myArray[][]) {
        for (int row = 0; row < myArray.length; row++) {
            for(int column = 0; column < myArray.length; column++) {
                System.out.print(myArray[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
