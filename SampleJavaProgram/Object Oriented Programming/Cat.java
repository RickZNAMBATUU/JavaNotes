class Cat extends Mammal implements Predator, Carnivore {
    private static int numberOfCats;

    // constructor
    Cat() {
        numberOfCats++;
    }

    // return the number of cats whenever the cat objects created
    public static final int getNumberOfCats() {
        return numberOfCats;
    }

    // implement the ordinary method from the super class's abstract method
    @Override
    protected void sayWhatIAm() {
        System.out.println("I am a cat");
        super.sayWhatIAm();
    }

    // implement the super class's abstract methods
    @Override
    void speak() {
        System.out.println("The cat says, \"meow.\"");
    }

    // here's our example of overloading
    void chase(Mouse mouse) {
        // chase a mouse
    }
    public void chase (Object tail) {
        // chase one's tail
    }

    // methods for the Predator interface
    @Override
    public void hunt() {
        // go hunting
    }

    // methods for the Carnivore interface
    @Override
    public void eat (Object freshMeat) {
        // eat fresh meat
    }
}
