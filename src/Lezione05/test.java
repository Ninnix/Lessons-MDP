package Lezione05;

/**
 * Created by nikyw on 06/03/2017.
 */
public class test {

    public static void main(String args[]) {
        /* gioca con l'ereditarietà */

        C1 x = new C1();
        x.ciao("x");
        System.out.println("b = " + x.b);

        x.blah();

        C2 y = new C2();
        y.ciao("y"); // metodo ereditato

        System.out.println(y.quarantadue); //nuovo attributo
        y.blorg(); // nuovo metodo

        y.blah(100); // overloading (nuovo metodo)
        y.blah(); // overriding (metodo ridefinito)
        System.out.println("...perché b = " + y.b);
        y.il_b_di_mio_padre();

        C1 z = new C2();
        z.ciao("z");

        // z.blorg(); // NO!
        // z.blah(100); // NO!
        z.blah();

        System.out.println("... anche se b = " + z.b);
    }
}
