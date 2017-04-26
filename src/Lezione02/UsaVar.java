package Lezione02;

/**
 * Created by nikyw on 24/02/2017.
 */
public class UsaVar {
    public static void main(String[] args) {
        // giochiamo con le variabili

        Var v = new Var(); //Costruttore va creare un nuovo oggetto di tipo Var, v è una variabile che contiene un oggetto di tipo Var
        System.out.println(v.leggi());

        v.assegna(77);
        System.out.println(v.leggi());
    }
}
