package Lezione2;

/**
 * Created by nikyw on 24/02/2017.
 */
public class Var {
    //tipo di dato astratto
    //implementazione delle variabili

    private int valore = 42; //attributo (private è un modificatore specifica che è privato lo posso vedere solo dentro la classe Var)

    public int leggi () {
        // metodo che legge il valore della variabile
        return valore; //restituisce un valore
    }

    public void assegna (int n) {
        valore = n;
    }
}
