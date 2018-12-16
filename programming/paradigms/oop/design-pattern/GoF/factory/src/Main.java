/**
 * @author Henoc Sese - Open Source Project
 */

/**
 * Class entry point of the program.
 */
public class Main {


    /**
     * Entry point of the program.
     * @param args
     */
    public static void main(String[] args) {

        // Create an instance of the Factory method
        AnimalFactory factory = AnimalFactory.getInstance();

        // Obtain instance of Animal class
        animal.Animal cat = factory.createAnimal(Animal.CAT);
        animal.Animal dog = factory.createAnimal(Animal.DOG);
        animal.Animal wolf = factory.createAnimal(Animal.WOLF);
        animal.Animal bird = factory.createAnimal(Animal.BIRD);

        // Make the animal talk..
        cat.speak();
        dog.speak();
        wolf.speak();
        bird.speak();
    }
}
