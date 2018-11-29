/**
 * @author Henoc Sese (lemarcque)
 */

/**
 * Starting class of the program
 */
public class InheritanceExample {

    public static void main(String[] args) {
        // Instantiation of an object from class A
        A a = new A();

        // Instantiation of an object from class A
        A b = new B();

        System.out.println("Name : " + a.name); // show : " Name : A"
        System.out.println("Name : " + b.name); // show : " Name : A"
    }
}
