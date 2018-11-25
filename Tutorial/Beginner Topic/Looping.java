import java.util.*;

class Looping {
    public static void main (String[] args) {
        // (Control Structures)
        // // initialization; conditional; change section;

        // // for loop
        // int count = 0;
        // for (int counter = 0; counter < 50; counter++) {
        //     count++;
        //     System.out.println(count + ".) I will achieve my goals soon!! Positive!");
        // }

        // int counter = 0;
        // for (int i = 1; i <= 1800; i+=1) {
        //     if (i % 9 == 0) {
        //         counter++;
        //         System.out.print(counter + ": " + i);
        //     }
        // }

        // // while loop
        // int gameLives = 3;
        // while (gameLives > 0) {
        //     System.out.println("Ouch!");
        //     gameLives = gameLives - 1;
        // } System.out.println("Game Over!");

        // // do-while loop - it will always run once even the condition is false
        // int limit = 5;
        // int count = 6;
        // do {
        //     System.out.println("Gago ako hahaha");
        //     count++;
        // } while (count < limit);

        // // break statement
        // for (int i = 0; i < 20; i++) {
        //     if (i == 10) {
        //         break; // it will stop the loop when the if statement is met
        //     }
        //     System.out.println(i);
        // }

        // // continue statement
        // int index = 0;
        // while (index <= 100) {
        //     index = index + 5;
        //     if (index == 50) {
        //         continue; // it will skip the loop when the condition is met and continue to loop through the main condition
        //     }
        //     System.out.println("The index is " + index);
        // }

        // // nested loop
        // // naming a loop
        // int points = 0;
        // int target = 100;
        // mainLoop:
        // while (true) {
        //     for (int i = 1; i < target; i++) {
        //         if (points > 50) {
        //             break mainLoop; // to indicate what loop will stop looping
        //         }
        //         System.out.println("Points: " + points);
        //         points += 1;
        //     }
        // }

        // // complex loops
        // int i, j;
        // for (i = 0, j = 0; i < 50; i++, j+=2) {
        //     System.out.print(i + " ");
        //     System.out.println(j);
        // }

        // // empty loop section
        // int displayCount = 1;
        // int endValue = 13;
        // int counter = 1;
        // for (; displayCount < endValue; displayCount++, counter++) {
        //     System.out.println(counter + "). MAGIGING SUCCESS AKO!");
        // }

        // // loops through the lists
        // ArrayList<String> myList = new ArrayList<>();
        // myList.add("HONDA");
        // myList.add("BMW");

        // // enhanced for loop (Array/ArrayList)
        // for (String name: myList) { // initialize a variable with the same Object type
        //     System.out.println(name); // use that variable to loop through
        // }

        // // Iterator Object (ArrayList)
        // // methods: hasNext(), next(), remove()
        // Iterator<String> iterate = myList.iterator();
        // while (iterate.hasNext()) {
        //     System.out.println(iterate.next());
        // }

        // // List Iterator Object (ArrayList)
        // // methods: hasNext(), next(), remove(), hasPrevious(), previous(), add())
        // ListIterator<String> li = myList.listIterator();
        // while (li.hasNext()) {
        //     System.out.println(li.next());
        //     System.out.println(li.hasPrevious());
        // }
    }
}
