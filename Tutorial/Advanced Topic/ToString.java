import java.util.*;

class ToString {
    // it is like __str__ dunder method in python

    private String name;
    private int birthday;

    public ToString(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;

        System.out.printf("The constructor for this is: %s\n", this);
    }

    // __str__ method in python
    public String toString() {
        return String.format("%s and my birthday is: %d", this.name, this.birthday);
    }

    public static void main(String[] args) {
        ToString firstPerson = new ToString("Fred", 1999);
        System.out.println(firstPerson + " is the new pogi!");
    }
}
