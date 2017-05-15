package Lezione17;

/**
 * Created by nicolo on 08/05/17.
 */
public class KimJongUn extends Thread {
    public void run () {
        int i;
        while (!isInterrupted()) {
            for (i=0; i<100000; i++);
            System.out.print("Kim ");
            for (i=0; i<100000; i++);
            System.out.println("JongUn");
        }
        System.out.println("BOOM!");
    }
}

