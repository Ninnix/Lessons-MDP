package Lezione18;

/**
 * Created by nicolo on 15/05/17.
 */
public class Ballo { // Dove si incontrano bulli e pupe
    public static final int tempo = 100; // numero massimo di incontri al ballo
    public static SynchroCoda<Pupa> coda = new SynchroCoda<>(); // ...in attesa di bullo
}
