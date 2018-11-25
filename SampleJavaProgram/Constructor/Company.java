public class Company {
    String firstName;
    String currentPosition;
    int currentAge;

    public Company() {
        firstName = "Fred";
        currentPosition = "IT";
        currentAge = 20;
        displayName();
    }


    public Company(String name, String position, int age) {
        firstName = name;
        currentPosition = position;
        currentAge = age;
        displayName();
    }

    public void displayName() {
        System.out.println(firstName);
        System.out.println(currentPosition);
        System.out.println(currentAge);
    }
}
