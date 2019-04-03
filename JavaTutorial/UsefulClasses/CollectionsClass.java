import java.util.*; // to use Collections Class

class CollectionsClass {
    public static void main(String[] args) {
        // Collection Class
        // Collection Methods can only be apply to any collection (list, arraylist, linked-list, etc.)

        // Convert first arrays with any collection to use the class
        // only collections can use this class
        String things[] = {"Fred", "Lyka", "Florante", "Nacu", "Clarence"};
        List<String> myList = Arrays.asList(things);
        String anotherThings[] = new String[things.length];
        List<String> anotherList = Arrays.asList(anotherThings);

        // methods of the Collections Class - static methods
        // no need to declare a variable because the methods of Collections Class are returning a new value of the collection

        // Collections.sort()
        Collections.sort(myList); // it sorts the collection as default (ascending order) if not specify
        System.out.println(myList);

        // Collections.reversedOrder()
        Collections.sort(myList, Collections.reverseOrder()); // to sort it in reverse order
        System.out.println(myList);

        // Collections.reverse()
        Collections.reverse(myList); // to reverse a collection in any order it has
        System.out.println(myList);

        // Collections.copy()
        Collections.copy(anotherList, myList); // to copy the elements of another collection
        System.out.printf("This is another copy: %s\n", anotherList);

        // Collections.fill()
        Collections.fill(myList, "Changed");
        System.out.printf("After filling another elements: %s", myList);

        // Collections.frequency()
        System.out.println("\n" + Collections.frequency(myList, "Change")); // return how many times appear the specific value from the collection

        // Collection.disjoint()
        System.out.println(Collections.disjoint(myList, anotherList)); // return boolean false if the 2 collection has an element in common, true if not
    }
}
