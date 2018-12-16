import java.util.ArrayList;
import java.util.List;

/**
 * Sample to show how the
 * The concept of immutability allow to ensures the value of variables from the beginning to the end of an operation.
 * There is no mutable state.
 */
public class Immutability {

    public static void main(String[] args) {
        new Immutability();
    }

    /**
     * Constructor
     * By default Array in Java are not mutable so we will use a List and set it mutable.
     */
    public Immutability() {
        // Immutability (without)
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mark");

        names.add("Luke");
        System.out.println("names => "+ names); // output : John, Marc, Luke

        // Immutability
        List<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Mark");

        List<String> newNamesList = new ArrayList<>();
        newNamesList = new ArrayList<>(namesList);
        newNamesList.add("Matthew");

        System.out.println("namesList => "+ namesList); // output : John, Marc
        System.out.println("newNamesList => "+ newNamesList); // output : John, Marc, Matthew
    }
}
