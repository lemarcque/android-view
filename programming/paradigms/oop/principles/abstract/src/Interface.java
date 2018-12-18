public class Interface {

    public static void main(String[] args) {
        new Interface();
    }

    public Interface() {
        // Calling a static method from an Interface
        Mitose.description();

        // Calling an interface with default method implemented
        Alien alien = new Alien();
        alien.reproduire();
    }
}
