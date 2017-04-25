package Lezione7;

/**
 * Created by nikyw on 17/03/2017.
 */
public interface IntVar extends Leggibile, Scrivibile {

    // contratto delle variabili intere

    public int leggi ();
    public void scrivi (int valore);

}