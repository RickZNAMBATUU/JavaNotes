public class Tester {
    public static void main(String[] args) {
        AnimalList ALO = new AnimalList();

        Dog polgoso = new Dog();
        Fish nemo = new Fish();

        ALO.add(polgoso);
        ALO.add(nemo);
        ALO.loopAnimal();

    }
}
