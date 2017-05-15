package Lezione17;

/**
 * Created by nicolo on 08/05/17.
 */
public class DonaldTrump implements Runnable {
    public void run () {
        int i;
        // while (!isInterrupted()) { // non funziona peche' non e' un thread!
        while (!Thread.currentThread().isInterrupted()) {
            for (i=0; i<100000; i++);
            System.out.print("Donald ");
            for (i=0; i<100000; i++);
            System.out.println("Trump");
        }
        System.out.println("BOOM!");
    }
}