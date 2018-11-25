import java.util.*;

class Inheritance {
    public static void main(String[] args) {
    // inheritance
    // instantiation - creating an object
    // superclass/parent class
    class SuperClass { // creating a class
        String name; // attributes/ instance variable/ member variable
        public void displayingName() { // behavior/ method
            System.out.println("My name is: " + name);
        }
    }

    // subclass/ child class
    class SubClass extends SuperClass { // extends is to inherit what superclass can do
        int age;
        public void displayingAge() {
            System.out.println("Age: " + age);
        }
    }

    SuperClass myObject = new SuperClass(); // creating an object
    myObject.name = "Frederick"; // using the attributes of an object
    myObject.displayingName(); // using the behavior/method of the object

    SubClass newObject = new SubClass();
    newObject.name = "Florante";
    newObject.age = 19;
    newObject.displayingName(); // only public and private methods can subclass inherits from the superclass
    newObject.displayingAge();
    }
}
