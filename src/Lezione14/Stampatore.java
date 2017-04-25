package Lezione14;

/**
 * Created by nicolo on 21/04/17.
 */
public class Stampatore extends Thread{

    protected final String parola;

    public Stampatore(String parola) {
        this.parola = parola;
    }

    public void run () {
        System.out.println(parola);
    }
}
