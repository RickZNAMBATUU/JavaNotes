public class AnimalList {
    private Animal animalList[] = new Animal[5];
    private int index = 0;

    public void add(Animal animals) {
        if (index < animalList.length){
            animalList[index] = animals;
            System.out.printf("Animal added at index %d\n", index);
            index++;
        }
    }

    public void loopAnimal() {
        for (Animal x: animalList) {
            x.noise();
        }
    }
}
