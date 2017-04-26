package Lezione05;

/**
 * Created by nikyw on 06/03/2017.
 */
public class C2 extends C1 {
    /* un'altra classe */

    public int b = 7;
    public int quarantadue = 42;

    public void blorg () {
        System.out.println("BLORG");
    }
    public void blah (int n) {
        System.out.println(n);
    }

    public void blah () {
        System.out.println("a + b = " + (a + b));
    }

    public void il_b_di_mio_padre () {
        System.out.println("attenzione: il super b = " + super.b);
    }
}
//this.b = prende il b di questo, mentre super.b prende quello della classe padre si può invocare super solo all'interno della classe padre
//aprire il blocco dentro il blocco
//in ogni contesto nel quale è richiesto un C1 ci posso mettere un oggetto C2, ma non il contrario
//differenza tra analisi statica (prima di compilare) e dinamica (in fase di compilazione)
