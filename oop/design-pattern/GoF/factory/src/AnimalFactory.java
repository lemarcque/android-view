/**
 * @author Henoc Sese - Open Source Project
 */

import animal.Cat;
import animal.Dog;
import animal.Parrot;
import animal.Wolf;

/**
 * Factory that create Animal objects
 * Singleton object.
 */
public class AnimalFactory {


    private static AnimalFactory instance;

    /**
     * Constructor made private to restrict access outside the classroom
     */
    private AnimalFactory() {}

    /**
     * Method of the Singleton to create a new instance of the factory.
     * @return
     */
    public static AnimalFactory getInstance() {
        if(instance == null) {
            instance = new AnimalFactory();
        }

        return instance;
    }

    /**
     * Create an Animal instance from the animal given in parameters.
     * Enumeration are used to avoid catching Exception
     * @param animal An animal object
     */
    public animal.Animal createAnimal(Animal animal) {
        switch (animal) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case WOLF:
                return new Wolf();
            case BIRD:
                return new Parrot();

                // todo : it is not logic that we return by default an animal ..
                default:
                    return new Cat();
        }
    }
}
