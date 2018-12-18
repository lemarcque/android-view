public class Alien implements Mitose {

    public void reproduire() {

        System.out.println("Je suis un alien et :");
        Mitose.super.reproduire();
    }

}