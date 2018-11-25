import java.util.*;

class Constructors {
    private String firstName;
    private String currentSchool;
    private int currentAge;

    public Constructors () {
        this("", "", 0);
    }

    public Constructors (String name) {
        this(name, "", 0);
    }

    public Constructors (String name, String school) {
        this(name, school, 0);
    }

    public Constructors (String name, String school, int age) {
        displayInfo(name, school, age);
    }

    public void displayInfo(String name, String school, int age) {
        System.out.println(name);
        System.out.println(school);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Constructors fred = new Constructors();
        Constructors lyka = new Constructors("Lyka", "Engineer", 18);
    }
}
