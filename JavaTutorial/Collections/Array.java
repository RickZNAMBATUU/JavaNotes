import java.util.*;

class Array {
    public static void main (String[] args) {
        // better to use Primitive Object if you will create an Arrays for you to conver it as any of the collections
        // creating an array
        String[] students; // array of string
        int[] numbers; // array of String
        boolean[] quizzes;
        Float[] bankMoney; // array of Float Object

        // another way of creating an array
        String addresses[];
        int averages[];
        Integer laces[];

        // creating an array of object and initialize them at the same time
        Integer[] comp = {5, 3, 3, 6, 7};

        // creating an array of primitive and initialize them at the same time
        int grades[] = {5, 2, 6, 1, 3, 6, 2, 1, 3, 3};

        // creating number of elements to store in an array of primitive and initializing of elements
        int[] phones = new int[4];
        phones[0] = 4;
        phones[3] = 7;

        // another way to initialize elements in array of primitive
        String cars[] = new String[3];
        cars[0] = "Ferrari";
        cars[1] = "BMW";
        cars[2] = "Lamborghini";

        // creating number of elements to store in an array object and initializing of elements
        Integer[] money = new Integer[3];
        money[0] = new Integer(5);
        money[1] = new Integer(6);
        money[2] = new Integer(7);

        // another way to initialize elements in array object
        Float skills[] = new Float[5];
        skills[0] = new Float(6.5);
        skills[3] = new Float(2);

        // to retrieve the elements in an array
        System.out.println(cars[1]);

        // methods of an array
        // length
        String names[] = {"Fred", "Florante", "Nacu", "Hakdog"};
        System.out.println(names.length); // to return the number of elements in an array

        // toCharArray()
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letter[] = alphabet.toCharArray(); // to convert sring to char array
        for (int counter = 0; counter < letter.length; counter++) {
            System.out.print(letter[counter] + " ");
        }

        // enhanced for loop for array
        for (int gr: grades) { // initialize a variable with the same Object type or primitive type
            System.out.print(gr); // use that variable name to loop through
        }

        // creating array of the class itself
        // polymorphic array
        // group instance objects into an array
        class Homepage {
            String firstName;
            String currentAddress;
            public Homepage(String name, String address) {
                firstName = name;
                currentAddress = address;
            }
        }

        Homepage homepageList[] = new Homepage[2];
        homepageList[0] = new Homepage("Fred", "Pasig City");
        homepageList[1] = new Homepage("Lyka", "Antipolo City");

        System.out.println("\n" + homepageList[1].firstName);

    }
}
