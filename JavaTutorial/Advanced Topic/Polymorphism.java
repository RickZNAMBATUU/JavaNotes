import java.util.*;

class Polymorphism {
    public static void main(String[] args) {
        // polymorphism

        class Person {
            private String name;
            private int age;

            // method overloading
            // same method's name, different parameter
            // constructors

            public Person() {
                setName("None");
                setAge(0);

                System.out.println("I don't have name and age yet!");
            }

            public Person(String fullName) {
                setName(fullName);
                setAge(0);

                System.out.printf("My name is %s and I don't have age yet! \n", fullName);
            }

            public Person(String fullName, int currentAge) {
                setName(fullName);
                setAge(currentAge);

                System.out.printf("My name is %s and my age is %d.\n", fullName, currentAge);
            }

            // getter and setter methods
            // encapsulation technique
            // muting method
            public void setName(String fullName) {
                name = fullName;
            }

            public void setAge(int currentAge) {
                age = currentAge;
            }

            // accessor method
            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public void walk() {
                System.out.printf("I am %s, walking!\n", name);
            }
        }

        class Boy extends Person {
            // inheritance technique
            // super - for the objects of a superclass
            // this - it refer to the current object

            public Boy() {
                super(); // it refer to the constructor of the superclass. same argument as the subclass
            }

            public Boy(String fullName) {
                super(fullName);
            }

            public Boy(String fullName, int currentAge) {
                super(fullName, currentAge);
            }

            // method overriding
            // different class but has same method's name, method argument and access modifier
            // it will override the method from the superclass when it will use by the other subclasses

            @Override // annotation - to give your compiler an idea that you really override a method
            public void walk() { // override the method of the superclass
                System.out.println("I am " + super.getName() + ", walking!");
            }
        }

        class Girl extends Boy { // extends Boy with the superclass of Person
            public Girl() {
                super();
            }

            public Girl(String fullName) {
                super(fullName);
            }

            public Girl(String fullName, int currentAge) {
                super(fullName, currentAge);
            }
        }

        Boy firstPerson = new Boy();
        Boy secondPerson = new Boy("Fred");
        Boy thirdPerson = new Boy("Fred", 19);
        System.out.println(firstPerson.getName());
        System.out.println(secondPerson.getName());
        System.out.println(thirdPerson.getName());

        // polymorphic array
        // only the superclass can group different object by their subclass
        Person persons[] = new Person[5]; // to group your subclass objects into one group variable
        persons[0] = new Boy("Fred");
        persons[1] = new Boy("Fred", 19);
        persons[2] = new Girl("Lyka");
        persons[3] = new Girl("Lyka", 18);
        System.out.println(persons[0].getName());
        System.out.println(persons[1].getAge());
        System.out.println(persons[2].getName());
        System.out.println(persons[3].getAge());

        // polymorphic arguments
        // you can pass objects as argument
        // if you passed superclass as argument, subclass can also be passed
        class Action {
            public void whoWalk(Person nameOfObject) {
                nameOfObject.walk();
            }
        }

        Action someAction = new Action();
        someAction.whoWalk(persons[0]);
        someAction.whoWalk(persons[2]);

    }
}
