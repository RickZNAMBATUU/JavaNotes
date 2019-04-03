class Objects {
    public static void main (String[] args) {
        // instantiation - creating an object
        // superclass
        class SuperClass { // creating a class
            String name; // attributes/ instance variable/ member variable
            public void displayingName() { // behavior/ method
                System.out.println("My name is: " + name);
            }
        }

        // inheritance
        // subclass
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
        newObject.displayingName();
        newObject.displayingAge();

        // object-oriented programming
        class Gremlin extends SubClass {
            // encapsulation
            // the better your objects protect themselves against misuse, the more useful they are

            // access control/ access modifier
            // objects variables
            int minimumAge = 50; // only can be used within the class itself (local variable)
            public int guid = 20; // possible to modify the variable from another program
            protected String creator = "Chris Columbus"; // use only in the same class as the variable
            private int maximumAge = 240; // you can use it only in the same class.

            // accessor method
            // enable the variable to be accessed from other objects even if its private
            public int getMaximumAge() {
                return maximumAge;
            }

            // muting method
            public void setMaximumAge(int newValue) {
                if (newValue > 0) {
                    maximumAge = newValue;
                }
            }

            // class variable or static variable
            // static int gremlinCount = 0; // can use the name of the class rather than the object's name
            // Gremlin.gremlinCount; // static variable

            // class method or static method
            // static void showGremlinCount() { // lines here };
            // Gremlin.showGremlinCount(); // static method // cannot be used by the other program with the object variable

            public Gremlin replicate(String creator) { // use void if the method doesn't return value
                Gremlin noob = new Gremlin();
                noob.creator = "Steven Spielberg";
                return noob;
            }

            // polymorphism
            // method overloading
            // same method's name, different parameter
            void tauntHuman() {
                System.out.println("That has gotta hurt");
            }

            void tauntHuman(String taunt) {
                System.out.println(taunt);
            }

            // method overriding
            // different class but has same method's name, method argument and access modifier
            // it will overide the method from the superclass when it will use by the other subclasses
            @Override // annotation - to give your compiler an idea that you really override a method
            public void displayingAge() { // same method of the superclass (Subclass)
                System.out.println("It will change the behavior of this method of superclass.");
            }
        }

        Gremlin gizmo = new Gremlin();
        gizmo.creator = "Joe Dante";
        System.out.println(gizmo.creator);

        // object constructor
        class Company extends Gremlin {
            String firstName; // declaring instance variable
            String currentPosition;
            int currentAge;

            // methods overloading
            public Company() { // creating a constructor without parameter
                // if you have the constructor of the superclass you need to have the same argument of your class
                super(); // it refer to the constructor of the superclass. same argument as the subclass
                super.displayingAge(); // it refers to the superclass of the object
                this.displayName(); // it refer to the current object
                firstName = "None";
                currentPosition = "None";
                currentAge = 0;

            }

            public Company(String name, String position, int age) { // creating a constructor with parameters
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

        Company employeeOne = new Company(); // object without constructor parameter
        Company employeeTwo = new Company("Frederick", "Programmer", 19); // object with constructor parameter

        // instanceof
        System.out.println(employeeOne instanceof Company); // return boolean if object is an instance of a class

        // == and !=
        System.out.println(employeeOne == employeeTwo); // return true if two object has the same instance of a class
        System.out.println(employeeOne != employeeTwo); // return true if two object has not the same instance of a class
    }
}
