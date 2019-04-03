// draft

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random dice = new Random(); // to create an instance of Random object
        String names[] = {"Fred", "Lyka", "Florante", "Clarence", "Nacu"};
        int number;

        for (int counter = 1; counter <= 10; counter++) {
            number = 1 + dice.nextInt(6);
            System.out.println("number: " + number);
        }

        // methods of Random Class
        // nextInt()
        dice.nextInt(7); // return a random number ranges from 0 to 6
        System.out.println(names[dice.nextInt(names.length)]);

    }
}
++
