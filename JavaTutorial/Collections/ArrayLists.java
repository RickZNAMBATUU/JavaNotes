import java.util.*; // ArrayList class

class ArrayLists {
    public static void main(String[] args) {
        // it is like Python List
        // generics "<Object>"
        ArrayList<String> myList = new ArrayList<String>(); // creating an ArrayList with Variable Object
        ArrayList<String> newList = new ArrayList<String>();

        // to show the list
        System.out.println(myList);

        // methods of the list
        // add()
        myList.add("Fred"); // to add items in the ArrayList
        myList.add("Lyka");
        myList.add("Florante");
        myList.add("Clarence");
        myList.add("Kevin");
        myList.add("Loel");
        myList.add("Ledesma");
        myList.add("Sallan");
        myList.add("Angela");
        myList.add(4, "Nacu"); // to add in the specific location
        
        // newList add method
        newList.add("taena");
        newList.add("GAGO");

        // addAll()
        myList.addAll(4, newList); // to add values of new arraylist in the specific location

        // remove()
        myList.remove(3); // to remove an element in a list with its index
        myList.remove("Clarence"); // to remove an element in a list with the object itself

        // clone()
        ArrayList anotherList = (ArrayList) myList.clone(); // return copy of the existing list
        System.out.println(anotherList);

        // get()
        System.out.println(myList.get(1)); // to retrieve element from the list with the index

        // set()
        myList.set(1, "lokoloko"); // set a new value to the specific index in the list

        // sort()
        Collections.sort(myList); // sort the list based on the data type of the list

        // size()
        System.out.println(myList.size()); // to retrieve the number of elements in a list

        // contains()
        System.out.println(myList.contains("Fred")); //  return boolean, to see if list contains an object in its element

        // indexOf()
        System.out.println(myList.indexOf("Fred")); // it will return the index if arguments is in the list.

        // isEmpty()
        System.out.println(myList.isEmpty()); // return true if there's no element on the list

        // toArray()
        String myArray[] = myList.toArray(new String[myList.size()]); // to convert a list into an array

        // subList()
        System.out.println(myList.subList(1,3)); // list slicing in Python

        // forEach()
        myList.forEach((list) -> {System.out.print(list);}); // list comprehension in Python

        // enhanced for loop for arraylist
        for (String name: myList) { // initialize a variable with the same Object type or primitive type
            System.out.println(name); // use that variable to loop through
        }

        // Iterator Object (ArrayList)
        // methods: hasNext(), next(), remove()
        Iterator<String> iterate = myList.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        // List Iterator Object (ArrayList)
        // methods: hasNext(), next(), remove(), hasPrevious(), previous(), add())
        ListIterator<String> li = myList.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
            System.out.println(li.hasPrevious());
        }

        // retainAll()
        myList.retainAll(newList); // stay all the element that they are the same then remove it

        // removeAll()
        myList.removeAll(newList); // remove all the element that has from the argument list

        // clear()
        myList.clear(); // remove all the elements in the list

    }
}
