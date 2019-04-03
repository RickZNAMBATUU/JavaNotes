// why to use interface? difference between interface and abstract classes
// cannot extends multiple classes (multiple inheritance)
// but can implements many interfaces
// a class describes the attributes and behaviours of an object, whule interface contains behaviors that a class implements

// when to use interface?
// if you need multiple inheritance and clean blueprint that has only the design and not the implementation

// when to use abstract class?
// if you don't need multiple inheritance but you need a mix of design plan and pre-implementation

// with abstract class, you can declare fields that are not static and final
// and define public, protected, and private concrete methods.
// with interfaces, all fields are automatically public, static and final
// and all methods that you declare or define (as default method) are public

// interfaces are implicitly abstract, don't need to use the abstract keyword
interface MyInterface {
    // a collections of abstract methods
    // may also contain constants, default method, static methods and nested types
    // cannot instantiate, does not contain any constructor like abstract class
    // only static and final fields that interface can contain
    // can extends multiple interfaces unlike abstract classes

    // it must be overwritten by the class implements this, unless the class is abstract so no need to override
    // all methods of interfaces and abstract are set to public (modifier) and abstract so you can omit the keywords
    public void show(); // do not have a method's body unless it is default method
    public default void printIt() {
        System.out.println("It can have a method's body! "); // it doesn't need to implement in the class, you can implicitly use this method
    }
}

interface AnotherInterface extends MyInterface {
    public static final String name = "Fred"; // it is the only allowed fields in interface that has "public static final" as modifier

    // if the class implements an interface that extends another interface, the class must implements the methods of the parent and child interface class
    public void showAgain();
    public void echoSomeText();
}

class Interfaces implements AnotherInterface {
    // when overwritten, it must be in the same signature as the original method
    // you can just not specify the public modifier in the interface and specify the public modifier here at the class
    @Override
    public void showAgain() {
        System.out.println("Show again!");
    }

    @Override
    public void echoSomeText() {
        System.out.println("Show again!");
    }

    @Override
    public void show() {
        System.out.println("Show again!");
    }

    public static void main(String[] args) {
        Interfaces g = new Interfaces();
        g.showAgain();
        g.echoSomeText();
        g.show();
        g.printIt();
    }
}
