class Abstracts {
    public static void main(String[] args) {
        // abstract class- class that you can't create an instance object. its good only for inheritance and polymorphism
        // concrete class - default class that doesn't have a keyword. you can create an object of a class. ordinary class

        abstract class ThisIsAbstract { // declaring an abstract class
            // abstract classes must not have a constructor
            // because constructor works only when the object of a class is created

            // abstract methods is a method that must overwritten
            // any class that inherits an abstract class with an abstract method must implement/override that method
            // when you create an abstract method, your class should also be an abstract class
            // abstract method are the only method that can have no block in it
            abstract void mustOverride(); // abstract method don't have a block because it will overwritten anyway
        }

        class ExtendsAbstractClass extends ThisIsAbstract {
            @Override
            void mustOverride() { // overwritten method of an inherited abstract class
                System.out.println("I am ExtendsAbstractClass");
            }
        }

        ExtendsAbstractClass myAbstractClass = new ExtendsAbstractClass();
        myAbstractClass.mustOverride();
    }
}
