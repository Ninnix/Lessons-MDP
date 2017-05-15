package Lezione17;

/**
 * Created by nicolo on 08/05/17.
 */
public class EnricoRossi implements Runnable {
    /*
    simula il meccanismo dell'interrupt
    testando una sua variabile
     */

    private volatile boolean corre = true;
    /*
    deve essere *volatile*, altrimenti questo thread potrebbe non
    accorgersi mai se qualcuno cerca di fermarlo ponendola a false.
     */

    public void run () {
        int i;
        while (corre) {
            for (i=0; i<100000; i++);
            System.out.print("Enrico ");
            for (i=0; i<100000; i++);
            System.out.println("Rossi");
        }
        System.out.println("Addio Maremma!");
    }

    public void fermati () {
        corre = false;
    }
}