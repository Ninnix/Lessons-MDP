package Lezione12;

/**
 * Created by nicolo on 25/04/17.
 */
public class MyLeggibile <E> implements Leggibile {

    private E valore;
    MyLeggibile(E valore) { this.valore = valore; }
    public E get() {
        return valore;
    }
}
