package Lezione08.Pac0;

/**
 * Created by nikyw on 17/03/2017.
 */
public class FigliMiei {
    public static int NUMEROFIGLI = 0;
    private int nome;

    public FigliMiei() {
        nome = ++NUMEROFIGLI; //incrementa di uno numero figli e dammi il valore corrispondente!
    }

    public void chiSono () {
        System.out.println("Sono "+ nome);
    }
}

//se non specifico la modalità di accesso, ne public ne private ne protected, è package di default cioè accesssibile solo all'interno
//del package

