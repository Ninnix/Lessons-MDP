package Lezione08.Pac1;

/**
 * Created by nikyw on 17/03/2017.
 */
public class Vertebrato {
    // differenza fra modificatore public e default

    public int vertebre;
    boolean vola; // nessun modificatore di accesso: visibilità ristretta al package

    public Vertebrato (int vertebre, boolean vola) {
        this.vertebre = vertebre;
        this.vola = vola;
    }
}
