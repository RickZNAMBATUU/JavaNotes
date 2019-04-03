import java.util.*;

class Queue {
    public static void main(String[] args) {
        // Priority Queue - a data structure that is Firs-In-First-Out (FIFO)

        PriorityQueue<String> queue = new PriorityQueue<>();

        // methods
        // offer()
        queue.offer("Fred"); // to add item on the queue in ascending order
        queue.offer("Florante");
        queue.offer("Clarence");
        System.out.println(queue);

        // peek()
        System.out.println(queue.peek()); // to return the first element on the queue

        // poll()
        queue.poll(); // to remove the first element on the queue
        System.out.println(queue);


    }
}
