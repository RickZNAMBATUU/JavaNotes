import java.util.*;

class HashSets {
    public static void main(String[] args) {
        // it is like Python Set
        // it doesn't contain a duplicate values

        String[] anythings = {"Fred", "Florante", "Nacu", "Fred", "Clarence"};
        List<String> myList = Arrays.asList(anythings);

        System.out.println(myList);

        HashSet<String> set = new HashSet<String>(myList); // convert from any collection to a set (without duplicate values)
        System.out.println(set);




    }
}
