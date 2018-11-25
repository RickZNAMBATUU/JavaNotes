import java.util.*; // to import hash map

class HashMaps {
    public static void main(String[] args) {
        // It is like Python Dictionary
        // keys and values

        // creating a hashmap with two arguments
        // HashMap phonebook = new HashMap(30, 0.7F); // capacity and load factor
        HashMap<String, Long> phonebook = new HashMap<>(); // creating hashmap with generics

        // methods of the hashmap
        // put()
        phonebook.put("Fred", 63063250657L); // to add keys and values to the hashmap
        phonebook.put("Lyka", 63115034987L);

        // get()
        System.out.println(phonebook.get("Fred")); // to retrieve the value in the hashmap. return null if no key

        // getOrDefault()
        System.out.println(phonebook.getOrDefault("Florante", -1L)); // to retrieve value, return the value of 2nd argument if its not

        // size()
        System.out.println(phonebook.size()); // to return how many items in the hash map

        // containsKey()
        System.out.println(phonebook.containsKey("Lyka")); // return boolean if there is a key

        // containsValue()
        System.out.println(phonebook.containsValue(56546076)); // return boolean if there is a value

        // looping with hashmap
        for (Map.Entry<String, Long> entry: phonebook.entrySet()) {
            String key = entry.getKey(); // to retrieve keys from the hashmap using Map.Entry
            Long value = entry.getValue(); // to retrieve values from the hashmap using Map.Entry
            System.out.println(key + " : " + value);
        }

    }
}
