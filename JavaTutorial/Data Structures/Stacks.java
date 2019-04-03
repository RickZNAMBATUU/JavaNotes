import java.util.*;

class Stacks {
    public static void main(String[] args) {
        // Stack - data structure that is Last-In-First-Out (LIFO)

        Stack<String> stacks = new Stack<>(); // to create a stacks

        // methods
        // push()
        stacks.push("Fred"); // to add item on stacks
        stacks.push("Lyka");
        stacks.push("Clarence");
        System.out.println(stacks);

        // pop()
        stacks.pop(); // to remove item that is on top of the stacks
        stacks.pop();
        System.out.println(stacks);

        // isEmpty()
        System.out.println(stacks.isEmpty());

    }
}
