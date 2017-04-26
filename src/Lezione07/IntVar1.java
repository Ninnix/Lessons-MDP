package Lezione07;

/**
 * Created by nikyw on 17/03/2017.
 */
public class IntVar1 implements IntVar {

    // implementa le variabili intere

    private int valore;

    public int leggi () {
        return valore;
    }

    public void scrivi (int valore) {
        this.valore = valore;
    }
}