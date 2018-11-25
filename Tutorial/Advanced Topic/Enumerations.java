import java.util.EnumSet; // to access the EnumSet.range() method

public enum Enumerations { // enum is a data type consists of fixed number of constants
    // it doesn't need a modifier
    frederick("Pogi", 1999),
    maryLyka("Ganda", 2000),
    florante("Liit", 2000),
    clarence("Ipis", 1999);

    private final String desc; // variables of their arguments
    private final int year;

    Enumerations(String desc, int year) {
        this.desc = desc;
        this.year = year;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getYear() {
        return this.year;
    }

    public static void main(String[] args) {
        for (Enumerations person: Enumerations.values()) { // built-in enumerations array to loop through
            System.out.printf("%s\t\t%s\t%d\n", person, person.getDesc(), person.getYear());
        }

        // using EnumSet.range() method
        // this method is just for the enum
        // for you to loop specific range of data
        for (Enumerations person: EnumSet.range(Enumerations.maryLyka, Enumerations.florante)) {
            System.out.printf("%s\t\t%s\t%d\n", person, person.getDesc(), person.getYear());
        }

        System.out.println(Enumerations.frederick); // accesing the constant class
        System.out.println(Enumerations.frederick.desc); // accessing the parameter value of the constant class

    }
}
